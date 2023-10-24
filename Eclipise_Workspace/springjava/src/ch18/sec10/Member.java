package ch18.sec10;

import java.io.Serializable;

//객체 직렬화 작업에 사용할 클래스는 Serializable 인터페이스를 상속(구현) 해야 한다. 
//serialVersionUID 필드 : 직렬화할 때 사용된 클래스와 역직렬화할 때 사용된 클래스는 동일한 클래스여야 함 
//클래스 이름이 같더라도 , 내용이 다르면 역직렬화 작업에서 에러가 발생된다.
public class Member implements Serializable {

   /**
	 * 
	 */
	private static final long serialVersionUID = 6237230879659378976L;
	private String id;
	private String name;

   public Member(String id, String name) {
      this.id = id;
      this.name = name;
   }

   @Override
   public String toString() {
      return id + ": " + name;
   }

}