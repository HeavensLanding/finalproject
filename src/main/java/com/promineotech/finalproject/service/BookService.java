package com.promineotech.finalproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineotech.finalproject.entity.Book;
import com.promineotech.finalproject.entity.Genre;
import com.promineotech.finalproject.repository.BookRepository;
import com.promineotech.finalproject.repository.GenreRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private GenreRepository genreRepository;

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    public List<Book> getBooksByAuthor(Long authorId) {
        return bookRepository.findByAuthorAuthorId(authorId);
    }

    public Book addGenreToBook(Long bookId, Long genreId) {
        Book book = bookRepository.findById(bookId).orElseThrow();
        Genre genre = genreRepository.findById(genreId).orElseThrow();

        book.getGenres().add(genre);

        return bookRepository.save(book);
    }
    public Book removeGenreFromBook(Long bookId, Long genreId) {
        Book book = bookRepository.findById(bookId).orElseThrow();
        Genre genre = genreRepository.findById(genreId).orElseThrow();

        book.getGenres().remove(genre);

        return bookRepository.save(book);
    }
}