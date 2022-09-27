package com.saraya.gestiondepark.repositories;

import com.saraya.gestiondepark.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
