package com.bit.bookclub.modules.controller;
//package com.project.bookclub.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import com.project.bookclub.entity.Book;
//import com.project.bookclub.service.BookService;
//
//@Controller
//public class BookTestController {
//
//	@Autowired
//	private BookService bookService;
//	
//	@GetMapping("/book/write")
//	public String bookWriteForm() {
//		
//		return "bookwrite";
//	}
//	
//	@PostMapping("/book/writepro") // localhost:8080/book/write
//	public String bookWritePro(Book book) {
//		
//		bookService.bookWrite(book);
//		
//		return "redirect:/book/list";
//	}
//	
//	@GetMapping("/book/list")
//	public String bookList(Model model) {
//		
//		model.addAttribute("list", bookService.bookList());
//		
//		return "booklist";
//	}
//	
//	@GetMapping("/book/view")
//	public String bookView(Model model, Integer id) {
//		
//		model.addAttribute("book", bookService.bookView(id));
//		
//		return "bookview";
//	}
//	
//	@GetMapping("/book/delete")
//	public String bookDelete(Integer id, Model model) {
//		
//		bookService.bookDelete(id);
//		
//		return "redirect:/book/list";
//	}
//	
//	@GetMapping("/book/modify/{id}")
//	public String bookModify(@PathVariable("id") Integer id, Model model) {
//		
//		model.addAttribute("book", bookService.bookView(id));
//		
//		return "bookmodify";
//	}
//	
//	
//	@PostMapping("/book/update/{id}")
//	public String bookUpdate(@PathVariable("id") Integer id, Book book) {
//		
//		Book bookTemp = bookService.bookView(id);
//		bookTemp.setBook_title(book.getBook_title());
//		
//		bookService.bookWrite(bookTemp);
//		
//		return "redirect:/book/list";
//	}
//	
//}
