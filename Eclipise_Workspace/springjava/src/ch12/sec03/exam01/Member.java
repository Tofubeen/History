package ch12.sec03.exam01;

//클래스가 상속하지 않은 경우에는 object 클래스를 자동으로 상속받는다
public class Member  {//extends object

	public String id;
	
	public Member(String id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			Member target = (Member) obj;
			if(id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}
}
//	object 클래스의 equals() 메소드는 객체의 주소를 비교하는 목적을 갖고있다
//	member() equal() 메소드를 재정의하여, Member 클래스의 용도에


	