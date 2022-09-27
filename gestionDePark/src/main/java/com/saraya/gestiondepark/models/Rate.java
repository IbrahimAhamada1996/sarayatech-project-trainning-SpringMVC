package com.saraya.gestiondepark.models;

import org.hibernate.type.TextType;

import javax.persistence.*;

@Entity
public class Rate {
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double note;
    @Column(columnDefinition = "text")
    private String comment;
    @ManyToOne
    @JoinColumn(name = "book_ID")
    private Book book;
    @ManyToOne
    @JoinColumn(name = "user_ID")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getNote() {
        return note;
    }

    public void setNote(double note) {
        this.note = note;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
