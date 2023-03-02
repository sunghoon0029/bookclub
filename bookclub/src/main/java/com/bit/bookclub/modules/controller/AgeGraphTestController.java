package com.bit.bookclub.modules.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.bit.bookclub.modules.entity.Account;
import com.bit.bookclub.modules.service.AccountService;

@Controller
public class AgeGraphTestController {

	@Autowired
	AccountService accountService;
	
	@GetMapping("/test")
	public void ageGraph(List<Account> userList) {
		
		int[] ageGroupCount = new int[5]; // 10~19, 20~29, 30~39, 40~49, 50~59
		int totalUser = userList.size();
		
	    for (Account account : userList) {
	        int age = account.getAge();
	        if (age >= 10 && age < 20) {
	            ageGroupCount[0]++;
	        } else if (age >= 20 && age < 30) {
	            ageGroupCount[1]++;
	        } else if (age >= 30 && age < 40) {
	            ageGroupCount[2]++;
	        } else if (age >= 40 && age < 50) {
	            ageGroupCount[3]++;
	        } else if (age >= 50 && age < 60) {
	            ageGroupCount[4]++;
	        }
	    }
	    
	    for (int i = 0; i < ageGroupCount.length; i++) {
	        double percentage = (double) ageGroupCount[i] / totalUser * 100;
	        System.out.printf("%d대: %.2f%%\n", (i + 1) * 10, percentage);
	    }
	}
}
