package ch18.sec04.exam01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample {

	public static void main(String[] args) {
		//문자스트림 기반의 출력작업
		
		try {
			Writer writer = new FileWriter("C:/dev/temp/test.txt"); //스트림 객체 생성시 파일 생성이 된다.
			
			//데이터
			//1)문자
			
			char a= 'A';
			writer.write(a);
			char b = 'B';
			writer.write(b);
			
			//2)char배열 
			char[] arr = {'C' , 'D', 'E' };
			writer.write(arr);
			
			
			
			//3)문자열
			writer.write("FGH");
			
			writer.flush(); // 버퍼내용이 test.txt 저장. 버퍼는 비워진다.
			
			writer.close(); // 출력스트림 닫기 (메모리 해제)
			
			//test.txt 최종 내용 : ABCDEFGH
			
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

}