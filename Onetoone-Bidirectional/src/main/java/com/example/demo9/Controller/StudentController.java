package com.example.demo9.Controller;


import com.example.demo9.Model.Student1;
import com.example.demo9.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController
{
    @Autowired
    StudentService studentService;

    @GetMapping("/get")
    public List<Student1> getAllStudent()
    {
        return (List<Student1>) studentService.getAllStudent();
    }

    @PostMapping("/post")
    public Student1 addStudent(@RequestBody Student1 student1)
    {
        studentService.addStudent(student1);
        return student1;
    }

}

