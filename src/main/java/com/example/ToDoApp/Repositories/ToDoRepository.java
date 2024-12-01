package com.example.ToDoApp.Repositories;

import com.example.ToDoApp.Entities.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToDoRepository extends JpaRepository<ToDoItem,Long> {


}
