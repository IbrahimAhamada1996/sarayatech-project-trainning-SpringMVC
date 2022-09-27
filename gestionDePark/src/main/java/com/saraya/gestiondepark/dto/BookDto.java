package com.saraya.gestiondepark.dto;

import com.saraya.gestiondepark.models.Author;
import com.saraya.gestiondepark.models.Genre;
import com.saraya.gestiondepark.models.Loan;
import com.saraya.gestiondepark.models.Rate;

import java.util.List;

public class BookDto {
    private Long id;
    private String title;
    private String synopsis;
    private String pulicationDate;
    private Genre genre;
    private Author author;
    private List<Loan> loans;
    private List<Rate> rates;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getPulicationDate() {
        return pulicationDate;
    }

    public void setPulicationDate(String pulicationDate) {
        this.pulicationDate = pulicationDate;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Loan> getLoans() {
        return loans;
    }

    public void setLoans(List<Loan> loans) {
        this.loans = loans;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }
}
