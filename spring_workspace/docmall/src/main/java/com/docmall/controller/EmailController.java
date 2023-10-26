package com.docmall.controller;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docmall.dto.EmailDTO;
import com.docmall.service.EmailService;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@RestController // 컨트롤러 클래스가 Ajax 용도로만 사용할 때 적용하는 어노테이션 ↔ @Controller
@RequestMapping("/email/*") // 현재 JSP는 사용하지 않을 예정
@Log4j
@RequiredArgsConstructor
public class EmailController {

   private final EmailService emailService;

   // 메일 인증코드 요청주소
   @GetMapping("/authcode")
   public ResponseEntity<String> authSend(EmailDTO dto, HttpSession session) {

      log.info("전자우편 정보: " + dto);
      ResponseEntity<String> entity = null;

      // 인증코드 6자리 랜덤 생성
      String authCode = "";
      for (int i = 0; i < 6; i++) {
         authCode += String.valueOf((int) (Math.random() * 10));
      }
      log.info("인증코드: " + authCode);

      // 사용자에게 메일로 발급해준 인증코드를 입력 시 비교 목적으로 세션 형태로 미리 저장해둔다.
      session.setAttribute("authCode", authCode);

      try {
         emailService.sendMail(dto, authCode); // 메일 보내기
         entity = new ResponseEntity<String>("success", HttpStatus.OK); // 200번
      } catch (Exception e) {
         e.printStackTrace();
         entity = new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR); // 500번
      }

      return entity;
   }

   //인증코드 확인 = 세션형태로 저장한 정보를 이용
   @GetMapping("/confirmAuthcode")
   public ResponseEntity<String> confirmAurhcode(String authcode, HttpSession session) {

	   ResponseEntity<String> entity = null;

	   String sAuthcode = "";
	   if(session.getAttribute("authcode") != null) {

	   if(authcode.equals(session.getAttribute("authcode"))) {
		   entity= new ResponseEntity<String>("success" , HttpStatus.OK);
	   }else {
		   entity = new ResponseEntity<String>("fail", HttpStatus.OK);
	   	}
	  }else {
		  entity = new ResponseEntity<String>("request", HttpStatus.OK);
	  }

	   return entity;
   };

}