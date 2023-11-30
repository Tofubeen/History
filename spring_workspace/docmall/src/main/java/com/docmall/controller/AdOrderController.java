package com.docmall.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.docmall.domain.OrderDetailInfoVO;
import com.docmall.domain.OrderDetailProductVO;
import com.docmall.domain.OrderVO;
import com.docmall.dto.Criteria;
import com.docmall.dto.PageDTO;
import com.docmall.service.AdOrderService;
import com.docmall.util.FileUtils;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Controller
@RequiredArgsConstructor
@RequestMapping("/admin/order/*")
public class AdOrderController {

	@Resource(name = "uploadPath") // servlet-context.xml 의 uploadPath bean이름 참조를 해야 함.
	private String uploadPath;

	private final AdOrderService adOrderService;

	// (목록과페이징)
	@GetMapping("/order_list")
	public void order_list(Criteria cri, @ModelAttribute("start_date")String start_date, @ModelAttribute("end_date")String end_date, Model model) throws Exception {

		// this(1, 10);
		// 10 -> 2
		cri.setAmount(2);


		List<OrderVO> order_list = adOrderService.order_list(cri,start_date,end_date);
		model.addAttribute("order_list", order_list);

		int totalCount = adOrderService.getTotalCount(cri,start_date,end_date);
		model.addAttribute("pageMaker", new PageDTO(cri, totalCount));
	}


	// 주문상세 방법1.  주문상세정보가 클라이언트 json 형태로 변환되어 보내진다. (pom.xml 에 jaskson-databind 라이브러리 백그라운드로 작동)
	@GetMapping("/order_detail_info1/{ord_code}")
	public ResponseEntity<List<OrderDetailInfoVO>> order_detail_list1(@PathVariable("ord_code") Long ord_code) throws Exception {

		// 클래스명 = 주문상세 + 상품테이블 조인한 결과를 담는 클래스

		ResponseEntity<List<OrderDetailInfoVO>> entity = null;


		//상품상세목록 저장
		List<OrderDetailInfoVO> OrderDetailList = adOrderService.orderDetailInfo1(ord_code);

		// 브라우저에서 상품이미지 출력시 역슬래시 사용이 문제가 된다. 그래서 슬래시로 변환해서 클라이언트로 보냄.
		OrderDetailList.forEach(vo -> {
			vo.setPro_up_folder(vo.getPro_up_folder().replace("\\", "/"));
		});

		//주문상세목록을 받아온 것
		entity = new ResponseEntity<List<OrderDetailInfoVO>>(OrderDetailList, HttpStatus.OK);

		return entity;
	}

	// 주문상세내역에서 개별상품삭제.
	@GetMapping("/order_product_delete")
	public String order_product_delete(Criteria cri, Long ord_code,Integer pro_num) throws Exception {

		//주문상세 개별삭제
		adOrderService.order_product_delete(ord_code, pro_num);

		return "redirect:/admin/order/order_list" + cri.getListLink();

	}

	// 주문상세 방법2
	@GetMapping("/order_detail_info2/{ord_code}")
	public String order_detail_list2(@PathVariable("ord_code") Long ord_code, Model model) throws Exception {


		List<OrderDetailProductVO> orderProductList =adOrderService.orderDetailInfo2(ord_code);

		// 브라우저에서 상품이미지 출력시 역슬래시 사용이 문제가 된다. 그래서 슬래시로 변환해서 클라이언트로 보냄.
//		orderProductList.forEach(vo -> {
//					vo.setPro_up_folder(vo.getPro_up_folder().replace("\\", "/"));
//				});

		orderProductList.forEach(vo -> {
			vo.getProductVO().setPro_up_folder(vo.getProductVO().getPro_up_folder().replace("\\", "/"));
		});

		model.addAttribute("orderProductList", orderProductList);


		return "/admin/order/order_detail_product";
	}



	//상품리스트에서 보여줄 이미지.  <img src="매핑주소">
	@ResponseBody
	@GetMapping("/imageDisplay") // /admin/product/imageDisplay?dateFolderName=값1&fileName=값2
	public ResponseEntity<byte[]> imageDisplay(String dateFolderName, String fileName) throws Exception {

		return FileUtils.getFile(uploadPath + dateFolderName, fileName);
	}
}
