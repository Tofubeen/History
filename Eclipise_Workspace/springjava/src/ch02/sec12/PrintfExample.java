package ch02.sec12;

public class PrintfExample {

   public static void main(String[] args) {
      // System.out.println(); 콘솔 화면(모니터)에 값을 출력하는 기능
      
      // 상품의 가격: 123원
      int value = 123;
      System.out.println("상품의 가격: " + value + "원");
      
      // int → %d
      System.out.printf("상품의 가격: %d원\n", value);
      // %6d: 6은 6자리 공간, value 변수값이 오른쪽 정렬
      System.out.printf("상품의 가격: %6d원\n", value);
      // %-6d 6은 6자리공간.  value 변수값이 왼쪽 정렬
      System.out.printf("상품의 가격: %-6d원\n", value);
	  // %6d 6은 6자리공간.  value 변수값이 오른쪽 정렬, 왼쪽 3자리는 0으로 채움
      System.out.printf("상품의 가격: %06d원\n", value);
      
      double area = 3.14159 * 10 * 10;
    		  System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n ",10,  area); //314.159000 -> 314.16 반올림 처리됨.
    		  
    		  
    		  String name = "홍길동";
    		  String job = "도적";
    		  System.out.printf("%6d | %-10s | %10s\n", 1 ,name , job);
   }

}