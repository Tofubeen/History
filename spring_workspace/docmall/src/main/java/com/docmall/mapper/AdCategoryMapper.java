package com.docmall.mapper;

import java.util.List;

import com.docmall.domain.CategoryVO;


//매퍼클래스를 상속받는 프록시(proxy)가 생성이 되고 객체(bean)생성이 이루어진다
public interface AdCategoryMapper {

	List<CategoryVO> getFirstCategoryList();

	List<CategoryVO> getSecondCategoryList(Integer cg_parent_code);

	CategoryVO get(Integer cg_code);
}
