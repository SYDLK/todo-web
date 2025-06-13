package com.todo.todo_web.repository;

import com.todo.todo_web.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
