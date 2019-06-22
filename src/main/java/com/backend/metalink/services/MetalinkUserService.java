package com.backend.metalink.services;


import com.backend.metalink.controller.MetalinkUserController;
import com.backend.metalink.model.MetaLinkUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.Response;
import java.util.HashMap;
import java.util.List;


@RestController
public class MetalinkUserService {

    @Autowired
    private MetalinkUserController metalinkUserController;

    @PostMapping(value = "/addUser")
    public Response testing(@RequestBody MetaLinkUser user) {
        System.out.println(user.getFirstname());
        metalinkUserController.addUser(user);
        return Response.status(Response.Status.OK).build();
    }

    @GetMapping(value = "/getAllUser")
    public List<MetaLinkUser> getAllUser(){
        return metalinkUserController.getAllUser();
    }
}
