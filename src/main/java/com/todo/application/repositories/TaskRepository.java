package com.todo.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import com.todo.application.models.Task;

public interface TaskRepository extends JpaRepository <Task,Long>{

}
