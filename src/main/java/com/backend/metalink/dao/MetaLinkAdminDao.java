package com.backend.metalink.dao;

import com.backend.metalink.model.MetaLinkAdmin;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MetaLinkAdminDao extends CrudRepository<MetaLinkAdmin, Integer> {

    List<MetaLinkAdmin> findByPasswordAndUsername(String password, String Name);
}
