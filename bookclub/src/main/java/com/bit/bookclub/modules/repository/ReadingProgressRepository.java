package com.bit.bookclub.modules.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bit.bookclub.modules.entity.ReadingProgress;

public interface ReadingProgressRepository extends JpaRepository<ReadingProgress, Integer> {

}
