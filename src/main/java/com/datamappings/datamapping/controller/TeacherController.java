package com.datamappings.datamapping.controller;

import com.datamappings.datamapping.entity.Subject;
import com.datamappings.datamapping.entity.Teacher;
import com.datamappings.datamapping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/Teacher")


public class TeacherController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    List<Teacher> getTeacher(Teacher teacher){
        return studentService.getTeacher(teacher);
    }
    @PostMapping
    Teacher createTeacher(@RequestBody Teacher teacher){
        return  studentService.createTeacher(teacher);
    }


}


