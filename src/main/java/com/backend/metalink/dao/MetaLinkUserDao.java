package com.backend.metalink.dao;

import com.backend.metalink.model.MetaLinkAdmin;
import com.backend.metalink.model.MetaLinkUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface MetaLinkUserDao extends CrudRepository<MetaLinkUser, Integer> {
	
    MetaLinkUser findByPasswordAndUsername(String password, String Name);

}
