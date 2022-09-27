package com.saraya.gestiondepark.mappers;

import com.saraya.gestiondepark.dto.GenreDto;
import com.saraya.gestiondepark.models.Genre;
import org.springframework.stereotype.Service;

@Service
public class GenreMapper {

    public GenreDto toDto(Genre genre){
        GenreDto genreDto = new GenreDto();
        genreDto.setId(genre.getId());
        genreDto.setName(genre.getName());

        return genreDto;
    }

    public Genre toEntity(GenreDto genreDto){
        Genre genre =  new Genre();
        genre.setId(genreDto.getId());
        genre.setName(genreDto.getName());
        return genre;
    }
}
