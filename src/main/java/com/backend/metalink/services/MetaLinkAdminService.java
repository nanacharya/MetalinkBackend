package com.backend.metalink.services;

import com.backend.metalink.controller.MetaLinkAdminController;
import com.backend.metalink.model.MetaLinkAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.Response;

@RestController
public class MetaLinkAdminService {

    @Autowired
    private MetaLinkAdminController controller;

    @PostMapping(value = "/login")
    public Response login(@RequestBody MetaLinkAdmin admin) {
        return Response.status(Response.Status.OK).entity(controller.checkValidUser(admin)).build();
    }

}
