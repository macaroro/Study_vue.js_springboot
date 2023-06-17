package com.study.demo.mvc.domain;

import java.util.Date;

import lombok.Data;

@Data
public class Board {
	
	
	private String title;
	private String contents;
	private Date postdate;
	private String id;
	private int num;
	private int visitcount;

}
