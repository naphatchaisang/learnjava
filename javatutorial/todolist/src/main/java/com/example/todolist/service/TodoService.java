package com.example.todolist.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.todolist.model.Todo;
import com.example.todolist.repository.TodoRepository;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public void deleteTodoById(Long id) {
        todoRepository.deleteById(id);
    }

    public List<Todo> findByParams(Boolean completed, String keyword) {
        List<Todo> todos = todoRepository.findAll();

        // Filter by completed status if provided
        if (completed != null) {
            todos = todos.stream()
                    .filter(todo -> todo.isCompleted() == completed)
                    .collect(Collectors.toList());
        }

        // Filter by keyword in task if provided
        if (keyword != null && !keyword.isEmpty()) {
            todos = todos.stream()
                    .filter(todo -> todo.getTask().toLowerCase().contains(keyword.toLowerCase()))
                    .collect(Collectors.toList());
        }

        return todos;
    }

    public Todo markAsCompleted(Long id) {
        Optional<Todo> optionalTodo = todoRepository.findById(id);
        if (optionalTodo.isPresent()) {
            Todo todo = optionalTodo.get();
            todo.setCompleted(true);
            return todoRepository.save(todo);
        }
        return null;
    }
}
