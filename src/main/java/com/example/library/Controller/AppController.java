package com.example.library.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.library.Model.Book;
import com.example.library.Model.BookRequest;
import com.example.library.Service.BookService;


@RestController
@RequestMapping(value = "/api/v1")
public class AppController {
    private BookService bookService;

    
    public AppController(BookService bookService) {
        this.bookService=bookService;
    }


    @GetMapping("/books")
    public ResponseEntity getBooks(){
        return ResponseEntity.ok(bookService.getBooks());
    }


    @PostMapping("/book")
    public ResponseEntity<Book> addBook(@RequestBody BookRequest request){
        return ResponseEntity.ok(bookService.createBook(request));
    }

    
}
