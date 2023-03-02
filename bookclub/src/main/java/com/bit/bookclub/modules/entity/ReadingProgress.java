package com.bit.bookclub.modules.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class ReadingProgress {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer no;
	
	private String reading_progress_title;
	
	private Integer reading_progress_goal;
	
	private Integer reading_progress_attainment;
	
	private Integer attainment_percent;

//	User(1) : ReadingProgress(N) 설정
//	@ManyToOne
	@Column(name = "user_no")
	private Integer user_no;
}
