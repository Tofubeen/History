package com.docmall.domain;

import lombok.Data;

@Data
public class OrderDetailProductVO {

	//기존클래스 필드로 사용 mybatis 에서는 resultmap 사용해야 한다
	private OrderDetailVO orderDetailVO; //collection 으로 표현
	private ProductVO productVO; //collection 으로 표현
}
