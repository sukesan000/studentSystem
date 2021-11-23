package com.practicecodes.studentSystem.service;

import com.practicecodes.studentSystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
}
