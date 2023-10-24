package ch15.sec05.exam03;
//TreeSet 컬렉션클래스에 사용하는 클래스
public class Person implements Comparable<Person>{
	
	
	public String name;
	public int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//treeset.add(new Person
	@Override
	public int compareTo(Person o) {
//		System.out.println("compareTo");
		if(age< o.age) return -1; // -1 -> 1 내림차순
		else if (age == o.age) return 0;
		else return 1; //1 -> -1 내림차순
	}
	
	
}
