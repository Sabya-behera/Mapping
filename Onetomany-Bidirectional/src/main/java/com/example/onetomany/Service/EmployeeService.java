package com.example.onetomany.Service;

import com.example.onetomany.Model.Employee;
import com.example.onetomany.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public class EmployeeService
    {
        @Autowired
        EmployeeRepository employeeRepository;

        public List<Employee> getAllEmployee()
        { return employeeRepository.findAll();
        }
        public Employee addEmployee(Employee employee)
        {
            return employeeRepository.save(employee);

        }

    }
