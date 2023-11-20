package com.docmall.controller;

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



	//아이디 찾기 폼
	@GetMapping("/findId")
	public void findId() {

	}

	//이름,이메일 대조후 출력 및
	@GetMapping("/findIdCheck")
	public String findIdCheck(FindDTO dto) throws Exception {

		MemberVO db_id = findService.findIdCheck(dto.getMbsp_id());

		String url = "";
		String msg = "";


		log.info("아이디: " +db_id);


//		if(db_id != null) {
//			msg = "귀하의 아이디는 " + db_id.getMbsp_id() + " 입니다";
//			url = "/";
//
//			return url;
//		}else {
//			msg = "이름 혹은 이메일을 다시 확인해주시기 바랍니다.";
//
//		}

//		entity = new ResponseEntity<String>(idUse, HttpStatus.OK);
		return "redirect: " + url ;



	}
}
