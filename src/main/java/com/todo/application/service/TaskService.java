package com.todo.application.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.todo.application.models.Task;
import com.todo.application.repositories.TaskRepository;

@Service
public class TaskService {
	    @Autowired
	    private TaskRepository taskRepository;

	    public List<Task> getAllTasks() {
	        return taskRepository.findAll();
	    }

	    public Task saveTask(Task task) {
	        return taskRepository.save(task);
	    }

	    public void deleteTask(Long id) {
	        taskRepository.deleteById(id);
	    }
}

