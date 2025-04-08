package com.example.spring_rest_controller_swagger.controllers;

import com.example.spring_rest_controller_swagger.entities.Book;
import com.example.spring_rest_controller_swagger.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping("/save")
    public ResponseEntity<Book> saveBook(@RequestBody Book book){
        return new ResponseEntity<>(bookService.saveBook(book), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable("id") Long id, @RequestBody Book book){
        return new ResponseEntity<>(bookService.updateBook(id, book), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteBook(@PathVariable("id") Long id){
        bookService.deleteBook(id);
        return new ResponseEntity<>("Successfully deleted book", HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") Long id){
        return new ResponseEntity<>(bookService.findBook(id), HttpStatus.OK);
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Book>> getAllBooks(){
        return new ResponseEntity<>(bookService.findAllBooks(), HttpStatus.OK);
    }
}
