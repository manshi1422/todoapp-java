package com.example.ToDoApp.Service;

import com.example.ToDoApp.DTO.ToDoDTO;
import com.example.ToDoApp.Entities.ToDoItem;
import com.example.ToDoApp.Mapper.ToDoMapper;
import com.example.ToDoApp.Repositories.ToDoRepository;
import org.springframework.stereotype.Service;

@Service
public class ToDoService implements ToDoServiceInterface {

   private ToDoRepository toDoRepository;
    @Override
    public ToDoDTO createTodo(ToDoDTO toDoDTO){

        ToDoItem toDoItem = ToDoMapper.mapToTodo(toDoDTO);
        ToDoItem savedTodo = toDoRepository.save(toDoItem);

        return ToDoMapper.mapToTodo(savedTodo);
    }
}
