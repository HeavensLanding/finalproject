package com.promineotech.finalproject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.promineotech.finalproject.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByAuthorAuthorId(Long authorId);
}