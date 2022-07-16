package com.datamappings.datamapping.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String name;


    @JsonIgnore
    @ManyToMany(mappedBy = "enrolledStudents")
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

    //public void setSubjects(List<Subject> subjects){
      //  this.subjects=subjects;
    //}
    //public List<Subject> getSubjectSet() {
      //  return subjectSet;
    //}
 //   public List<Subject> getSubjectSet() {
   //     return subjectSet;
    //}

  //  public void setSubjectSet(List<Subject> subjectSet) {
    //    this.subjectSet = subjectSet;
    //}

}
