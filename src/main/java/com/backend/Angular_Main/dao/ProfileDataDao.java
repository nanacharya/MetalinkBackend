package com.backend.Angular_Main.dao;

import com.backend.Angular_Main.model.ProfileData;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ProfileDataDao extends CrudRepository<ProfileData, Integer> {
}
