package com.promineotech.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.promineotech.finalproject.entity.Book;
import com.promineotech.finalproject.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;


    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }


    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }


    @GetMapping("/author/{authorId}")
    public List<Book> getBooksByAuthor(@PathVariable Long authorId) {
        return bookService.getBooksByAuthor(authorId);
    }


    @PutMapping("/{bookId}/genres/{genreId}")
    public Book addGenreToBook(@PathVariable Long bookId, @PathVariable Long genreId) {
        return bookService.addGenreToBook(bookId, genreId);
    }
    @DeleteMapping("/{bookId}/genres/{genreId}")
    public Book removeGenreFromBook(@PathVariable Long bookId, @PathVariable Long genreId) {
        return bookService.removeGenreFromBook(bookId, genreId);
    }
}