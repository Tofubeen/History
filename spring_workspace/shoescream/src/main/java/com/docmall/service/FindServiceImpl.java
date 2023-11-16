package com.docmall.service;

import org.springframework.stereotype.Service;

import com.docmall.domain.MemberVO;
import com.docmall.mapper.FindMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FindServiceImpl implements FindService {

	private final FindMapper findMapper;

	@Override
	public MemberVO findIdCheck(String mbsp_id) {
		return findMapper.findIdCheck(mbsp_id);
	}



}
