package com.bit.bookclub.modules.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class ReadingNote {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String reading_note_title;
	
	private String reading_note_hashtag;
	
	private String reading_note_content;
	
	private Integer reading_note_hit;
	
	private Integer reading_note_like;
	
	private Integer reading_note_bookmark;
	
	private String reading_note_regdate;
	
	private String reading_note_file_url;
	
	private Integer reading_note_open;
	
////	User(1) : ReadingNote(N) 설정
////	@ManyToOne
//	@Column(name = "user_id")
//	private Integer user_id;
	
//	Book(1) : ReadingNote(N) 설정
//	@ManyToOne
	@Column(name = "book_id")
	private Integer book_id;
	
//	ReadingNote(1) : ReadingNoteBookmark(N) 설정
	@OneToMany(mappedBy = "reading_note_id")
	public List<ReadingNoteBookmark> readingNoteBookmark;
	
//	ReadingNote(1) : ReadingNoteComment(N) 설정
	@OneToMany(mappedBy = "reading_note_id")
	public List<ReadingNoteComment> readingNoteComment;
	
////	ReadingNote(1) : Heart(N) 설정
//	@OneToMany(mappedBy = "reading_note_id")
//	public List<Heart> heart;
	
}
