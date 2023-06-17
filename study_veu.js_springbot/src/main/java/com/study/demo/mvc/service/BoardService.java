package com.study.demo.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.demo.mvc.domain.Board;
import com.study.demo.mvc.repository.BoardRepository;

@Service
public class BoardService {
	
	@Autowired
	private BoardRepository dao;

	public List<Board> getList(){
		return dao.getList();
	}
	
	
	
	public Board get(int boardSeq) {
		return dao.get(boardSeq);
	}
	
	public void save(Board board) {
		dao.save(board);
		
	}
	public void update(Board board) {
		 dao.update(board);
	}
	public void delete(int boardSeq) {
		 dao.delete(boardSeq);
	}
	
}
