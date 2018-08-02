package dev.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import dev.entites.Todo;
import dev.repository.TodoRepository;

@Controller
public class TodoController {

	@Autowired
	TodoRepository todoRepository;

	@GetMapping("/todo")
	@ResponseBody
	public List<Todo> list() {
		return todoRepository.findAll();
	}

	@PostMapping("/todo")
	@ResponseBody
	public void create(@RequestBody Todo todo) {
		todoRepository.save(todo);
	}

}
