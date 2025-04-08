package com.example.spring_rest_controller_swagger.repositories;

import com.example.spring_rest_controller_swagger.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
