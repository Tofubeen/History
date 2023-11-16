package com.docmall.mapper;

import java.util.List;

import com.docmall.domain.CategoryVO;

public interface AdCategoryMapper {

	List<CategoryVO> getFirstCategoryList(); // 1차 카테고리 출력
	
	List<CategoryVO> getSecondCategoryList(Integer cg_parent_code);// 2차 카테고리 출력
	
	// 상품 수정에서 1차와 2차 카테고리를 보여주는 작업
	CategoryVO get(Integer cg_code);
}
