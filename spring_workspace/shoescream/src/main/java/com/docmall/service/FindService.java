package com.docmall.service;

import com.docmall.domain.MemberVO;

public interface FindService {

	MemberVO findIdCheck(String mbsp_name, String mbsp_email );

}
