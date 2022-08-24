package com.example.demo.dao;

import com.example.demo.model.Student;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * @author Siyuan He
 * @create 2022-05-22 6:40 PM
 */
public interface StudentDao {
    Optional<Student> selectStudentById(UUID id);
    List<Student> selectAllStudents();
    int insertStudent(Student student);
    int updateStudent(Student student);
    int deleteStudent(UUID id);
}
