package com.study.demo.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.study.demo.mvc.domain.Board;
import com.study.demo.mvc.service.BoardService;

@RestController
@RequestMapping("/board")
public class BoardController {
	
	@Autowired
	private BoardService svc;
	
	@GetMapping("/list")
	public List<Board> getList(){
		return svc.getList();
	}
	
	
	@GetMapping("/{num}")
	public Board get(@PathVariable int num) {
		return svc.get(num);
	}
	
	//update/save 같이
	@GetMapping("/save")
	public void save(Board board) {
		svc.save(board);
		
	}
	
//	public void update(Board board) {
//		svc.update(board);
//	}
	
	@GetMapping("/delete/{num}")
	public void delete(@PathVariable int num) {
		svc.delete(num);
	}
	
}
