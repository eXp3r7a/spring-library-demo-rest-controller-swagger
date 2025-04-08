package com.example.spring_rest_controller_swagger.services;

import com.example.spring_rest_controller_swagger.entities.Book;
import com.example.spring_rest_controller_swagger.repositories.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public Book saveBook(Book book){
        return bookRepository.save(book);
    }

    public Book updateBook(Long id, Book book){
        Book existBook = bookRepository.findById(book.getId()).orElseThrow(() -> new RuntimeException("Book with this ID not found!"));
        existBook.setTitle(book.getTitle());
        existBook.setAuthor(book.getAuthor());
        existBook.setPublishedYear(book.getPublishedYear());

        return bookRepository.save(existBook);
    }

    public void deleteBook(Long id){
        //check and throw if not exist
        bookRepository.findById(id).orElseThrow(()-> new RuntimeException("Book with this ID not found!"));
        //delete if exist
        bookRepository.deleteById(id);
    }

    public Book findBook(Long id){
        return bookRepository.findById(id).orElseThrow(()-> new RuntimeException("Book with this ID not found!"));
    }

    public List<Book> findAllBooks(){
        return bookRepository.findAll();
    }
}
