package com.example.studentsmanagement.model;

import javax.persistence.*;

/**
 * @author Siyuan He
 * @create 2022-05-22 11:26 PM
 */
@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "university_class_id")
    private UniversityClass universityClass;

    public Student() {
    }

    public Student(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student(Long id, String name, UniversityClass universityClass) {
        this.id = id;
        this.name = name;
        this.universityClass = universityClass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UniversityClass getUniversityClass() {
        return universityClass;
    }

    public void setUniversityClass(UniversityClass universityClass) {
        this.universityClass = universityClass;
    }

    @Override
    public String toString() {
        String str = "";
        str += "Primary ID: " + getId();
        str += " Name: " + getName();
        return str;
    }
}
