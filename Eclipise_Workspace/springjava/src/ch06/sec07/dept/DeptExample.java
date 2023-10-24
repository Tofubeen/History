package ch06.sec07.dept;

public class DeptExample {

	public static void main(String[] args) {
		
		Dept d1 = new Dept();
				
		Dept d2 = new Dept(100);
		
		Dept d3 = new Dept(101, "총무부");
		
		Dept d4 = new Dept(102, "홍보부", "서울");
		
		System.out.println(d2.deptno);
	}

}
