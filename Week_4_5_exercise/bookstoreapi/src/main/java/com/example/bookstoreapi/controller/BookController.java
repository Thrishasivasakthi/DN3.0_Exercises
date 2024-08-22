package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.model.Book;
import com.example.bookstoreapi.repository.BookRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @Operation(summary = "Get a book by its ID", description = "Fetches a book by its unique identifier")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "Successfully retrieved the book"),
        @ApiResponse(responseCode = "404", description = "Book not found")
    })
    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Long id) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException("Book not found with id " + id));
        
        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "HeaderValue");

        return new ResponseEntity<>(book, headers, HttpStatus.OK);
    }

    @Operation(summary = "Create a new book", description = "Adds a new book to the collection")
    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book savedBook = bookRepository.save(book);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "CreatedBook");

        return new ResponseEntity<>(savedBook, headers, HttpStatus.CREATED);
    }

    @Operation(summary = "Update an existing book", description = "Updates the details of a book by its ID")
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book book) {
        if (!bookRepository.existsById(id)) {
            throw new BookNotFoundException("Book not found with id " + id);
        }
        book.setId(id);
        Book updatedBook = bookRepository.save(book);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "UpdatedBook");

        return new ResponseEntity<>(updatedBook, headers, HttpStatus.OK);
    }

    @Operation(summary = "Delete a book", description = "Removes a book from the collection by its ID")
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long id) {
        if (!bookRepository.existsById(id)) {
            throw new BookNotFoundException("Book not found with id " + id);
        }
        bookRepository.deleteById(id);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Custom-Header", "DeletedBook");

        return new ResponseEntity<>(headers, HttpStatus.NO_CONTENT);
    }
}




