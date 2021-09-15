package com.example.demo11.Service;


import com.example.demo11.Model.Parent;
import com.example.demo11.Repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentService
{
    @Autowired
    ParentRepository parentRepository;

    public Parent getAllParent()
    {
        return (Parent) parentRepository.findAll();
    }
    public Parent addParent(Parent parent)
    {
        return parentRepository.save(parent);
    }
}
