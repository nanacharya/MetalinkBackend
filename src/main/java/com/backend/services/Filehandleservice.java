package com.backend.services;


import com.backend.dao.FileHandleDao;
import com.backend.model.FileEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Optional;

@RestController
public class Filehandleservice {

    @Autowired
    private FileHandleDao fileHandleDao;

    @GetMapping(value = "/file")
    public String test() {
        return "looks good";
    }

    @GetMapping(value = "/getData")
    public Optional<FileEntity> getFiles() {
        FileEntity entity;

            entity = new FileEntity();

            entity.setFileName("abcd");
            entity.setUploadDate(new Date());
            entity.setData(convertData());

            //testing for 500 times
            fileHandleDao.save(entity);


        return fileHandleDao.findById(1);
    }

    private byte[] convertData() {

        String s = "ddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfd" +
                "dfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfd" +
                "dfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddf" +
                "dfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfdd" +
                "fdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfd" +
                "fddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdf" +
                "ddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfdd" +
                "fdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddf" +
                "dfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfd" +
                "fddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdfddfdf" + "//z/z///////////////////////?????????????????????????????????????????????????????????????????????????????????????";

        return s.getBytes();

    }
}
