package com.docmall.service;

import org.springframework.stereotype.Service;

import com.docmall.mapper.FindMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FindServiceImpl implements FindService {

	private final FindMapper findMapper;

	@Override
	public String findIdCheck(String mbsp_name, String mbsp_email) {
		// TODO Auto-generated method stub
		return findMapper.findIdCheck(mbsp_name, mbsp_email);
	}





}
