package com.example.demo12.Repository;

import com.example.demo12.Model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Emp,Integer> {
}
