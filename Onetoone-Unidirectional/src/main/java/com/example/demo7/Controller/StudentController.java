package com.example.demo7.Controller;


import com.example.demo7.Model.Student;
import com.example.demo7.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController
{
    @Autowired
    StudentService studentService;

    @GetMapping("/get")
    public List<Student> getAllStudent()
    {
        return studentService.getAllStudent();
    }

    @PostMapping("/post")
    public Student addStudent(@RequestBody Student student)
    {
        studentService.addStudent(student);
        return student;
    }

}
