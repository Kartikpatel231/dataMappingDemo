package com.datamappings.datamapping.controller;

import com.datamappings.datamapping.entity.Student;
import com.datamappings.datamapping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    List<Student> getStudent(Student student){
        return studentService.getStudent(student);
    }
    @PostMapping
    Student createStudent(@RequestBody Student student){
        return  studentService.createStudent(student);
    }


}
