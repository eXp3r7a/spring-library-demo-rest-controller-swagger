package com.example.spring_rest_controller_swagger.repositories;

import com.example.spring_rest_controller_swagger.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User, Long> {
}
