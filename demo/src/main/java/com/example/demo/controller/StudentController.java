package com.example.demo.controller;

import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.StudentService;

import java.util.List;
import java.util.UUID;

/**
 * @author Siyuan He
 * @create 2022-05-22 6:14 PM
 */
@RestController
@RequestMapping("api/student")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping
    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "Add Student";
    }

    @PutMapping
    public String updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return "Update Student";
    }

    @DeleteMapping(path = "{id}")
    public String deleteStudent(@PathVariable("id") UUID id) {
        studentService.deleteStudent(id);
        return "Delete Student";
    }

}
