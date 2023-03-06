package com.bit.bookclub.modules.entity;

import java.time.LocalDate;
import java.util.List;

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
	
	private String joined_at;
	
	private Integer age;
	
//	private String profile_img_url;
	
//	private long male_persent;
	
//	private long female_persent;
	
//	private Integer twentys_percent;
	
//	private Integer thirtys_percent;
	
//	private Integer fortys_percent;
	
//	private Integer fifties_percent;
	
	
//	Account(1) : ReadingProgress(N) 설정
	@OneToMany(mappedBy = "account_id")
	public List<ReadingProgress> readingProgress;
	
//	Account(1) : ReadingNoteBookmark(N) 설정
	@OneToMany(mappedBy = "account_id")
	public List<ReadingNoteBookmark> readingNoteBookmark;
	
//	Account(1) : ReadingNoteComment(N) 설정
	@OneToMany(mappedBy = "account_id")
	public List<ReadingNoteComment> readingNoteomment;
	
}
