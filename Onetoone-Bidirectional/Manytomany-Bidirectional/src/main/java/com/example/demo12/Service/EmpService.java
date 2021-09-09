package com.example.demo12.Service;

import com.example.demo12.Model.Emp;
import com.example.demo12.Repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    EmpRepository empRepository;

    public List<Emp> getAllEmp()
    {
        return empRepository.findAll();
    }

    public Emp addEmp(Emp emp)
    {
        return empRepository.save(emp);
    }
}
