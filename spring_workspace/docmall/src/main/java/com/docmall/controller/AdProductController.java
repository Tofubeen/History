package com.docmall.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.docmall.domain.ProductVO;
import com.docmall.dto.Criteria;
import com.docmall.dto.PageDTO;
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

	// 메인 및 썸네일 이미지 업로드 폴더 경로 주입 작업
	@Resource(name = "uploadPath")
	private String uploadPath;

	// CKEditor에서 사용되는 업로드 폴더 경로
	@Resource(name = "uploadCKPath")
	private String uploadCKPath;

	// 상품등록 폼
	@GetMapping("/pro_insert")
	public void pro_insert() {
		log.info("상품등록 폼");
	}

	// 상품정보 저장
	@PostMapping("/pro_insert")
	public String pro_insert(ProductVO vo, MultipartFile uploadFile, RedirectAttributes rttr) {
		log.info("상품정보: " + vo);

		// 1) 파일 업로드 작업. 미리선수작업: FileUtils 클래스 작업
		String dateFolder = FileUtils.getDateFolder();
		String saveFileName = FileUtils.uploadFile(uploadPath, dateFolder, uploadFile);

		vo.setPro_img(saveFileName);
		vo.setPro_up_folder(dateFolder);

		log.info("상품정보: " + vo);

		// 2) 상품정보 저장
		adProductService.pro_insert(vo);

		return "redirect:/admin/product/pro_list"; // 상품리스트 주소 이동
	}

	// CKEditor 업로드 탭에서 파일 업로드 시 동작하는 매핑 주소
	@PostMapping("/imageUpload")
	public void imageUpload(HttpServletRequest request, HttpServletResponse response, MultipartFile upload) {
		// try 코드 사용 전에 선언한 목적
		OutputStream out = null;
		PrintWriter printWriter = null; // 클라이언트에게 서버의 응답 정보를 보낼 때 사용

		// 클라이언트에게 보내는 응답 설정
		response.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("text/html; charset=utf-8");

		try {
			String fileName = upload.getOriginalFilename(); // 클라이언트에서 전송한 파일 이름
			byte[] bytes = upload.getBytes(); // 업로드한 파일을 byte 배열로 읽어들임

			String ckUploadPath = uploadCKPath + fileName;

			log.info("CKEditor 파일 경로: " + ckUploadPath);

			out = new FileOutputStream(new File(ckUploadPath)); // 0KB 파일 생성

			out.write(bytes);
			out.flush();

			// 2) 파일 업로드 작업 후 파일 정보를 CKEditor로 보내는 작업
			printWriter = response.getWriter();

			// 브라우저의 CKEditor에서 사용할 업로드한 파일 정보를 참조하는 경로 설정
			String fileUrl = "/ckupload/" + fileName;
			// {"filename":"abc.gif", "uploaded":1, "url":"/upload/abc.gif"}
			printWriter.println("{\"filename\":\"" + fileName + "\", \"uploaded\":1,\"url\":\"" + fileUrl + "\"}");
			printWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				try {
					out.close();
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			if (printWriter != null)
				printWriter.close();
		}
	}

	// 상품리스트
	@GetMapping("/pro_list")
	public void pro_list(Criteria cri, Model model) throws Exception {
		List<ProductVO> pro_list = adProductService.pro_list(cri);

		//날짜폴더의 역슬래시를 슬래시로 바꾸는 작업. 이유? 역슬래시로 되어있는 정보가 스프링으로 보내는 요청데이터에 사용되면 에러발생.
		pro_list.forEach(vo -> {
			vo.setPro_up_folder(vo.getPro_up_folder().replace("\\", "/"));
		});
		model.addAttribute("pro_list", pro_list);

		int totalCount = adProductService.getTotalCount(cri);
		model.addAttribute("pageMaker", new PageDTO(cri, totalCount));
	}
}