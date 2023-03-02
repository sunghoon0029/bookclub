package com.bit.bookclub.modules.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bit.bookclub.modules.entity.ReadingNoteBookmark;

public interface ReadingNoteBookmarkRepository extends JpaRepository<ReadingNoteBookmark, Integer>{

}
