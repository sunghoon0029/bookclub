package com.bit.bookclub.modules.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AccountDto {
	
	private Integer id;
	
	private String nickname;
	
	private String password;
	
	private String name;
	
	private String email;
	
	private String gender;
	
	private LocalDate birthday;
	
	private String joined_at;
	
	private Integer age;
	

}
