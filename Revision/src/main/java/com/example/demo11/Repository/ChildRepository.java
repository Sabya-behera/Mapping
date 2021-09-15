package com.example.demo11.Repository;

import com.example.demo11.Model.Child;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChildRepository extends JpaRepository<Child,Integer> {
}
