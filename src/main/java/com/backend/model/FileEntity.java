package com.backend.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.util.Date;

@Entity
public class FileEntity {

    @Id
    @GeneratedValue
    private int fileid;
    private String fileName;
    private Date uploadDate;
    @Lob
    private byte[] data;

    public int getFileid() {
        return fileid;
    }

    public FileEntity setFileid(int fileid) {
        this.fileid = fileid;
        return this;
    }

    public String getFileName() {
        return fileName;
    }

    public FileEntity setFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public FileEntity setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
        return this;
    }

    public byte[] getData() {
        return data;
    }

    public FileEntity setData(byte[] data) {
        this.data = data;
        return this;
    }
}
