package com.demo.mapper;

// 컬렉션의 인터페이스 3개: List, Set, Map
import java.util.List;

import com.demo.domain.BoardVO;
import com.demo.domain.Criteria;

// 인터페이스
// BoardMapper 인터페이스와 BoardMapper.xml 하나로 관리된다.
/*
[참고] root-context.xml 파일
<mybatis-spring:scan base-package="com.demo.mapper"/>  
*/
public interface BoardMapper {

	// 추상 메서드
	// 특별하지 않으면 INSERT, UPDATE, DELETE의 리턴값은 void
	
	// 글 쓰기 저장
	// 메서드명과 xml 파일의 id="register" 일치 -> <insert id="register"></insert>
	public void register(BoardVO board); // INSERT
	
	// 전체 목록(여러 개): List<BoardVO> 리턴값
	public List<BoardVO> getList();
	
	// 페이징 목록(여러 개): List<BoardVO> 리턴값 -> pageNum, amount, type, keyword 사용
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	// 전체 데이터 개수(검색 포함)
	public int getTotalCount(Criteria cri); // type, keyword만 사용
	
	// 하나의 게시물 읽기 또는 글 수정 폼: BoardVO
	public BoardVO get(Long bno);
		
	// 조회수 증가
	public void readCount(Long bno);
	
	// 글 수정하기
	public void modify(BoardVO board); // UPDATE

	// 글 삭제하기
	public void delete(Long bno); // DELETE
	
}
