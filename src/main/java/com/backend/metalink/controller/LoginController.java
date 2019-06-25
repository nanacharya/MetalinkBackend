package com.backend.metalink.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.backend.metalink.dao.MetaLinkAdminDao;
import com.backend.metalink.dao.MetaLinkUserDao;
import com.backend.metalink.model.MetaLinkAdmin;
import com.backend.metalink.model.MetaLinkUser;

@Component
public class LoginController {

	@Autowired
	private MetaLinkAdminDao dao;

	@Autowired
	private MetaLinkUserDao userDao;

	public MetaLinkAdmin checkValidAdmin(MetaLinkAdmin admin) {

		MetaLinkAdmin testadmin = new MetaLinkAdmin();
		testadmin.setUsername("test");
		testadmin.setPassword("test");
		testadmin.setFirstname("Narayan");
		testadmin.setLastname("Acharya");
		dao.save(testadmin);

		MetaLinkAdmin users = dao.findByPasswordAndUsername(admin.getPassword(), admin.getUsername());

		return users;

	}

	public MetaLinkUser checkValidUser(MetaLinkUser user) {

		MetaLinkUser users = userDao.findByPasswordAndUsername(user.getPassword(), user.getUsername());

		return users;

	}

}
