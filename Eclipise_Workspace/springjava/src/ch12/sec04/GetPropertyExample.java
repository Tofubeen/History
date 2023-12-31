package ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {

	public static void main(String[] args) {
		//운영체제의 사용자 정보출력
		String osName = System.getProperty("os.name");
		String userName = System.getProperty("user.name");
		String userHome = System.getProperty("user.Home");
		System.out.println(osName);
		System.out.println(userName);
		System.out.println(userHome);
		
		//전체 키의 값을 출력
		System.out.println("--------------------");
		System.out.println(" key: value");
		System.out.println("--------------------");
		Properties props = System.getProperties();
		Set keys = props.keySet();
		for(Object objkey : keys) {
			String key = (String) objkey;
			String value = System.getProperty(key);
			System.out.printf("%-40s: %s\n", key, value);
		}
		
	}

}
