package com.saraya.gestiondepark.controllers;

import com.saraya.gestiondepark.dto.GenreDto;
import com.saraya.gestiondepark.models.Genre;
import com.saraya.gestiondepark.services.GenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/genres")
public class GenreController {
    @Autowired
    private GenreService genreService;

    @GetMapping(value = "/list",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<Genre> getAll(){
        return genreService.getAll();
    }

    @GetMapping("/{id}")
    public Genre getGenre(@PathVariable("id") long id){
        return genreService.getById(id);
    }

    @PostMapping(value = "/add")
    public Genre add(@RequestBody GenreDto genreDto){
        return genreService.add(genreDto);
    }

    @PutMapping(value = "/{id}/update")
    public Genre update(@RequestBody GenreDto genreDto){
        return genreService.update(genreDto);
    }

    @DeleteMapping("/{id}/delete")
    public void delete(@PathVariable("id") long id){

        genreService.delete(id);
    }
}
