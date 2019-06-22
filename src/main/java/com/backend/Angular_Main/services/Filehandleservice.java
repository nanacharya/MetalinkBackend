package com.backend.Angular_Main.services;


import com.backend.Angular_Main.controller.ProfileDataController;
import com.backend.Angular_Main.dao.FileHandleDao;
import com.backend.Angular_Main.dao.ProfileDataDao;
import com.backend.Angular_Main.model.FileEntity;
import com.backend.Angular_Main.model.ProfileData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.inject.Inject;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.*;

@RestController
@ResponseStatus(HttpStatus.OK)
public class Filehandleservice {

    @Inject
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
        return profileDataController.saveFileToDataBase(file, profileData);
    }


    @GetMapping(value = "api/getSingleProfile/{id}")
    public ProfileData getSingleProfile(@PathVariable("id") int id) {
        return profileDataController.getProfile(id);

    }


    @GetMapping(value = "api/downloadProfile/{id}")
    public @ResponseBody byte[] downloadProfile(@PathVariable("id") int id) {
        return profileDataController.getImagepdf();
    }


    @GetMapping(value = "api/downloadExcel/{id}")
    public @ResponseBody byte[] downLoadExcel(@PathVariable("id") int id) {
        return profileDataController.getExcelSheet(id);
    }


//    @GetMapping(value = "api/downloadProfile/{id}")
//    @Produces("application/pdf")
//    public Response downloadProfile(@PathVariable("id") int id) {
//        byte[] byteData = profileDataController.getImagepdf();
//        return Response.status(Response.Status.OK).entity(byteData).build();
//    }

    @GetMapping(value = "api/showProfilePdf/{id}")
    @Produces("application/pdf")
    public Response showProfilePdf(@PathVariable("id") int id) {
        byte[] byteData = profileDataController.getImagepdf();
        String base64Data = Base64.getEncoder().encodeToString(byteData);
        return Response.status(Response.Status.OK).entity(base64Data).build();
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
