package com.docmall.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.docmall.domain.ProductVO;
import com.docmall.service.AdProductService;
import com.docmall.util.FileUtils;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@RequiredArgsConstructor
@RequestMapping("/admin/product/*")
@Controller
public class AdProductController {

	private final AdProductService adProductService;

	@Resource(name="uploadPath")
	private String uploadPath;

	//상품등록 폼
	@GetMapping("/pro_insert")
	public void pro_insert() {

		log.info("상품등록 폼");
	}

	// 1차카테고리 데이타를 Model로 작업
	/*
	@GetMapping("이름")
	public void aaa(Model model) {

		model.addAttribute("cg_code", "1차카테고리정보");
	}
	*/

	//상품정보 저장
	//파일 업로드 기능: 1) 스프링에서 내장된 기본라이브러리 ,2) 외부 라이브러리(common-fileupload)를 이용하는 방식 (pom.xml) ,servlet-context.xml 에서 multipartfile 대한 bean 등록자겁
	@PostMapping("/pro_insert") //<input type="file" class="form-control" name="uploadFile" id="uploadFile"> 일치해야함 아무거나 쓰면 안됨
	public String pro_insert(ProductVO vo, MultipartFile uploadFile, RedirectAttributes rttr) {


		log.info("상품정보: " + vo );

		//1)파일업로드 작업. 미리선수작업: FIleUtils 클래스 작업
		String dateFolder = FileUtils.getDateFolder();
		String saveFileName = FileUtils.uploadFile(uploadPath, dateFolder, uploadFile);

		vo.setPro_img(saveFileName);
		vo.setPro_up_folder(dateFolder);

		log.info("상품정보: " + vo );

		//2)상품정보 저장
		adProductService.pro_insert(vo);

		return "redirect:/리스트";
	}

}
