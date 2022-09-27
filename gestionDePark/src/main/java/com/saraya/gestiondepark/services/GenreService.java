package com.saraya.gestiondepark.services;

import com.saraya.gestiondepark.dto.GenreDto;
import com.saraya.gestiondepark.mappers.GenreMapper;
import com.saraya.gestiondepark.models.Genre;
import com.saraya.gestiondepark.repositories.GenreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenreService {

    @Autowired
    private GenreRepository genreRepository;
    @Autowired
    private GenreMapper genreMapper;

    public List<Genre> getAll(){
        return genreRepository.findAll();
    }

    public Genre getById(Long id){
       Optional<Genre> genre =  genreRepository.findById(id);

        return genre.orElseThrow();
    }

    public Genre add(GenreDto genreDto){

        return genreRepository.save(genreMapper.toEntity(genreDto));
    }
    public Genre update(GenreDto genreDto){

        return genreRepository.save(genreMapper.toEntity(genreDto));
    }
    public void delete(Long id){
       genreRepository.deleteById(id);
    }
}
