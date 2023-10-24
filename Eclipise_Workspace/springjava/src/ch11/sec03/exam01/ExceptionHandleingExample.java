package ch11.sec03.exam01;

//다중예외처리 예제- 실행시 오류가 2개이상 존재했을 때 예외처리하는 문법
//배열의 array[1] 값이 숫자형태의 문자열이 아니므로 정수변환시 예외발생
//배열의 array[2] 인덱스가 존재하지 않아 ,예외 발생
public class ExceptionHandleingExample {

	public static void main(String[] args) {

		String[] array = {"100", "1oo"}; //알파벳 o 을 입력
		
		for( int i = 0 ; i <= array.length; i++) {
			 try{
			int value = Integer.parseInt(array[i]); //array[0], array[1], array[2]
			System.out.println("array[" + i + "]: " + value);
			}catch(NumberFormatException e) {
				System.out.println("숫자로 변환 할수 없음: " + e.getMessage());
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("배열 인덱스가 초과됨: " + e.getMessage());
			}
		}
	}

}
