package com.example.demo11.Controller;


import com.example.demo11.Model.Child;
import com.example.demo11.Service.ChildService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChildController
{
    @Autowired
    ChildService childService;

    @GetMapping(value = "/get2")
    public List<Child> getAllChild()
    {
        return childService.getAllChild();
    }

    @PostMapping(value = "/post2")
    public Child addChild(@RequestBody Child child)
    {
        childService.addChild(child);
        return child;
    }
}
