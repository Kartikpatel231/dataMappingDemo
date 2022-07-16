package com.datamappings.datamapping.repository;

import com.datamappings.datamapping.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepo extends CrudRepository<Student, Long> {
    Optional<Student> findByName(String name);
    //Student getOne(Long studentId);
}
