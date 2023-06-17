package com.study.demo.mvc.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.study.demo.mvc.domain.Board;

@Repository
public interface BoardRepository {

	List<Board> getList();
	Board get(int num);
	void save(Board board);
	void update(Board board);
	void delete(int num);
	
}
