package day10.static_basic;

public class Init {

	public static int price; //price = 1000; 도 가능
	
	static {
		System.out.println("단 한번 실행됨");
		price = 1000;
	}
}
