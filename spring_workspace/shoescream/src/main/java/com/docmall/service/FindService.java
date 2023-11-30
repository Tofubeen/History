package com.docmall.service;

public interface FindService {

	String findIdCheck(String mbsp_name, String mbsp_email);

	String findPw(String mbsp_id, String mbsp_email);


}
