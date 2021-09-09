package com.example.demo6.Repository;

import com.example.demo6.Model.Student_2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student_2,Integer>
{

}
