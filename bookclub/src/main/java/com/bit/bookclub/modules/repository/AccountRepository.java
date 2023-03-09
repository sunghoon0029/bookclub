package com.bit.bookclub.modules.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bit.bookclub.modules.entity.Account;

public interface AccountRepository extends JpaRepository<Account, Integer>{

	Integer countByGender(String gender);
}
