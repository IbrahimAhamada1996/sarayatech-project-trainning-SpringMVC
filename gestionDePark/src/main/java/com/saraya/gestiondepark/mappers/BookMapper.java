package com.saraya.gestiondepark.mappers;

import com.saraya.gestiondepark.dto.BookDto;
import com.saraya.gestiondepark.models.Book;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
@Service
public class BookMapper {

    public BookDto toDto(Book book) {
       BookDto bookDto = new BookDto();
       bookDto.setId(book.getId());
       bookDto.setAuthor(book.getAuthor());
       bookDto.setTitle(book.getTitle());
       bookDto.setGenre(book.getGenre());
       bookDto.setLoans(book.getLoans());
       bookDto.setRates(book.getRates());
       bookDto.setSynopsis(book.getSynopsis());
       bookDto.setPulicationDate(formatString(book.getPulicationDate()));

        return bookDto;
    }

    public Book toEntity(BookDto bookDto){
        Book book = new Book();
        book.setId(bookDto.getId());
        book.setAuthor(bookDto.getAuthor());
        book.setPulicationDate(formatLocalDate(bookDto.getPulicationDate()));
        book.setGenre(bookDto.getGenre());
        book.setLoans(bookDto.getLoans());
        book.setRates(bookDto.getRates());
        book.setSynopsis(bookDto.getSynopsis());
        book.setTitle(bookDto.getTitle());

        return book;
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
