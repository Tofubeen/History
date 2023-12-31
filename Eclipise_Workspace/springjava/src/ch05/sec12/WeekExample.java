package ch05.sec12;

import java.util.Calendar;

public class WeekExample {

	public static void main(String[] args) {
		
		Week today = null;
		
		// Date, Calendar, LocalDate 등
		Calendar cal = Calendar.getInstance(); // 시스템의 날짜,시간정보를 참조
		
		int week = cal.get(Calendar.DAY_OF_WEEK);  // 1~7  1은 SUNDAY(일요일)
		
		switch(week) {
			case 1: today = Week.SUNDAY; break;
			case 2: today = Week.MONDAY; break;
			case 3: today = Week.TUESDAY; break;
			case 4: today = Week.WEDNESDAY; break;
			case 5: today = Week.THURSDAY; break;
			case 6: today = Week.FRIDAY; break;
			case 7: today = Week.SATURDAY; break;
		}
		
		if(today == Week.SUNDAY) {
			System.out.println("휴식을 한다.");
		}else {
			System.out.println("자바 공부를 한다.");
		}
	}

}
