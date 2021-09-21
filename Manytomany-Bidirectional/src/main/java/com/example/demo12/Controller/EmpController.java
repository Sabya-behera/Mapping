package com.example.demo12.Controller;


import com.example.demo12.Model.Emp;
import com.example.demo12.Service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("get/{id}")
    public Emp getEmployee(@PathVariable int id) {
        Emp emp = empService.getEmployee(id);
        return emp;
    }

    @PostMapping(value = "/post")
    public Emp addEmp(@RequestBody Emp emp)
    {
        return empService.addEmp(emp);
    }

    @PutMapping("/put/{id}")
    public Emp updateEmployee(@PathVariable int id, @RequestBody Emp emp) {
        empService.updateEmployee(id, emp);
        return emp;
    }
}
