package com.bit.bookclub.modules.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bit.bookclub.modules.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer>{

}
