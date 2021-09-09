package com.example.demo12.Service;

import com.example.demo12.Model.Project;
import com.example.demo12.Repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService
{
    @Autowired
    ProjectRepository projectRepository;

    public List<Project> getAllProject()
    {
        return projectRepository.findAll();
    }

    public Project addProject(Project project)
    {
        return projectRepository.save(project);
    }
}
