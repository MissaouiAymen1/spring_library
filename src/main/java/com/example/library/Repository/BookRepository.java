package com.example.library.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.library.Model.Book;


public interface BookRepository extends MongoRepository<Book, String>{
    
}
