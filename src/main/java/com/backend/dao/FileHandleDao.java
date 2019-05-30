package com.backend.dao;

import com.backend.model.FileEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface FileHandleDao extends CrudRepository<FileEntity,Integer> {
}
