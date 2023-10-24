package ch18.sec10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectInputOutputStreamExample {

	public static void main(String[] args) throws Exception {

		FileOutputStream fos = new FileOutputStream("C:/dev/temp/object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//객체생성
		Member m1 = new Member("fall", "단풍이");
		Product p1 = new Product("노트북", 1500000);
		int[] arr1 = {1,2,3};
		
		//객체룰 직렬화하여 파일에 저장
		oos.writeObject(m1);
		oos.writeObject(p1);
		oos.writeObject(arr1);
		
		oos.flush();
		
		//객체닫기
		oos.close();
		fos.close();
		
		//입력스트림작업
		FileInputStream fis = new FileInputStream("C:/dev/temp/object.dat");
		//보조스트림작업
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		//파일의 내용을 읽고 역직렬화해서 객체로 복원. 직렬화 순서 일치.
		Member m2 = (Member) ois.readObject();
		Product p2 = (Product) ois.readObject();
		int[] arr2 = (int[]) ois.readObject();
		
		ois.close();
		fis.close();
		
		//복원된 객체 내용확인
		System.out.println(m2);
		System.out.println(p2);
		System.out.println(Arrays.toString(arr2));
		
		
		/*
		 FileOutputStream fos = new FileOutputStream("C:/dev/temp/object.dat");: object.dat 파일에 데이터를 쓸 수 있는 출력 스트림을 생성합니다.

ObjectOutputStream oos = new ObjectOutputStream(fos);: 객체를 직렬화하고 object.dat 파일로 출력하기 위한 ObjectOutputStream을 생성합니다.

Member m1 = new Member("fall", "단풍이");: Member 클래스를 사용하여 m1이라는 객체를 생성합니다.

Product p1 = new Product("노트북", 1500000);: Product 클래스를 사용하여 p1이라는 객체를 생성합니다.

int[] arr1 = {1,2,3};: 정수 배열 arr1을 생성하고 초기화합니다.

oos.writeObject(m1);: m1 객체를 직렬화하고 oos를 통해 파일에 씁니다.

oos.writeObject(p1);: p1 객체를 직렬화하고 파일에 씁니다.

oos.writeObject(arr1);: 정수 배열 arr1을 직렬화하고 파일에 씁니다.

oos.flush();: 출력 스트림을 비웁니다.

oos.close(); 및 fos.close();: 출력 스트림을 닫습니다.

FileInputStream fis = new FileInputStream("C:/dev/temp/object.dat");: object.dat 파일에서 데이터를 읽을 수 있는 입력 스트림을 생성합니다.

ObjectInputStream ois = new ObjectInputStream(fis);: 역직렬화하기 위한 ObjectInputStream을 생성합니다.

Member m2 = (Member) ois.readObject();: 파일에서 읽은 데이터를 Member 객체 m2로 역직렬화합니다.

Product p2 = (Product) ois.readObject();: 파일에서 읽은 데이터를 Product 객체 p2로 역직렬화합니다.

int[] arr2 = (int[]) ois.readObject();: 파일에서 읽은 데이터를 정수 배열 arr2로 역직렬화합니다.

ois.close(); 및 fis.close();: 입력 스트림을 닫습니다.

복원된 객체 내용을 출력합니다. 이 부분에서 m2, p2, arr2의 값을 출력합니다.

이 코드는 객체를 직렬화하고 다시 역직렬화하여 파일에 저장하고 읽어오는 예제입니다.
		 */
	}

}
