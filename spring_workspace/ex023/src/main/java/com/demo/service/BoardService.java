package com.demo.service;

import java.util.List;

import com.demo.domain.BoardVO;
import com.demo.domain.Criteria;

// 인터페이스는 @Service 애노테이션 사용 안 함
public interface BoardService {

	public void register(BoardVO board);

	public List<BoardVO> getList();

	public BoardVO get(Long bno); // 조회수 증가 포함

	public void modify(BoardVO board);

	public void delete(Long bno);

	public List<BoardVO> getListWithPaging(Criteria cri);

	public int getTotalCount(Criteria cri);
}
