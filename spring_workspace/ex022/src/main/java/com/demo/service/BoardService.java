package com.demo.service;

import java.util.List;

import com.demo.domain.BoardVO;
import com.demo.domain.Criteria;

//인터페이스는 어노테이션 사용 안함sw
public interface BoardService {
	
	public void register(BoardVO board);
	
	public List<BoardVO> getList();//Mapper인터페이스에서 그대로 가져온다
	
	public List<BoardVO> getListWithPaging(Criteria cri);
	
	public BoardVO get(Long bno);

	public void modify(BoardVO board);
	
	public void delete(Long bno);
	
	public int getTotalCount(Criteria cri);
	
	
}
