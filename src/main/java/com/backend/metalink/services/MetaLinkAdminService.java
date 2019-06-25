package com.backend.metalink.services;

import com.backend.metalink.controller.MetaLinkAdminController;
import com.backend.metalink.controller.MetalinkUserController;
import com.backend.metalink.model.MetaLinkAdmin;
import com.backend.metalink.model.MetaLinkUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.ws.rs.core.Response;

@RestController
public class MetaLinkAdminService {

    @Autowired
    private MetaLinkAdminController controller;
    

//    @PostMapping(value = "/adminLogin")
//    public Response login(@RequestBody MetaLinkAdmin admin) {
//        return Response.status(Response.Status.OK).entity(controller.checkValidUser(admin)).build();
//    }
//    
  

    @PostMapping(value = "/addUser")
    public Response testing(@RequestBody MetaLinkUser user) {
        System.out.println(user.getFirstname());
        controller.addUser(user);
        return Response.status(Response.Status.OK).build();
    }

    @GetMapping(value = "/getAllUser")
    public List<MetaLinkUser> getAllUser(){
        return controller.getAllUser();
    }

}
