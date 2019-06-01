package com.backend.dao;

import com.backend.model.ProfileData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ProfileDataDao extends CrudRepository<ProfileData, Integer> {
}
