package com.backend.metalink.controller;

import com.backend.metalink.dao.MetaLinkAdminDao;
import com.backend.metalink.model.MetaLinkAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MetaLinkAdminController {

    @Autowired
    private MetaLinkAdminDao dao;

    public void setDummyUser(MetaLinkAdmin admin) {
        dao.save(admin);
    }

    public boolean checkValidUser(MetaLinkAdmin admin) {

        MetaLinkAdmin testadmin = new MetaLinkAdmin();
        testadmin.setUsername("test");
        testadmin.setPassword("test");
        dao.save(testadmin);


        List<MetaLinkAdmin> users = dao.findByPasswordAndUsername(admin.getPassword(), admin.getUsername());
        System.out.println("Is user valid " +(users.size()>0));
        return users.size() > 0;

    }
}
