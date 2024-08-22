package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.model.Book;
import com.example.bookstoreapi.repository.BookRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
@Transactional
public class BookControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private BookRepository bookRepository;

    @BeforeEach
    void setUp() {
        bookRepository.deleteAll(); 
    }

    @Test
    void testCreateBook() throws Exception {
        Book book = new Book(null, "Title", "Author", 29.99, "1234567890");

        mockMvc.perform(post("/books")
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(book)))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.title").value("Title"))
                .andExpect(jsonPath("$.author").value("Author"));
    }

    @Test
    void testGetBookById() throws Exception {
        Book book = new Book(null, "Title", "Author", 29.99, "1234567890");
        Book savedBook = bookRepository.save(book);

        mockMvc.perform(get("/books/" + savedBook.getId())
                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Title"))
                .andExpect(jsonPath("$.author").value("Author"));
    }

    @Test
    void testUpdateBook() throws Exception {
        Book book = new Book(null, "Title", "Author", 29.99, "1234567890");
        Book savedBook = bookRepository.save(book);

        Book updatedBook = new Book(null, "Updated Title", "Updated Author", 39.99, "0987654321");

        mockMvc.perform(put("/books/" + savedBook.getId())
                .contentType(MediaType.APPLICATION_JSON)
                .content(new ObjectMapper().writeValueAsString(updatedBook)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.title").value("Updated Title"))
                .andExpect(jsonPath("$.author").value("Updated Author"));
    }

    @Test
    void testDeleteBook() throws Exception {
        Book book = new Book(null, "Title", "Author", 29.99, "1234567890");
        Book savedBook = bookRepository.save(book);

        mockMvc.perform(delete("/books/" + savedBook.getId()))
                .andExpect(status().isNoContent());
    }
}

