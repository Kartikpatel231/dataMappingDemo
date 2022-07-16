package com.datamappings.datamapping.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;


    @JsonIgnore
    @ManyToMany

    @JoinTable(name = "enroll_student",
            joinColumns = @JoinColumn(name = "Subject_id"),
            inverseJoinColumns = @JoinColumn(name = "Student_id"))


    private List<Student> enrolledStudents = new ArrayList<>();


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


    public Teacher getTeacher() {
        return teacher;
    }

    public void assignTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void enrolledStudents(Student student) {
        enrolledStudents.add(student);
    }
}

