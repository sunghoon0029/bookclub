package com.bit.bookclub.modules.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bit.bookclub.modules.entity.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Integer>{

}
