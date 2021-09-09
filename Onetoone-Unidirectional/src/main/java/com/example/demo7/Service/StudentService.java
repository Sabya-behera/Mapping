package com.example.demo7.Service;


import com.example.demo7.Model.Student;
import com.example.demo7.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService
{
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudent()
    {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student)
    {
        return studentRepository.save(student);
    }
}
