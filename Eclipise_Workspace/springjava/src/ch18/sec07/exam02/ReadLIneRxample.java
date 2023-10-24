package ch18.sec07.exam02;

import java.io.BufferedReader;
import java.io.FileReader;

//파일의 내용을 읽기
//문자기반 방식
public class ReadLIneRxample {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader("src/ch18/sec07/exam02/ReadLIneRxample.java"));
		
		
		int lineNo = 1; //라인 (행)
		while(true) {
			String str = br.readLine();
			if(str == null) break;
			System.out.println(lineNo + "\t" + str);
			lineNo++;
		}
		
		br.close();
	}

}
