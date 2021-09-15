package com.example.onetomany.Controller;

import com.example.onetomany.Model.Employee;
import com.example.onetomany.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/get")
    public List<Employee> getAllEmployee()
    {
        return employeeService.getAllEmployee();
    }

    @PostMapping("/post")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }

}
