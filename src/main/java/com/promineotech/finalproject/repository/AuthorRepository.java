package com.promineotech.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.promineotech.finalproject.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}