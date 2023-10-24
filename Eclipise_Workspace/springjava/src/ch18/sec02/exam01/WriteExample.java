package ch18.sec02.exam01;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample {

	public static void main(String[] args) {
		// 파일에 출력작업하는 예제
		// 대상: 파일, 작업방향 : 출력스트림(output) /데이터 : (바이트 스트림)

		try {
			//os: 파일출력스트링 객체(빨대)
//			FileOutputStream os = new FileOutputStream("C:/dev/temp/test1.db"); // 파일생성
			OutputStream os = new FileOutputStream("C:/dev/temp/test1.db"); // 파일생성

			//데이터
			byte a = 10;
			byte b = 20;
			byte c = 30;
			
			//버퍼(빨대) 내부에 데이터 쓰는 작업( 빨대 안에 byte a,b,c를 넣은거임)
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush(); //버퍼(빨대안에) 의 내용을 test1.db 파일에 쓰기작업(꽂고 넣기)
			os.close(); //스트림객체를 닫기.(빨대를 제거)
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
