package com.datamappings.datamapping.repository;

import com.datamappings.datamapping.entity.Subject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepo extends CrudRepository<Subject,Long> {
    //Subject getOne(Long studentId);
}
