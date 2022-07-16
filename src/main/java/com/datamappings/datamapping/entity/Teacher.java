package com.datamappings.datamapping.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class  Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;



    @JsonIgnore
    @OneToMany(mappedBy = "teacher")
    private List<Subject>  subjects;
    private String name;
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
}