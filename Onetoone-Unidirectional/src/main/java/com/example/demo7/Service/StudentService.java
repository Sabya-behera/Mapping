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

    public Student getStudentById(long id)
    { return studentRepository.findById(id).get();}

    public String deleteStudent(long id)
    {
        studentRepository.deleteById(id);
        return "Deleted";
    }

    public Student updateStudent(long id,Student student)
    {
        Student student1 = studentRepository.getById(id);
         student1.setFirstName(student.getFirstName());
         student1.setLastName(student.getLastName());
         student1.setSection(student.getSection());
         student1.setAddress(student.getAddress());
         studentRepository.save(student1);
         return student1;
    }
}
