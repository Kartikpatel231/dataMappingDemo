package com.datamappings.datamapping.service;

import com.datamappings.datamapping.entity.Student;
import com.datamappings.datamapping.entity.Subject;
import com.datamappings.datamapping.entity.Teacher;
import com.datamappings.datamapping.repository.StudentRepo;
import com.datamappings.datamapping.repository.SubjectRepo;
import com.datamappings.datamapping.repository.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    private StudentRepo studentRepo;
    @Autowired
    private SubjectRepo subjectRepo;
    @Autowired
    private TeacherRepo teacherRepo;

    //Student
    public List<Student> getStudent(Student student) {
        List<Student> students = new ArrayList<>();
        studentRepo.findAll().forEach(students::add);
        return students;
    }

    public String createStudent(Student student) {
        //set student create date, joining date
        Optional<Student> checkStudent = studentRepo.findByName(student.getName());
        if (checkStudent.isPresent()) {
            throw new RuntimeException("Student already exist with same name.");
        } else {
            studentRepo.save(student);
        }
        return "Data saved successfully.";
    }

    //Subject
    public List<Subject> getSubject(Subject subject) {
        List<Subject> subjects = new ArrayList<>();
        subjectRepo.findAll().forEach(subjects::add);
        return subjects;
    }

    public Subject createSubject(Subject subject) {
        subjectRepo.save(subject);
        return subject;
    }

    //Teacher
    public List<Teacher> getTeacher(Teacher teacher) {
        List<Teacher> teachers = new ArrayList<>();
        teacherRepo.findAll().forEach(teachers::add);
        return teachers;
    }

    public Teacher createTeacher(Teacher teacher) {
        teacherRepo.save(teacher);
        return teacher;
    }

    public Subject enrollStudentsToSubject(Long subjectId, Long studentId) {

        Subject subject = subjectRepo.findById(subjectId).get();
        Student student = studentRepo.findById(studentId).get();

        List<Student> enrolledStuds = new ArrayList<>();
        enrolledStuds.add(student);

        subject.setEnrolledStudents(enrolledStuds);
        return subjectRepo.save(subject);
    }

    //teacher&subject relation
    public Subject assignTeacher(Long subjectId, Long teacherId) {
        Subject subject = subjectRepo.findById(subjectId).get();
        Teacher teacher = teacherRepo.findById(teacherId).get();
        subject.setTeacher(teacher);
        return subjectRepo.save(subject);
    }

    public List<Student> getStudent(Long studId, Integer age) {
        studentRepo.findById(studId);
        return null;
    }
}

