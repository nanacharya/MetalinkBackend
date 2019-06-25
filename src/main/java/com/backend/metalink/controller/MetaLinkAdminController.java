package com.backend.metalink.controller;

import com.backend.metalink.dao.MetaLinkAdminDao;
import com.backend.metalink.dao.MetaLinkUserDao;
import com.backend.metalink.model.MetaLinkAdmin;
import com.backend.metalink.model.MetaLinkUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MetaLinkAdminController {

	@Autowired
	private MetaLinkAdminDao dao;

	@Autowired
	private MetaLinkUserDao userDao;

	public void setDummyUser(MetaLinkAdmin admin) {
		dao.save(admin);
	}

	public MetaLinkAdmin checkValidUser(MetaLinkAdmin admin) {

		MetaLinkAdmin testadmin = new MetaLinkAdmin();
		testadmin.setUsername("test");
		testadmin.setPassword("test");
		dao.save(testadmin);

		return dao.findByPasswordAndUsername(admin.getPassword(), admin.getUsername());

	}

	public void addUser(MetaLinkUser user) {
		userDao.save(user);
	}

	public List<MetaLinkUser> getAllUser() {
		List<MetaLinkUser> users = new ArrayList<>();
		addDummyUser();
		userDao.findAll().forEach(users::add);
		return users;
	}

	private void addDummyUser() {

		for (int i = 0; i < 4; i++) {
			MetaLinkUser user = new MetaLinkUser();
			user.setPassword("test" + i);
			user.setUsername("test" + i);
			user.setEmail("test@gmail.com");
			user.setSecondemail("test@yahoo.com");
			user.setPhone(i + "101010100" + i);
			user.setSecondphone(i * 2 + "101010100" + i);
			if (i == 2 || i == 4)
				user.setStatus("active");
			else
				user.setStatus("inactive");
			user.setMacaddress("SDSD332D23232");
			user.setIpaddress("MKSDSD552SD");
			user.setAccounttype("PERSANOL");

			user.setFirstname("fname " + i);
			user.setLastname("lastname " + i);
			user.setDob(i + "/" + i + "/" + "200" + i);
			user.setZip(i + "676" + i);
			user.setMonthlysalary(String.valueOf(i * 5000));
			userDao.save(user);
		}

	}
}
