package com.bit.bookclub.modules.service;
//package com.project.bookclub.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.project.bookclub.entity.GenderTest;
//import com.project.bookclub.repository.GenderTestRepository;
//
//@Service
//public class GenderTestService {
//	
//	@Autowired
//	private GenderTestRepository genderTestRepository;
//	
//	// 리스트 처리
//	public List<GenderTest> getGenderTestList() {
//		
//		return genderTestRepository.findAll();
//	}
//	
//	// 작성 처리
//	public GenderTest registGenderTest(GenderTest genderTest) {
//		
//		genderTest.setMale_persent(genderTestRepository.countByGenderTest("male") * 100 / genderTestRepository.count());
//		
//		return genderTestRepository.save(genderTest);
//	}
//}
