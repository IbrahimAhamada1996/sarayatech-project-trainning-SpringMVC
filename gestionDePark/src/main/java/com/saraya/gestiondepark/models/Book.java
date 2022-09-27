package com.saraya.gestiondepark.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Book  {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    @Column(columnDefinition = "text")
    private String synopsis;
    @Column(columnDefinition = "date")
    private LocalDate pulicationDate;
    @ManyToOne
    @JoinColumn(name = "genre_ID")
    private Genre genre;
    @ManyToOne
    @JoinColumn(name = "author_ID")
    private Author author;
    @ManyToMany
    @JoinColumn(name="books_ID")
    private List<Loan> loans;
    @ManyToMany
    @JoinColumn(name="rate_ID")
    private List<Rate> rates;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public LocalDate getPulicationDate() {
        return pulicationDate;
    }

    public void setPulicationDate(LocalDate pulicationDate) {
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
