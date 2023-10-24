package ch03.sec01;

public class IncDecOperatorExample {

   public static void main(String[] args) {
      // 증감 연산자: ++, --
      int x = 10;
      int y = 10;
      int z;
      
      // 구문이 단독으로 사용되면, 증감연산자가 변수 위치에 상관없이 변수 자신에 +1을 해서 저장한다.
      x++; // 후위형 증가연산자
      ++x; // 전위형 증가연산자
      
      System.out.println("x=" + x);
      
      System.out.println("----------------------");
      // 구문이 단독으로 사용되면, 증감연산자가 변수 위치에 상관없이 변수 자신에 -1을 해서 저장한다
      y--;
      --y;
      System.out.println("y=" + y);
      
      System.out.println("----------------------");
      
//      아래구문에 주석을 번갈아 가면 , 값을 더한다 
      z = ++x; // x의 변수에 1을 더하여 저장한 후 값을 읽어와서 z변수에 값을 대입한다 
      z = x++; // x의 변수값을 먼저 읽어와서 z변수에 값을 대입한다 .그리고 x자신에 1을 더하여 저장한다
      
      System.out.println("z=" + z);
      System.out.println("x=" + x);
      
      System.out.println("----------------------");
      z=++x + y++; //
      
      System.out.println("z=" + z);
      
      System.out.println("x=" + x);
      System.out.println("y=" + y);
   }

}