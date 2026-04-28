package com.promineotech.finalproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.promineotech.finalproject.entity.Genre;
import com.promineotech.finalproject.service.GenreService;

@RestController
@RequestMapping("/genres")
public class GenreController {

    @Autowired
    private GenreService genreService;

    @PostMapping
    public Genre createGenre(@RequestBody Genre genre) {
        return genreService.createGenre(genre);
    }

    @GetMapping
    public List<Genre> getAllGenres() {
        return genreService.getAllGenres();
    }
    @DeleteMapping("/{genreId}")
    public void deleteGenre(@PathVariable Long genreId) {
        genreService.deleteGenre(genreId);
    }
}