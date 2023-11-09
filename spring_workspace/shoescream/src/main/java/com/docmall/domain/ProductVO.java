package com.docmall.domain;

import java.util.Date;

import lombok.Data;
@Data
public class ProductVO {

	private Integer PRO_NUM; //시퀀스 생성
	private Integer CG_CODE; //2차카테고리 코드
	private String PRO_NAME;
	private int PRO_PRICE;
	private int PRO_DISCOUNT;
	private String PRO_PUBLISHER;
	private String PRO_CONTENT;
	private String PRO_UP_FOLDER;
	private String PRO_IMG;
	private int PRO_AMOUNT;
	private String PRO_BUY;
	private Date PRO_DATE;
	private Date PRO_UPDATEDATE;



}
