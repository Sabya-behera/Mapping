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

//     public StudentController(StudentService studentService)
//     {
//         this.studentService=studentService;
//     }
//    StudentService studentService=new StudentService();

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

    @GetMapping("/get/{id}")
    public Student getStudentById(@PathVariable long id)
    {
        return studentService.getStudentById(id);
    }

     @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") long id)
    {
        return studentService.deleteStudent(id);
    }

    @PutMapping("/put/{id}")
    public Student updateStudent(@PathVariable("id") long id,@RequestBody Student student)
    {
      studentService.updateStudent(id,student);
      return student;
    }
}
