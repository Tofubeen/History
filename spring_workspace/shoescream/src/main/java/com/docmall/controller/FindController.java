package com.docmall.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.docmall.domain.MemberVO;
import com.docmall.dto.FindDTO;
import com.docmall.service.FindService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Controller
@RequiredArgsConstructor
@Log4j
@RequestMapping("/member/*")
public class FindController {

	private final FindService findService;
	private final FindDTO dto;



	//아이디 찾기 폼
	@GetMapping("/findId")
	public void findId() {

	}

	//아이디 일치 ,불일치 메소드
	@GetMapping("/findIdCheck")
	public ResponseEntity<String> findIdCheck(String mbsp_id, String mbsp_name, String mbsp_email) throws Exception {

		MemberVO db_id = findService.findIdCheck(mbsp_id);



		log.info(db_id);
		String msg = "";
		String url = "";
//		if(db_id != null) {
//			msg = "귀하의 아이디는 " + db_id.getMbsp_id() + " 입니다";
//			url = "/";
//
//			return url;
//		}else {
//			msg = "이름 혹은 이메일을 다시 확인해주시기 바랍니다.";

//		}
		return null;



	}
}
