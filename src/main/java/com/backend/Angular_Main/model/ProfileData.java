package com.backend.Angular_Main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class ProfileData {

    @Id
    @GeneratedValue
    private  int profileId;
    private String name;
    private String email;
    private String dob;
    @Lob
    private byte[] image;
    private String fileName;
    private String contentType;

    public String getFileName() {
        return fileName;
    }

    public ProfileData setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public String getContentType() {
        return contentType;
    }

    public ProfileData setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public int getProfileId() {
        return profileId;
    }

    public ProfileData setProfileId(int profileId) {
        this.profileId = profileId;
        return this;
    }

    public String getName() {
        return name;
    }

    public ProfileData setName(String name) {
        this.name = name;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public ProfileData setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getDob() {
        return dob;
    }

    public ProfileData setDob(String dob) {
        this.dob = dob;
        return this;
    }

    public byte[] getImage() {
        return image;
    }

    public ProfileData setImage(byte[] image) {
        this.image = image;
        return this;
    }
}
