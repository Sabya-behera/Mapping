package com.example.demo9.Service;


import com.example.demo9.Model.Student1;
import com.example.demo9.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService
{
    @Autowired
    StudentRepository studentRepository;

    public List<Student1> getAllStudent()
    {
        return (List<Student1>) studentRepository.findAll();
    }

    public Student1 addStudent(Student1 student1)
    {
        return studentRepository.save(student1);
    }
}
