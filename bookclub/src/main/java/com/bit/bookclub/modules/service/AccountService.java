package com.bit.bookclub.modules.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit.bookclub.modules.entity.Account;
import com.bit.bookclub.modules.repository.AccountRepository;
import com.bit.bookclub.modules.repository.ReadingNoteRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	@Autowired
	private ReadingNoteRepository readingNoteRepository;
	
	    // 리스트 처리
		public List<Account> getAccountList() {
			
			return accountRepository.findAll();
		}
		
		public Optional<Account> getAccountListById(Integer id) {
			
			return accountRepository.findById(id);
		}
		
		// 작성 처리
		public Account registAccount(Account account) {
			
			// 작성일자 문자열 변경
			LocalDateTime nowDateTime = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
			
			account.setCreated_at(nowDateTime.format(formatter));
			
			// 현재일자와 생년월일을 이용한 만나이 계산
			LocalDate birthday = account.getBirthday();
			LocalDate nowDate = LocalDate.now();
			
			account.setAge(nowDate.getYear() - birthday.getYear());
			
			account.setReading_note_count(readingNoteRepository.count()); // 독서노트 count
			
			return accountRepository.save(account);
			
		}
		
//		// 성별 백분율
//		public User registGenderGraphByAccount(Account account) {
//			
//			account.setMale_persent(accountRepository.countByGender("female") * 100 / accountRepository.count());
//			
//			return accountRepository.save(account);
//		}
		
		// 수정 처리
		public Account updateAccount(Account account) {
			
			// 작성일자 문자열 변경
			LocalDateTime nowDateTime = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
			
			account.setCreated_at(nowDateTime.format(formatter));
			
			// 현재일자와 생년월일을 이용한 만나이 계산
			LocalDate birthday = account.getBirthday();
			LocalDate nowDate = LocalDate.now();
			
			account.setAge(nowDate.getYear() - birthday.getYear());
			
			return accountRepository.saveAndFlush(account);
		}
		
		// 삭제 처리
		public void removeAccount(Integer id) {
			
			accountRepository.deleteById(id);
		}

}
