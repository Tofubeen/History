package com.docmall.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.docmall.domain.MemberVO;
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

	//아이디 일치 ,불일치 메소드
	@GetMapping("/findIdCheck")
	 public ResponseEntity<String> findId(@RequestParam String mbsp_name, @RequestParam String mbsp_email) throws Exception {
        MemberVO member = findService.findIdCheck(mbsp_name, mbsp_email);

        if (member != null) {
            // 아이디를 찾았을 경우
            return ResponseEntity.ok("Found ID: " + member.getMbsp_id());
        } else {
            // 아이디를 찾지 못했을 경우
            return ResponseEntity.notFound().build();
	}

	}
}
