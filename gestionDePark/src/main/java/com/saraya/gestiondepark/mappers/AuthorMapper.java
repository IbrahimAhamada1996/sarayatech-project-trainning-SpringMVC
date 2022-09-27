package com.saraya.gestiondepark.mappers;

import com.saraya.gestiondepark.dto.AuthorDto;
import com.saraya.gestiondepark.models.Author;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
@Service
public class AuthorMapper {

    public AuthorDto toDto(Author author){
        AuthorDto authorDto = new AuthorDto();

        authorDto.setId(author.getId());
        authorDto.setFirstname(author.getFirstname());
        authorDto.setLastname(author.getLastname());
        authorDto.setBirthDate(formatString(author.getBirthDate()));
        authorDto.setNickname(author.getNickname());
        authorDto.setEmail(author.getEmail());
        authorDto.setBooks(author.getBooks());

        return authorDto;
    }

    public Author toEntity(AuthorDto authorDto){
        Author author =  new Author();
        author.setId(authorDto.getId());
        author.setFirstname(authorDto.getFirstname());
        author.setLastname(authorDto.getLastname());
        author.setBirthDate(formatLocalDate(authorDto.getBirthDate()));
        author.setNickname(authorDto.getNickname());
        author.setEmail(authorDto.getEmail());
        author.setBooks(authorDto.getBooks());
        return author;
    }

    private String formatString(LocalDate localDate){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd")
                .withZone(ZoneId.systemDefault());
        return format.format(localDate);
    }

    private LocalDate formatLocalDate(String dateString){

        return LocalDate.parse(dateString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
