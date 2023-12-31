package com.docmall.domain;

import lombok.Data;


//관리자기능
// 주문상세정보 저장목적 (주문상세테이블과 상품테이블 조인결과) , 중복되는 항목은 1개를 제외하자
//OT.ORD_CODE, OT.PRO_NUM, OT.DT_AMOUNT, P.PRO_NAME, P.PRO_PRICE, P.PRO_CONTENT, P.PRO_UP_FOLDER, P.PRO_IMG
@Data
public class OrderDetailInfoVO {

	private	Long 	ord_code;
	private Integer pro_num;
	private	String	pro_name;
	private	int		pro_price;
	private int 	dt_amount;

	private int 	ord_price; // 주문금액 : pro_price * dt_amount

	private	String	pro_up_folder;
	private	String	pro_img;



}
