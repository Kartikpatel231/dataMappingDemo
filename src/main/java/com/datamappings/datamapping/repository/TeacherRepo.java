package com.datamappings.datamapping.repository;

import com.datamappings.datamapping.entity.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends CrudRepository<Teacher,Long> {

 }
