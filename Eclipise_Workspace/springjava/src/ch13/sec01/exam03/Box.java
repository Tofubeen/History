package ch13.sec01.exam03;

public class Box<T> {
	
	public T content; // 타입파라미터  미지정 시 object
	
	public boolean compare(Box<T> other) { //타입파라미터 지정안하면, compare(Box other)
		boolean result = content.equals(other.content);
		return result;
		
	}

}
