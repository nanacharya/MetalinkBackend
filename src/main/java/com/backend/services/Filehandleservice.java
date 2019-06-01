package com.backend.services;


import com.backend.controller.ProfileDataController;
import com.backend.dao.FileHandleDao;
import com.backend.dao.ProfileDataDao;
import com.backend.model.FileEntity;
import com.backend.model.ProfileData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.*;

@RestController
@ResponseStatus(HttpStatus.OK)
public class Filehandleservice {

    @Autowired
    private FileHandleDao fileHandleDao;
    @Autowired
    private ProfileDataDao profileDataDao;
    @Autowired
    private ProfileDataController profileDataController;

    @GetMapping(value = "api/file")
    public Map<String, String> test() {
        HashMap<String, String> map = new HashMap<>();
        map.put("key", "value");
        map.put("foo", "bar");
        map.put("aa", "bb");
        return map;
    }


    @PostMapping(value = "api/submitProfileData")
    @ResponseBody
    public Map<String, String> submitProfile(@RequestBody ProfileData profileData) {

        profileDataDao.save(profileData);

        System.out.println(profileData.getDob());
        HashMap<String, String> map = new HashMap<>();
        map.put("key", profileData.getDob());
        map.put("foo", profileData.getEmail());
        map.put("aa", "good");
        return map;

    }

    @PostMapping(value = "api/submitProfileDataWithImage")
    @ResponseBody
    public ProfileData submitProfileWithImg(@RequestParam("file") MultipartFile file, @RequestParam("data") String profileData) throws IOException {
        ProfileData pd = profileDataController.saveFileToDataBase(file, profileData);
        HashMap<String, String> map = new HashMap<>();
        map.put("aa", "good");
        return pd;
    }

    @GetMapping(value = "api/getAllProfile")
    public List<ProfileData> getAllProfile(){
        return profileDataController.getAllProfiles();
    }
    @GetMapping(value = "api/getData")
    public Optional<FileEntity> getFiles() {
        FileEntity entity;

            entity = new FileEntity();

            entity.setFileName("abcd");
            entity.setUploadDate(new Date());
            entity.setData(convertData());

            fileHandleDao.save(entity);


        return fileHandleDao.findById(1);
    }

    private byte[] convertData() {

        String s = "ddfdfdd";
        return s.getBytes();

    }
}
