package com.example.ToDoApp.Controllers;


import com.example.ToDoApp.DTO.ToDoDTO;
import com.example.ToDoApp.Service.ToDoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/api/todos")

public class ToDoController {
    private ToDoService toDoService;
@PostMapping
    public ResponseEntity<ToDoDTO> createTodo(@RequestBody ToDoDTO toDoDTO){
        ToDoDTO savedTodo = toDoService.createTodo(toDoDTO);
        return new ResponseEntity<>(savedTodo, HttpStatus.CREATED);
    }
}
