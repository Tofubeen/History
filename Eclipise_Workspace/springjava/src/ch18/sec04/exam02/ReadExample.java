package ch18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {

	public static void main(String[] args) {
		//문자기반의 입력스트림 작업
		
		Reader reader = null;
		
		try {
			reader = new FileReader("C:/dev/temp/test.txt");
			while(true) {
				int data = reader.read(); //1문자씩 읽기
				if(data == -1) break;
				System.out.print((char)data);
			}
			reader.close();
			System.out.println();
			
			//문자배열로 읽기
			reader = new FileReader("C:/dev/temp/test.txt");
			char[] data = new char[100];// 배열의 크기
			while(true) {
				int num = reader.read(data); // 배열의 크기만큼 읽기         200바이트씩 읽기.
				if(num == -1) break;
				for(int i =0; i<num; i++) {
					System.out.print(data[i]);
				}
			}
			
			
			
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
