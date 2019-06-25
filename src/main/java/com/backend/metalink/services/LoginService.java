package com.backend.metalink.services;

import javax.ws.rs.core.Response;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.backend.metalink.controller.LoginController;
import com.backend.metalink.model.MetaLinkAdmin;
import com.backend.metalink.model.MetaLinkUser;


@RestController
public class LoginService {

	
	@Autowired
	private  LoginController controller;
	
	
	@PostMapping(value = "/adminLogin")
    public Response login(@RequestBody MetaLinkAdmin admin) {
        return Response.status(Response.Status.OK).entity(controller.checkValidAdmin(admin)).build();
    }
	
	
	@PostMapping(value = "/userLogin")
    public Response userLogin(@RequestBody MetaLinkUser user) {
        return Response.status(Response.Status.OK).entity(controller.checkValidUser(user)).build();
    }
	
	
	}
