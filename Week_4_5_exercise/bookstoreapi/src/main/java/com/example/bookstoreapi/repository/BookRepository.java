package com.example.bookstoreapi.repository;

import com.example.bookstoreapi.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
	List<Book> findByTitle(String title);
    
    List<Book> findByAuthor(String author);
    
    List<Book> findByTitleAndAuthor(String title, String author);
}


