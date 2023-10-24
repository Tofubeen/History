package ch15.sec04.exam01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

//Map 인터페이스를 구현한 HashMap 클래스예제
//key , value 한쌍의 구조로 되어 관리한다. 한쌍의 구조를 Entry 로 부른다
//key는 중복불가능 value 중복허용
public class HashSetExample {

	public static void main(String[] args) {
//		HashMap<String, Integer> map = new HashMap<>();
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 85);
		map.put("이순신", 95);
		map.put("홍범도", 80);
		map.put("홍길동", 80); // "홍길동" key가 중복되지만 , 기존 키에 값이 저장된다
		
	System.out.println("총 Entry 수: " + map.size());
	System.out.println();
	
	//키로 값 얻기
	String key = "홍길동";
	int value = map.get(key);
	System.out.println(key + " : " + value);
	System.out.println();
		
	Set<Entry<String, Integer>> entrySet = map.entrySet();
	Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
	while(entryIterator.hasNext()) {
		Entry<String, Integer> entry = entryIterator.next(); 
		String k = entry.getKey();
		Integer v = entry.getValue();
		System.out.println(k + " : " + v);
	}
	System.out.println();
	
	map.remove("홍길동");
	System.out.println("총 Entry 수: " + map.size());
	System.out.println();
	}

}
