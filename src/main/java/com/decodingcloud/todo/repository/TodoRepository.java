package com.decodingcloud.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.decodingcloud.todo.entity.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
