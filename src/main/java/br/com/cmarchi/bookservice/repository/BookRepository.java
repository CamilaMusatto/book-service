package br.com.cmarchi.bookservice.repository;

import br.com.cmarchi.bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
