package ch06.sec12.hyundai;

import ch06.sec12.hankook.SnowTire;
import ch06.sec12.kumho.AllSeasonTire;

//다른 패키지의 동일한 이름의 클래스를 사용시, 풀네임 형식으로 코딩하라.
//동일한 이름없이 유일한 이름의 클래스라면 자동으로 import 기능이 붙여지는 형식 그대로 쓴다
//(패키지명).클래스이름 변수명 = new (패키지명).클래스이름();
// import 코드 사용하지 말것.

public class Car {
		
	ch06.sec12.hankook.Tire tire1 = new ch06.sec12.hankook.Tire();
	ch06.sec12.kumho.Tire tire2 = new ch06.sec12.kumho.Tire();
	SnowTire tire3 = new SnowTire();
	AllSeasonTire tire4 = new AllSeasonTire();
	
	
	
}
