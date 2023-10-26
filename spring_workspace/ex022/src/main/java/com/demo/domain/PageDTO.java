package com.demo.domain;

import lombok.Getter;
import lombok.ToString;

// 페이징 기능 목적 클래스     --    [prev] 1 2 3 4 5 6 7 8 9 10 [next] -- 페이지 밑에 이런 모양 , 그리고 1~10까지 보여지는 이 모습을 블럭이라 한다

@Getter
@ToString
public class PageDTO {

   private int startPage; //각 불럭에서 보여줄 시작페이지 번호
   private int endPage; // 각 블럭에서 출력할 종료페이지 번호

   private boolean prev, next; //이전, 다음 표시여부

   private int total;//테이블의 데이터 총 갯수

   private Criteria cri; //1) 페이징: pageNum , amount  2) 검색: type, keyword

   public PageDTO(Criteria cri, int total) {
	   
	  /* 나머지가 존재하면 ,  페이지 +1개 필요
 	   1)
	   total  : 13개
	   amount : 5개
	   페이지 수: 3 
	   
	   2) 나머지가 존재안하면 ,  페이지 +1개 불필요
	   total  : 10개
	   amount : 5개
	   페이지 수: 2
	   
	   */
	   
	  
      this.cri = cri;
      this.total = total;

      int pageSize = 10; //블럭에 보여줄 페이지 번호의 갯수
      int endPageInfo = pageSize - 1;

      //this.endPage = (int) (Math.ceil( 10 /.10.0 / (double) pageSize)) * pageSize;
      this.endPage = (int) (Math.ceil(cri.getPageNum() / (double) pageSize)) * pageSize;
      
//      this.startPage = 10 - 9;
      this.startPage = this.endPage - endPageInfo;
      
//      int readEnd = (int) (Math.ceil((13.0 * 1.0) / cri.getAmount()));
      int readEnd = (int) (Math.ceil((total * 1.0) / cri.getAmount()));
      
      if(readEnd <= this.endPage) {
         this.endPage = readEnd;
      }
      
      this.prev = this.startPage > 1;
      this.next = this.endPage < readEnd;
      
      //pageNum=1, amount=10, type=null, keyword=null
      //pageSize , startPage , endPage, prev, next
   }
}