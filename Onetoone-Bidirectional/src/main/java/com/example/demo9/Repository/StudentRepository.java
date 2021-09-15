package com.example.demo9.Repository;


import com.example.demo9.Model.Student1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student1,Long>
{

}
