package com.example.studentsmanagement.api;

import com.example.studentsmanagement.exceptions.InvalidUniversityClassException;
import com.example.studentsmanagement.model.UniversityClass;
import com.example.studentsmanagement.service.UniversityClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Siyuan He
 * @create 2022-05-25 8:40 PM
 */
@RestController
@RequestMapping("api/class")
public class UniversityClassController {

    private UniversityClassService universityClassService;

    @Autowired
    public UniversityClassController(UniversityClassService universityClassService) {
        this.universityClassService = universityClassService;
    }

    @GetMapping
    public List<UniversityClass> getAllClasses() {
        return universityClassService.getAllClasses();
    }

    @PostMapping
    @RequestMapping("/add")
    public ResponseEntity<String> addClass(@RequestBody UniversityClass universityClass) {
        try {
            UniversityClass savedUniversityClass = universityClassService.addClass(universityClass);
            return ResponseEntity.ok("Add class: " + savedUniversityClass.toString());
        } catch (InvalidUniversityClassException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

}
