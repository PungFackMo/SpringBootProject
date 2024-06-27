package com.DiaryApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.DiaryApp.board.BoardService;
import com.DiaryApp.todo.TodoService;

@Controller
public class MainCont {
	
	@Autowired
	BoardService bService;
	@Autowired
	TodoService tService;
	
	@GetMapping("/")
	public String getData(Model model) {
		model.addAttribute("todos", tService.getTodosOnlyTen());
		model.addAttribute("boards", bService.getBoardsOnlyTen());
		return "/mainPage";
	}

}
