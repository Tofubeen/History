package ch18.sec11;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws Exception {
		
		//File객체 생성
		File dir = new File("C:/dev/temp/images"); //객체생성 한다고 해서 폴더 또는 파일이 생성되는 것은 아니다.
		File file1 = new File("C:/dev/temp/file1.txt"); 
		File file2 = new File("C:/dev/temp/file2.txt");
		File file3 = new File("C:/dev/temp/file3.txt");
		
		//존재하지 않으면 파일 또는 폴더 생성작업
		if(dir.exists()==false) {dir.mkdirs();}
		if(file1.exists() == false) {file1.createNewFile();}
		if(file2.exists() == false) {file2.createNewFile();}
		if(file3.exists() == false) {file3.createNewFile();}
		
		//Temp 폴더의 내용을 출력
		File temp = new File("C:/dev/temp");
		File[] contents = temp.listFiles();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		for(File file : contents) {
			System.out.printf("%-25s" , sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.printf("%-10s%-20s" , "<DIR>", file.getName()); //폴더명
			}else {
				System.out.printf("%-10s%-20s" , file.length(), file.getName() ); //파일명
			}
			System.out.println();
		}
	}
	/*
File dir = new File("C:/dev/temp/images");: C:/dev/temp/images 경로의 디렉토리를 나타내는 File 객체 dir을 생성합니다.

File file1 = new File("C:/dev/temp/file1.txt");: C:/dev/temp/file1.txt 경로의 파일을 나타내는 File 객체 file1을 생성합니다.

File file2 = new File("C:/dev/temp/file2.txt");: C:/dev/temp/file2.txt 경로의 파일을 나타내는 File 객체 file2을 생성합니다.

File file3 = new File("C:/dev/temp/file3.txt");: C:/dev/temp/file3.txt 경로의 파일을 나타내는 File 객체 file3을 생성합니다.

if(dir.exists()==false) {dir.mkdirs();}: dir이 존재하지 않으면 (exists()로 확인), 해당 디렉토리를 생성합니다. mkdirs()를 사용하면 중간 경로의 디렉토리도 함께 생성됩니다.

파일들도 비슷한 방식으로 생성합니다.

File temp = new File("C:/dev/temp");: C:/dev/temp 경로를 나타내는 File 객체 temp를 생성합니다.

File[] contents = temp.listFiles();: temp 디렉토리 내의 모든 파일과 디렉토리를 배열로 가져옵니다.

SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");: 날짜를 원하는 형식으로 포맷팅하기 위한 SimpleDateFormat 객체 sdf를 생성합니다.

for(File file : contents) { ... }: temp 내의 파일과 디렉토리를 순환하면서 각 항목에 대한 정보를 출력합니다.

if(file.isDirectory()) { ... }: 만약 현재 항목이 디렉토리인 경우, "<DIR>"과 폴더 이름을 출력합니다.

else { ... }: 그렇지 않으면 파일의 크기와 파일 이름을 출력합니다.

이 코드는 디렉토리와 파일을 생성하고, 해당 디렉토리 내의 내용을 나열하는 예제입니다.
	 */

}
