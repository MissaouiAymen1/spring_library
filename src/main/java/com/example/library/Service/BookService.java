package com.example.library.Service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.example.library.Model.Book;
import com.example.library.Model.BookRequest;
import com.example.library.Repository.BookRepository;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks(){
        return bookRepository.findAll();
    }

    public Book createBook(BookRequest book) {
        Book bookToCreate = new Book();
        BeanUtils.copyProperties(book, bookToCreate);
        return bookRepository.save(bookToCreate);
    }
    
}
