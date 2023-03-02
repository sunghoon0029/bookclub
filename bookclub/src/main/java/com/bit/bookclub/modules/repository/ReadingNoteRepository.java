package com.bit.bookclub.modules.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bit.bookclub.modules.entity.ReadingNote;

public interface ReadingNoteRepository extends JpaRepository<ReadingNote, Integer>{

}
