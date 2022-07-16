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

    //API: localhost:8080/students/100/search?age=10&city=indore&state=MP
    @GetMapping("/{studId}")
    List<Student> getStudent(@PathVariable Long studId, @RequestParam Integer age) {
        return studentService.getStudent(studId, age);
    }

    @PostMapping
    String createStudent(@RequestBody Student student) {
        return studentService.createStudent(student);
    }


}
