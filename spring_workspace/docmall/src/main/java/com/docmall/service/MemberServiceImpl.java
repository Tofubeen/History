package com.docmall.service;

import org.springframework.stereotype.Service;

import com.docmall.mapper.MemberMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor //필드 중에 final성격이 붙은 경우에 생성자를 대신 생성해준다
@Service
public class MemberServiceImpl implements MemberService {
	//자동주입
	private final MemberMapper memberMapper; //MemberMapper 에서 생성된 메소드를 가져다 쓸 수 있다

	@Override
	public String idCheck(String mbsp_id) {

		return memberMapper.idCheck(mbsp_id);
	}

	/*
	private MemberServiceImpl(MemberMapper memberMapper) {
		this.memberMapper = memberMapper;
	}
	*/
}
