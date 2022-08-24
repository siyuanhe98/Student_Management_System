package com.example.studentsmanagement.dao;

import com.example.studentsmanagement.model.Student;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Siyuan He
 * @create 2022-05-22 11:46 PM
 */
public interface StudentDao extends CrudRepository<Student, Long> {
    List<Student> findByName(String name);
}
