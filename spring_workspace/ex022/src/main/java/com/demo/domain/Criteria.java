package com.demo.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//페이징 및 검색 필드를 가지고 있는 클래스

@ToString
@Setter
@Getter
public class Criteria {

	private int pageNum; //선택된 페이지 번호 1 2 3 4 5
	private int amount; //이 필드에는 페이지마다 출력할 게시물 갯수
	
	private String type;// 검색종류 . T C W TC TW TWC
	private String keyword; // 검색어
	
	
	//이 기본생성자를 생성하지 않으면 다른데서 기본생성자를 생성 할 수 없다
	public Criteria() {
		this(1, 10); 
		System.out.println("Criteria 기본 생성자 호출");
	}
	
	//getType() 메서드 대신  boardMapper.xml 에서 사용할 메소드
	//type: 검색종류 , T C W TC TW TWC 
	public String[] getTypeArr() {
		
		//type이 "TWC" 면 {"T","W","C"}
		return type == null? new String[] {} : type.split(""); 
	}
	
	public Criteria(int pageNum, int amount) {
		this.pageNum = pageNum;
		this.amount = amount;
		
	}
}
