package com.backend.controller;

import com.backend.dao.ProfileDataDao;
import com.backend.model.ProfileData;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class ProfileDataController {
    @Autowired
    private ProfileDataDao dao;

    public ProfileData saveFileToDataBase(MultipartFile file, String profileData) throws IOException {
        ProfileData pd = new ObjectMapper().readValue(profileData, ProfileData.class);
        pd.setFileName(file.getOriginalFilename());
        pd.setContentType(file.getContentType());
        pd.setImage(file.getBytes());

        dao.save(pd);

        ProfileData retriveData = dao.findById(pd.getProfileId()).get();
        return retriveData;

    }

    public List<ProfileData> getAllProfiles() {
        List<ProfileData> lis = new ArrayList<>();
        dao.findAll().forEach(profileData -> {
            lis.add(profileData);
        });
        return lis;
    }

    public ProfileData getProfile(int id) {
        return dao.findById(id).get();
    }

    public byte[] getImagepdf() {

        File file = new File("C:\\Users\\GHASJ\\DevelopmentMine\\MetalinkBackend\\src\\main\\resources\\docs\\simple.pdf");
        return getBytesFromFile(file);
    }

    public byte[] getExcelSheet(int id) {

        File file = new File("C:\\Users\\GHASJ\\DevelopmentMine\\MetalinkBackend\\src\\main\\resources\\docs\\simple.xlsx");
        return getBytesFromFile(file);

    }

    private byte[] getBytesFromFile(File file) {
        byte[] byteArray = new byte[(int) file.length()];
        try {
            FileInputStream inputStream = new FileInputStream(file);
            inputStream.read(byteArray);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return byteArray;
    }
}
