package com.datamappings.datamapping.repository;

import com.datamappings.datamapping.entity.Student;
import com.datamappings.datamapping.entity.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student,Long> {
    //Student getOne(Long studentId);
}
