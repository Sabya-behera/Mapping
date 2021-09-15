package com.example.demo11.Controller;

import com.example.demo11.Model.Parent;
import com.example.demo11.Service.ParentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParentController
{
    @Autowired
    ParentService parentService;

    @GetMapping(value ="/get")
    public Parent getAllParent()
    {
        return parentService.getAllParent();
    }

    @PostMapping(value = "/post")
    public Parent addAllParent(Parent parent) {
        parentService.addParent(parent);
        return parent;
    }
}
