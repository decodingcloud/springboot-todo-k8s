package com.decodingcloud.todo.controller;

//TodoController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.decodingcloud.todo.entity.Todo;
import com.decodingcloud.todo.service.TodoService;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {
	@Autowired
	private TodoService todoService;

	@GetMapping
	public List<Todo> getAllTodos() {
		return todoService.getAllTodos();
	}

	@GetMapping("/{id}")
	public Todo getTodoById(@PathVariable Long id) {
		return todoService.getTodoById(id);
	}

	@PostMapping
	public Todo createTodo(@RequestBody Todo todo) {
		return todoService.createTodo(todo);
	}

	@PutMapping("/{id}")
	public Todo updateTodo(@PathVariable Long id, @RequestBody Todo todoDetails) {

		return todoService.updateTodo(id, todoDetails);
	}

	@DeleteMapping("/{id}")
	public void deleteTodo(@PathVariable Long id) {
		todoService.deleteTodo(id);
	}
}
