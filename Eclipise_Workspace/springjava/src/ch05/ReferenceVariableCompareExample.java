package ch05;

public class ReferenceVariableCompareExample {

	public static void main(String[] args) {
		//참조타입 객체(변수) 비교
		
		// int a = 10; 데이터는 스택영역에 기억장소가 생성되고 관리가 된다
		
		//참조타입으로 변수를 선언하면, 그 변수는 힙영역에 생성될 주소를 저장하는 목적으로 존재한다
		//스택영역에 기억장소가 생성되고 , 초기값은 null
		int [] arr1;
		int [] arr2;
		int [] arr3;
		
		//힙영역에 실제터이터가 저장되는 기억장소를 생성하고 , 그곳의 주소를 대입하는 구문
		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1,2,3};
		arr3 = arr2; //arr2에 저장되어있는 주소를 arr3에 대입한다
				
				//주소비교
		System.out.println(arr1 == arr2); //false
		System.out.println(arr2 == arr2); //true
		
		
 	}

}
