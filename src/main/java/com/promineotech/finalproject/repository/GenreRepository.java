package com.promineotech.finalproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.promineotech.finalproject.entity.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {

}