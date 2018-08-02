package dev.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.entites.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
