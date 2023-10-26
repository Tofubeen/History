package com.demo.mapper;

//컬렉션에는 3개 인터페이스 : List, set, Map
import java.util.List;

import com.demo.domain.BoardVO;
import com.demo.domain.Criteria;

public interface BoardMapper {

	//추상 메소드
	
	//글쓰기 저장
	//  <insert id="register" parameterType="com.demo.domain.BoardVO"></insert>
	
	public void register(BoardVO board);
	
	//게시물읽기 또는 글수정폼 , 1개 BoardVO
	public BoardVO get(Long bno);
	
	
	
	
	//글 수정하기
	public void modify(BoardVO board);
		
	
//	public void twc(Criteria cri);
	
	
	//전체목록. 여러개를 갖고올려면 리턴타입을 List<BoardVO> 리턴값
	public List<BoardVO> getList();
	
	//페이징 목록.  여러개를 갖고올려면 리턴타입을 List<BoardVO> 리턴값 pageNum, amount , type , keyword
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	//전체 데이터 갯수(검색포함)
	public int getTotalCount(Criteria cri); //type , keyword 사용

	
	//글 삭제하기
	public void delete(Long bno);
	

}
