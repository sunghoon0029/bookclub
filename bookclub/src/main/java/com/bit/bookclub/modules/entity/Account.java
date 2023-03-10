package com.bit.bookclub.modules.entity;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nickname;
	
	private String password;
	
	private String name;
	
	private String email;
	
	private String gender;
	
	private LocalDate birthday;
	
	private String created_at;
	
	private Integer age;
	
	private long reading_note_count;
	
//	private String profile_img_url;
	
//	private long male_persent;
	
//	private long female_persent;
	
//	Account(1) : ReadingProgress(N) 설정
	@OneToMany(mappedBy = "account_id")
	public Set<ReadingProgress> readingProgress;
	
//	Account(1) : ReadingNote(N) 설정
	@OneToMany(mappedBy = "account_id")
	public Set<ReadingNote> readingNote;
	
//	Account(1) : ReadingNoteComment(N) 설정
	@OneToMany(mappedBy = "account_id")
	public Set<ReadingNoteComment> readingNoteComment;
	
}
