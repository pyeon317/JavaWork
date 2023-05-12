package day13.api.util.date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		//추상 클래스라서 객체생성 불가능
		//Calendar cal = new Calendar();
		
		//변수가 객체를 가지고 있는 모형
		//static메서드를 사용해서 객체를 반환하는 모형
		Calendar cal = Calendar.getInstance();
		
		System.out.println(Calendar.YEAR); //1
		System.out.println(Calendar.MONTH); //2
		System.out.println(Calendar.DATE); //5
		
		
		int year = cal.get(Calendar.YEAR);
		System.out.println(year); //년
		
		int month = cal.get(Calendar.MONTH);
		System.out.println(month + 1); //월 - 월만 쓰면 지난달 숫자가 나옴
		
		int day = cal.get(Calendar.DATE);
		System.out.println(day); //일
		
		int hour = cal.get(Calendar.HOUR); //시
		int minr = cal.get(Calendar.MINUTE); //분
		int second = cal.get(Calendar.SECOND); //초
		
		
		
		
	}
}
