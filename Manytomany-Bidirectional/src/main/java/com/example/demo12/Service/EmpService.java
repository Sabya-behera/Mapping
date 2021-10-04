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

    public Emp getEmployee(int id) {
        return empRepository.findById(id).get();
    }

    public Emp updateEmployee(int id, Emp emp) {
        Emp emp1 = empRepository.getById(id);
        emp1.setName(emp.getName());
        emp1.setProject(emp.getProject());
        empRepository.save(emp1);
        return emp1;
    }

    public void deleteEmp(int id) {
        empRepository.deleteById(id);
    }
}
