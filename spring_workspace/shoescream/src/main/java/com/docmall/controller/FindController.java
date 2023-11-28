package com.docmall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	//비밀번호 찾기 폼
	@GetMapping("/findPw")
	public void findPw() {

	}

	@GetMapping("/findIdCheck")
	public String findIdCheck(@RequestParam("mbsp_name") String mbsp_name, @RequestParam("mbsp_email") String mbsp_email, Model model) {

		String findId = findService.findIdCheck(mbsp_name, mbsp_email);
		String url = "/";

		if(findId != null) {
			model.addAttribute("result", findId);
		}



		return "redirect:" + url;
	}



/*
	//임시비밀번호 발급
	@PostMapping("/checkIdEmail")
	public ResponseEntity<String> checkIdEmail(@RequestParam("mbsp_id") String mbsp_id, @RequestParam("mbsp_email") String mbsp_email) {

		//1.아이디, 이메일 정보가 일치되는지에 따라 비밀번호 존재여부 확인
		ResponseEntity<String> entity = null;

		String db_mbsp_pw = findService.checkIdEmail(mbsp_id, mbsp_email);
		String tem_pw = "";

		if(db_mbsp_pw != null) {

			//2.임시비밀번호 생성
			UUID uid = UUID.randomUUID();

			log.info("임시비밀번호: " + uid);

			tem_pw = uid.toString().substring(0, 6);

			//3.




		}




		return entity;
	}

	*/
}
