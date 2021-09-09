package com.example.demo6.Service;


import com.example.demo6.Model.Student_2;
import com.example.demo6.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
    public class StudentService {

        @Autowired
        private StudentRepository studentRepository;

        public List<Student_2> getAllStudent() {
            return studentRepository.findAll();
        }

        public Student_2 postAllStudent(Student_2 student) {
            System.out.println("service");
            return studentRepository.save(student);
        }
    }

