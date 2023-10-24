package ch19.sec03.exam02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("192.168.0.49" , 50001); //객체가 생성되면, 서버와의 연결이 됨을 의미한다.
			
			System.out.println("[클라이언트] 연결 성공");
			
			//입출력스트림 작업: 채팅
			//데이터보내기
			/*
			String sendMessage = "[배권혁] : 추석 연휴를 즐겁게 보내면서, 공부도 하자(술도 조금만 먹고)";
			OutputStream os = socket.getOutputStream(); //byte 기반으로 작업하는 클래스
			//String -> byte 변환작업
			byte[] bytes = sendMessage.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("[클라이언트] 데이터 보냄 " + sendMessage);
			*/
			
			//보조스트림을 이용한 출력작업
			String sendMessage = "[배권혁] : 추석 연휴를 즐겁게 보내면서, 공부도 하자(술도 조금만 먹고)";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[클라이언트] 데이터 보냄 " + sendMessage);
			
			
			
			
			
			
			
			//데이터 받기.
			/*
			InputStream is = socket.getInputStream();
			byte[] bytes2 = new byte[1024]; //입력스트림을 통하여, 읽어들인 데이터 저장목적
			int readByteCount = is.read(bytes2); //읽어들인 바이트 개수 리턴
			// byte -> String 변환 
			String message = new String(bytes2, 0 ,readByteCount);
			System.out.println("서버로 부터 받은 내용: " + message);
			*/
			
			
			//보조스트림을 이용한 입력작업
			DataInputStream dis = new DataInputStream(socket.getInputStream()); 
			String message = dis.readUTF();
			System.out.println("[클라이언트] 서버로 부터 받은 내용: " + message);

			
			
			//socket 닫기
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
			
		} catch (UnknownHostException e) {
			//IP표기 방법이 잘못되었을 경우

		} catch (IOException e) {
			//채팅 포트 서버에 연결 할 수 없는  경우
		}
	}

}
