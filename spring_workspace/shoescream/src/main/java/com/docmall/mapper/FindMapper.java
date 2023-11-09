package com.docmall.mapper;

import com.docmall.domain.MemberVO;

public interface FindMapper {

	void findId(String mbsp_id);

	String findId(MemberVO vo)
}
