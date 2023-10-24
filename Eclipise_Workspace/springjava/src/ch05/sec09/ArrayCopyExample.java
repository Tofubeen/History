package ch05.sec09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		//배열복사 : System.arraycopy()메소드를 이용
		
		//길이가 3인 원본배열
		String[] oldStrArray = {"java", "array", "copy"};
		
		//길이가 5인 원본배열 
		String[] newStrArray = new String[5];
		
		//배열복사
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 3); 
//		"oldStrArray" 에 "1(0)" 번째부터 복사해서 "newStrArray" 에 "1(0)"번째 부터 붙여넣기 하는데 "3"개를 복사한다
		
		//배열항목출력
		for(int i = 0; i<newStrArray.length; i++) {
			System.out.print(newStrArray[i] + " , ");
		}
		
	}

}
