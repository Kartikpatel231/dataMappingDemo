package com.datamappings.datamapping.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "enroll_student",
            joinColumns = @JoinColumn(name = "Subject_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "Student_id", referencedColumnName = "id"))
    private List<Student> enrolledStudents;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "teacher_Id", referencedColumnName = "id")
    private Teacher teacher;

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


    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(List<Student> enrolledStudents){
        this.enrolledStudents = enrolledStudents;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

}

