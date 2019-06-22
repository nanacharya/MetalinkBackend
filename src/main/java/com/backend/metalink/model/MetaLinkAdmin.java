package com.backend.metalink.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class MetaLinkAdmin {

    @Id
    @GeneratedValue
    private int userId;
    private String username;
    private String password;

    public int getUserId() {
        return userId;
    }

    public MetaLinkAdmin setUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public MetaLinkAdmin setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public MetaLinkAdmin setPassword(String password) {
        this.password = password;
        return this;
    }
}
