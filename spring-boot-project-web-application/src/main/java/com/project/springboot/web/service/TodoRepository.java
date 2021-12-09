package com.project.springboot.web.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.springboot.web.model.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {
	
	//service.retrieveTodos(name)
	List<Todo> findByUser(String user);
	
	//  By Default exists 
	
		//service.deleteTodo(id);
		//service.retrieveTodo(id)
		//service.updateTodo(todo)
		//service.addTodo(getLoggedInUserName(model), todo.getDesc(), todo.getTargetDate(),false);

}
