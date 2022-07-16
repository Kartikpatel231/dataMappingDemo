package com.datamappings.datamapping.controller;
import com.datamappings.datamapping.entity.Student;
import com.datamappings.datamapping.entity.Subject;
import com.datamappings.datamapping.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subject")
public class SubjectController {


    @Autowired
    private StudentService studentService;

    @GetMapping
    List<Subject> getSubject(Subject subject) {
        return studentService.getSubject(subject);
    }

    @PostMapping
    Subject createSubject(@RequestBody Subject subject) {
        return studentService.createSubject(subject);
    }

   @PostMapping("/{subjectId}/students/{studentId}")
    Subject enrollStudentsToSubject(@PathVariable Long subjectId, @PathVariable Long studentId) {
       return studentService.enrollStudentsToSubject(subjectId,studentId);
    }

    @PostMapping("/{subjectId}/teacher/{teacherId}")
    Subject assignTeacher(@PathVariable Long subjectId, @PathVariable Long teacherId) {
        return studentService.assignTeacher(subjectId,teacherId);
    }
}

