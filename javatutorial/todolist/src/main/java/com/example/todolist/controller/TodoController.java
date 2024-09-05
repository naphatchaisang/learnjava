package com.example.todolist.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.todolist.model.Todo;
import com.example.todolist.service.TodoService;

@RestController
@RequestMapping("/api/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getTodos(
            @RequestParam(required = false) Boolean completed,
            @RequestParam(required = false) String keyword) {
        // Handle queries with parameters
        if (completed != null || keyword != null) {
            return todoService.findByParams(completed, keyword);
        }
        // Default to returning all todos
        return todoService.getAllTodos();
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo todo) {
        return todoService.createTodo(todo);
    }

    @PostMapping("/add")
    public Todo addTodoWithParams(
            @RequestParam String task,
            @RequestParam(defaultValue = "false") boolean completed) {
        Todo todo = new Todo();
        todo.setTask(task);
        todo.setCompleted(completed);
        return todoService.createTodo(todo);
    }

    @PatchMapping("/{id}/complete")
    public ResponseEntity<Todo> completeTodoById(@PathVariable Long id) {
        Todo updatedTodo = todoService.markAsCompleted(id);
        if (updatedTodo != null) {
            return ResponseEntity.ok(updatedTodo);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteTodoById(@PathVariable Long id) {
        todoService.deleteTodoById(id);
    }
}
