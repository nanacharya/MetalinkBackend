package com.backend.metalink.controller;


import com.backend.metalink.dao.MetaLinkUserDao;
import com.backend.metalink.model.MetaLinkUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MetalinkUserController {

    @Autowired
    private MetaLinkUserDao dao;

    public void addUser(MetaLinkUser user) {
        dao.save(user);
    }

    public List<MetaLinkUser> getAllUser() {
        List<MetaLinkUser> users = new ArrayList<>();
        addDummyUser();
        dao.findAll().forEach(users::add);
        return users;
    }

    private void addDummyUser() {

        for (int i = 10; i < 20; i++) {
            MetaLinkUser user = new MetaLinkUser();
            user.setFirstname("fname " + i);
            user.setLastname("lastname " + i);
            user.setDob(i+"/"+i+"/"+"200"+i);
            user.setZip(i + "676" + i);
            user.setMonthlysalary(String.valueOf(i * 5000));
            dao.save(user);
        }


    }


    public MetaLinkUser updatePassword(int userId, String newPassWord, String oldPassWord) {
        MetaLinkUser user = dao.findById(userId).get();
        if (user.getPassword().equals(oldPassWord)) {
            user.setPassword(newPassWord);
            dao.save(user);
        }
        return user;
    }
}
