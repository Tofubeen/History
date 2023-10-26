package com.demo.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.domain.BoardVO;
import com.demo.domain.Criteria;
import com.demo.mapper.BoardMapper;

import lombok.RequiredArgsConstructor;

/*
[참고] root-context.xml 파일
<context:component-scan base-package="com.demo.service" /
*/
// (규칙) 구현 클래스는 인터페이스를 상속 시 추상메서드를 반드시 재정의해야 한다.
// BoardMapper 인터페이스의 추상 메서드를 호출하는 작업을 해야 한다.
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {
	
	// 스프링이 BoardMapper 인터페이스를 참조하도록 주입해준다(DI).
	private final BoardMapper boardMapper;

	/*
	@RequiredArgsConstructor으로 인해 아래와 같이 동작하기 때문에 굳이 작성할 필요 없음
	
	public BoardServiceImpl(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}
	*/
	
	/* 
	@RequiredArgsConstructor 애노테이션(롬복 제공) 때문에
	private final BoardMapper boardMapper; 필드를 내용으로
	하는 매개변수가 있는 생성자가 만들어지고 그로 인해
	BoardMapper 인터페이스의 bean이 주입된다.
	*/ 
	
	// 리턴값이 없는 메서드
	@Override
	public void register(BoardVO board) {
		
		// BoardMapper 인터페이스의 register 메서드 호출
		boardMapper.register(board);
	}
	
	// 리턴값이 있는 메서드
	@Override
	public List<BoardVO> getList() {
		
		return boardMapper.getList();
	}

	@Override
	public BoardVO get(Long bno) {

		// 조회수 증가
		boardMapper.readCount(bno);
		
		return boardMapper.get(bno);
	}

	@Override
	public void modify(BoardVO board) {
	
		boardMapper.modify(board);
	}

	@Override
	public void delete(Long bno) {

		// BoardMapper 인터페이스의 delete 메서드 호출
		boardMapper.delete(bno);
	}

	@Override
	public List<BoardVO> getListWithPaging(Criteria cri) {

		return boardMapper.getListWithPaging(cri);
	}

	@Override
	public int getTotalCount(Criteria cri) {

		return boardMapper.getTotalCount(cri);
	}

	
}
