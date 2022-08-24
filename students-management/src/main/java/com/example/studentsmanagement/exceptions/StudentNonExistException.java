package com.example.studentsmanagement.exceptions;


/**
 * @author Siyuan He
 * @create 2022-05-22 11:52 PM
 */
public class StudentNonExistException extends RuntimeException{
    public StudentNonExistException(String message) {
        super(message);
    }
}
