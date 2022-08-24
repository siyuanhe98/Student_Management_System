package com.example.studentsmanagement.exceptions;

/**
 * @author Siyuan He
 * @create 2022-05-22 11:49 PM
 */
public class StudentEmptyNameException extends RuntimeException {
    public StudentEmptyNameException(String message) {
        super(message);
    }
}

