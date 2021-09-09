package com.example.demo6.Controller;

import com.example.demo6.Model.Student_2;
import com.example.demo6.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    public class StudentController
    {
        @Autowired
        StudentService studentService;

        @GetMapping("/get")
        public List<Student_2> getAllStudent() {
            return studentService.getAllStudent();
        }

        @PostMapping("/post")
        public Student_2 postAllStudent(@RequestBody Student_2 student)
        {
            System.out.println("controller");
            return studentService.postAllStudent(student);
        }
    }

