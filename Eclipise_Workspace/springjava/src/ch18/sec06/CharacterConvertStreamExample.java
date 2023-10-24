package ch18.sec06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

/* 보조스트림
 	-메인스트림(1차스프림)을 기반으로 하여, 보조적으로 추가하여 사용하는 스트림.
-문자변환 스트림 : InputStreamReader, OutputStreamWriter
	바이트기반 스트림 -> 문자 기반 스트림으로 변환하여 작업할 때 사용
 */



class CharacterConvertStreamExample {

	
	//메소드 선언
	public static void main(String[] args) throws Exception {
		write("문자변환 스트림을 사용합니다.");
		String data = read();
		System.out.println(data);
		System.out.println();
	}
	
	//파일생성하여, 문자데이터를 쓰기 작업. 출력스트림
	public static void write(String str) throws Exception {
		//호출할 때 문자열이 전달되어 온다
		//스트림객체를 생성하면 , 파일이 생성. 자바는 기본 인코딩 UTF-8
		OutputStream os = new FileOutputStream("C:/dev/temp/test.txt");
		
		//작업
		
		//스트림-> 문자 기반으로 변환작업 . OutputStreamWriter
		//write메소드는 String 기반으로 작성되었으므로 writer.write(string타입) 으로 한다
		Writer writer = new OutputStreamWriter(os, "UTF-8");
		writer.write(str); // 스트림 안에 내용이 채워진 상태
		writer.flush(); //스트림 안의 내용을 파일에 쓰는 작업. 버퍼가 비워짐
		writer.close(); // 메소드 비활성화.
		
		
	}
	
	
	//파일의 내용을 읽기작업. 입력스트림
	public static String read() throws Exception {
		InputStream is = new FileInputStream("C:/dev/temp/test.txt");
		
		// 작업
		
		// 스트림 -> 문자 기반으로 변환작업. InputSteamReader
		Reader reader = new InputStreamReader(is, "UTF-8");
		char[] data = new char[100];
		int num = reader.read(data); // num은 읽어온 갯수
		reader.close();
		
		//문자열 변환
		String str = new String(data, 0, num);
		
		
		
		return str;
	}
}
