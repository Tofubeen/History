package ch18.sec02.exam02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {

    public static void main(String[] args) throws IOException {
        OutputStream os = new FileOutputStream("C:/dev/temp/test2.db"); // 파일 생성

        // 데이터
        byte[] array = { 10, 20, 30 };

        // 버퍼(빨대 안) 내용 채우기
        os.write(array);

        // 버퍼(빨대 안) 내용 쓰기 - test2.db
        os.flush();

        // 스트림 객체 닫기(빨대 제거)
        os.close();
    }
}
