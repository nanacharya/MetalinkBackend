package com.backend.Angular_Main.dao;

import com.backend.Angular_Main.model.FileEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface FileHandleDao extends CrudRepository<FileEntity,Integer> {
}
