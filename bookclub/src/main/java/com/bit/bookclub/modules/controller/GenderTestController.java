package com.bit.bookclub.modules.controller;
//package com.project.bookclub.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.project.bookclub.entity.GenderTest;
//import com.project.bookclub.service.GenderTestService;
//
//@RestController
//@RequestMapping("/gender")
//public class GenderTestController {
//
//	@Autowired
//	private GenderTestService genderTestService;
//	
//	@GetMapping("/list")
//	public List<GenderTest> getAll() {
//		
//		return genderTestService.getGenderTestList();
//	}
//	
//	@PostMapping("/regist")
//	public GenderTest registGenderTest(@RequestBody GenderTest genderTest) {
//		
//		return genderTestService.registGenderTest(genderTest);
//	}
//}
