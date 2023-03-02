package com.bit.bookclub.modules.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class ReadingNoteBookmark {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer count;
	
//	User(1) : ReadingNoteBookmark(N) 설정
//	@ManyToOne
	@Column(name = "user_id")
	private Integer user_id;
	
//	ReadingNote(1) : ReadingNoteBookmark(N) 설정
//	@ManyToOne
	@Column(name = "reading_note_id")
	private Integer reading_note_id;
	
}
