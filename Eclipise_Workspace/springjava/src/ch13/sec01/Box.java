package ch13.sec01;

// 제네릭이 있는 클래스
/*
  class 클래스명 <T> {}
  Box<String> box1 = new Box<String>();

  public class Box {
		public String content;
	}

  Box<Integer> box2 = new Box<Integer>();
		box2.content = 100;
		int value = box2.content;
	
 */
public class Box<T> {
	public T content;

	
	
}
