package com.todo.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.todo.application.service.TaskService;
import com.todo.application.models.Task;

@Controller
public class TaskController {
	    @Autowired
	    private TaskService taskService;

	    @GetMapping("/")
	    public String home(Model model) {
	        model.addAttribute("tasks", taskService.getAllTasks());
	        return "index.html";
	    }

	    @PostMapping("/add")
	    public String addTask(@ModelAttribute Task task) {
	        taskService.saveTask(task);
	        return "redirect:/";
	    }

	    @GetMapping("/delete/{id}")
	    public String deleteTask(@PathVariable Long id) {
	        taskService.deleteTask(id);
	        return "redirect:/";
	    }
	}
