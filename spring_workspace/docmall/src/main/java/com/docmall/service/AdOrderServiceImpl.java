package com.docmall.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.docmall.domain.OrderDetailInfoVO;
import com.docmall.domain.OrderDetailProductVO;
import com.docmall.domain.OrderVO;
import com.docmall.dto.Criteria;
import com.docmall.mapper.AdOrderMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdOrderServiceImpl implements AdOrderService {

	private final AdOrderMapper adOrderMapper;

	@Override
	public List<OrderVO> order_list(Criteria cri) {
		return adOrderMapper.order_list(cri);
	}

	@Override
	public int getTotalCount(Criteria cri) {
		return adOrderMapper.getTotalCount(cri);
	}

	@Override
	public List<OrderDetailInfoVO> orderDetailInfo1(Long ord_code) {
		return adOrderMapper.orderDetailInfo1(ord_code);
	}

	//mybatis에서 resultmap 사용
	@Override
	public List<OrderDetailProductVO> orderDetailInfo2(Long ord_code) {
		// TODO Auto-generated method stub
		return adOrderMapper.orderDetailInfo2(ord_code);
	}

	@Override
	public void order_product_delete(Long ord_code, Integer pro_num) {
		adOrderMapper.order_product_delete(ord_code, pro_num);
	}

}
