package com.library.LibraryManage.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.library.LibraryManage.entity.Book;
import com.library.LibraryManage.service.BookService;

import java.util.*;

@Controller
public class BookController {
	
	@Autowired
	private BookService service;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/available_books")
	public ModelAndView getAllBook() {
		List<Book>list=service.getAllBook();
		return new ModelAndView("bookList","book",list);
	}

	
	@RequestMapping("/deleteBook/{id}")
	public String deleteBook(@PathVariable("id")int id) {
		service.deleteById(id);
		return "redirect:/available_books";
	}
	
}
