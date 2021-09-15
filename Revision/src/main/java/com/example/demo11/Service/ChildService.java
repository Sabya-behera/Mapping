package com.example.demo11.Service;


import com.example.demo11.Model.Child;
import com.example.demo11.Repository.ChildRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChildService
{
    @Autowired
    ChildRepository childRepository;

    public List<Child> getAllChild()
    {
        return childRepository.findAll();
    }
    public Child addChild(Child child)
    {
        return childRepository.save(child);
    }
}
