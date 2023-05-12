package day13.api.util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		
		
		Date date = new Date();
		System.out.println(date);
		
		//1970년 1월 1일 0시를 기준으로 현재(오늘)까지 밀리초로 계산 => 날짜연산
		long millis = date.getTime();
		System.out.println(millis);
		
		int year = date.getYear();
		System.out.println(year);
		
		//현재시간 + 1초
		Date date2 = new Date( System.currentTimeMillis() + 1000 );
		System.out.println(date2); //+1000 더해서 1초 차이남
		
		long millis2 = date2.getTime();
		System.out.println(millis2 - millis);//시간차
		
		System.out.println("------------------------------");
		
		//사람이 보기편한 날짜로 변환 (년 월 일 시:분:초)
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy MM dd hh:mm:ss");//날짜포맷 지정 가능
		
		String now = sdf.format(date);
		System.out.println(now);
		
	}
}
