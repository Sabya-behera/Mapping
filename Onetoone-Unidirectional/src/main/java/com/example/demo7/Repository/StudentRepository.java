package com.example.demo7.Repository;

import com.example.demo7.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long>
{

}
