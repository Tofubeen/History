package com.docmall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.docmall.domain.OrderDetailInfoVO;
import com.docmall.domain.OrderDetailProductVO;
import com.docmall.domain.OrderVO;
import com.docmall.dto.Criteria;

public interface AdOrderMapper {

	//데이터가 여러개면 List 단독이면 List가 빠진다
	List<OrderVO> order_list(@Param("cri")Criteria cri ,@Param("start_date")String start_date,@Param("end_date")String end_date);

	int getTotalCount(@Param("cri")Criteria cri ,@Param("start_date")String start_date,@Param("end_date")String end_date);

	List<OrderDetailInfoVO> orderDetailInfo1(Long ord_code);

	//기존클래스 OrderDetailVO ,ProductVO 필드가 있는 클래스
	List<OrderDetailProductVO> orderDetailInfo2(Long ord_code);

	void order_product_delete(@Param("ord_code") Long ord_code, @Param("pro_num") Integer pro_num);




}
