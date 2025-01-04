package com.jhonAlexavila.Biblioteca.Alura.repository;

import com.jhonAlexavila.Biblioteca.Alura.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IbookRepository extends JpaRepository<Book,Long> {
    List<Book> findBookByLanguage(String language);
}
