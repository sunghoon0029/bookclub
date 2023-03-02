package com.bit.bookclub.modules.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bit.bookclub.modules.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	Integer countByGender(String gender);
	
}
