package com.example.ToDoApp.Mapper;
import com.example.ToDoApp.DTO.ToDoDTO;
import com.example.ToDoApp.Entities.ToDoItem;

public class ToDoMapper {
    public static ToDoDTO mapToTodo(ToDoItem todoitem){
        return new ToDoDTO(todoitem.getId(), todoitem.getTitle(), todoitem.getDescription());
    }
}
