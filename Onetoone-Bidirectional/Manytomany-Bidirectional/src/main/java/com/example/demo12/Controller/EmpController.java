package com.example.demo12.Controller;


import com.example.demo12.Model.Emp;
import com.example.demo12.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpController
{
    @Autowired
    EmpService empService;

    @GetMapping(value = "/get")
    public List<Emp> getAllEmp()
    {
         return empService.getAllEmp();
    }

    @PostMapping(value = "/post")
    public Emp addEmp(@RequestBody Emp emp)
    {
        return empService.addEmp(emp);
    }
}
