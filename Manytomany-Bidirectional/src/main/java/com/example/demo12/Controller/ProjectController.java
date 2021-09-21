package com.example.demo12.Controller;

import com.example.demo12.Model.Project;
import com.example.demo12.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProjectController
{
    @Autowired
    ProjectService projectService;

    @GetMapping(value = "/get2")
    public List<Project> getAllProject()
    {
        return projectService.getAllProject();
    }

    @PostMapping(value = "/post2")
    public Project addProject(@RequestBody Project project)
    {
        projectService.addProject(project);
        return project;
    }

    @PutMapping("/put2/{id}")
    public Project updateProject(@PathVariable int id,@RequestBody Project project)
    {
        projectService.updateProject(id,project);
        return project;
    }
}
