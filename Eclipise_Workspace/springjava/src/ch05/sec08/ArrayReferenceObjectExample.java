package ch05.sec08;

public class ArrayReferenceObjectExample {

	public static void main(String[] args) {
		//배열을 사용하는 목적
		//참조타입 배열
		
		
		/*
		 * 
		 * String str1, str2 , str3
		 */
		
		String[] strArray = new String[3];
		strArray[0] = "JAVA";//0,1은 같은 장소를 가리킴
		strArray[1] = "JAVA";
		strArray[2] = new String("JAVA"); //참조타입 사용방식 (새로운 생성자를 만드는것, 즉 새로운 주소로 값을 참조한다는 의미)
		
		//주소비교
		System.out.println(strArray[0] == strArray[1]); //true
		System.out.println(strArray[0] == strArray[2]); //false
		
		//데이터 비교(값)
		System.out.println(strArray[0].equals(strArray[2])); //true
		
		//배열의 크기(길이) 변경은 할수가 없다
		//length 속성은 get 지원, set지원은 안함
//		strArray.length = 30;
		
	}

}
