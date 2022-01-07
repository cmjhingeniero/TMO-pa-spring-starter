package com.galvanize.tmo.paspringstarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.galvanize.tmo.paspringstarter.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
