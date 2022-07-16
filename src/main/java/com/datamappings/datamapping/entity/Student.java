package com.datamappings.datamapping.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "enrolledStudents")
    private List<Subject> subjects;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects){
      this.subjects=subjects;
    }
//    public List<Subject> getSubjects() {
//      return subjects;
//    }
    //   public List<Subject> getSubjectSet() {
    //     return subjectSet;
    //}

    //  public void setSubjectSet(List<Subject> subjectSet) {
    //    this.subjectSet = subjectSet;
    //}

}
