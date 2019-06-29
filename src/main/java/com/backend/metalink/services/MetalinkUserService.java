package com.backend.metalink.services;


import com.backend.metalink.controller.MetalinkUserController;
import com.backend.metalink.model.MetaLinkUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.core.Response;
import java.util.Map;


@RestController
public class MetalinkUserService {

    @Autowired
    private MetalinkUserController metalinkUserController;
//
//    @PostMapping(value = "/addUser")
//    public Response testing(@RequestBody MetaLinkUser user) {
//        System.out.println(user.getFirstname());
//        metalinkUserController.addUser(user);
//        return Response.status(Response.Status.OK).build();
//    }
//
//    @GetMapping(value = "/getAllUser")
//    public List<MetaLinkUser> getAllUser(){
//        return metalinkUserController.getAllUser();
//    }
	
	//userAddOrDelete
	
	  @PostMapping(value = "/userAddOrDelete")
    public Response testing(@RequestBody MetaLinkUser user) {
        System.out.println(user.getFirstname());
        metalinkUserController.addUser(user);
        return Response.status(Response.Status.OK).build();
    }

    @PatchMapping(value = "/updatePassword")
    // public Response updatePassword(@RequestParam("oldpassword") String oldpassword, @RequestParam("newpassword") String newpassword) {
    public Response updatePassword(@RequestBody Map<String, String> request) {
        System.out.println(request);
        final int userId = Integer.parseInt(request.get("id"));
        String newPassWord = request.get("newpassword");
        String oldPassWord = request.get("oldpassword");

        MetaLinkUser user = metalinkUserController.updatePassword(userId, newPassWord, oldPassWord);
        return Response.status(Response.Status.OK).entity(user).build();
    }


}
