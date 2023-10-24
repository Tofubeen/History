package ch18.sec07.exam01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

//보조스트림을 사용 유무에 따른 복사예제
//버퍼스트림. BufferedInputStrean BufferedOutputStream

public class BufferExample {

	public static void main(String[] args) throws Exception {
		//작업1)  입출력 스트림 생성
	      // C:\Dev\devtools\workspace\springjava\bin\ch18\sec07\exam01\originalFile1.jpg
		String originalFilePath1 = BufferExample.class.getResource("originalFile1.jpg").getPath();
		String targetFilePath1 = "C:/dev/temp/targetFile1.jpg";
		FileInputStream fis = new FileInputStream(originalFilePath1);
		FileOutputStream fos = new FileOutputStream(targetFilePath1);
		
		//작업2) 입출력 스트림 생성 + 버퍼스트링 생성(보조)
		String originalFilePath2 = BufferExample.class.getResource("originalFile2.jpg").getPath();
		String targetFilePath2 = "C:/dev/temp/targetFile2.jpg";
		
		FileInputStream fis2 = new FileInputStream(originalFilePath2); //메인스트림
		BufferedInputStream bis = new BufferedInputStream(fis2); //보조스트림
		
		FileOutputStream fos2 = new FileOutputStream(targetFilePath2); //메인스트림
		BufferedOutputStream bos = new BufferedOutputStream(fos2); //보조스트림
		
		//파일복사기능
		long nonBufferTime = copy(fis, bos); //버퍼스트림 미사용
		System.out.println("버퍼스트림 미사용:\t " + nonBufferTime);
		
		long bufferTime = copy(bis, bos); // 버퍼스트림 사용
		System.out.println("버퍼스트림 사용:\t " + bufferTime + " ns");
		
		
		//입출력스트림에서는 객체생성하면, 객체닫기를 반드시 해야한다. 닫기순서는 생성을 역순으로 하면된다.
		fis.close();
		fos.close();
		
		bis.close();
		fis2.close();
		
		bos.close();
		fos2.close();
		
		
		
	}
	
	//파일복사기능 . 버퍼보조스트림 사용유무에 따른 시간체크. 최상위 추상클래스 InputStream, OutputStream
	public static long copy(InputStream is, OutputStream os) throws Exception {
		
		
		//시작시간
		long start = System.nanoTime(); //1970.1.1 0:00:00
		
		//복사작업
		while(true) {
			int data = is.read(); //입력(읽기)스트림 작업한것
			if(data == -1) break;
			os.write(data); //출력(쓰기)스트림 작업한것
		}
		
		
		//종료시간
		long end = System.nanoTime();
		return (end - start); //복사시간
	}
	
	
	
	
	
	
}
