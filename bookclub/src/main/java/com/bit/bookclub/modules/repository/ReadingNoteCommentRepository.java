package com.bit.bookclub.modules.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bit.bookclub.modules.entity.ReadingNoteComment;

public interface ReadingNoteCommentRepository extends JpaRepository<ReadingNoteComment, Integer>{

}
