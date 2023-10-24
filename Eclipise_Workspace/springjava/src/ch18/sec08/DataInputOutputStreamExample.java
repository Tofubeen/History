package ch18.sec08;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

//보조스트림 : 기본타입스트림
public class DataInputOutputStreamExample {

	public static void main(String[] args) throws Exception {

		// 출력스트림에 보조스트림 연결
		FileOutputStream fos = new FileOutputStream("C:/dev/temp/primtive.db");// 이 한줄로 파일생성함
		DataOutputStream dos = new DataOutputStream(fos);// 안에 데이터 작업은 이 줄로 시작

		// 기본타입 출력작업: 스트림에 내용을 채우기
		dos.writeUTF("홍길동");
		dos.writeDouble(95.5);
		dos.writeInt(1);

		dos.writeUTF("이강인");
		dos.writeDouble(90.3);
		dos.writeInt(2);

		dos.flush();

		// 객체닫기는 객체생성의 역순으로 작업
		dos.close();
		fos.close();

		// 입력스트림에 보조스트림 연결
		FileInputStream fis = new FileInputStream("C:/dev/temp/primtive.db");
		DataInputStream dis = new DataInputStream(fis);

		// 기본타입 입력작업(Read) : 출력작업순서를 참고해야 한다.
		for (int i = 0; i < 2; i++) {
			String name = dis.readUTF(); // dos.writeUTF ();
			double score = dis.readDouble();// dos.writeDouble();
			int order = dis.readInt(); // dos.writeInt()
			System.out.println(name + " : " + score + " : " + order);
		}

		//객체닫기
		dis.close();
		fis.close();
	}

}
