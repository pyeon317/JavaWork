package day10.static_.singleton;

public class Singleton {
//팩토리메서드,인터페이스채턴,추상팩토리패턴, 빌더패턴, 퍼사드 패턴 등등 
	
	
	//싱글톤 - 객체가 1개만 생성되도록 클래스를 설계하는 패턴
	//1. 나 자신의 객체를 1개 생성
	//Singleton instance = new Singleton();
	//여기서 끝내면 싱글톤의 싱글톤이 계속 생성됨. 클래스 -> 생성 -> 클래스 -> 생성 반복
	
	static Singleton instance = new Singleton(); //이러면 1개만 생성
	
	//2. 객체를 직접 생성 할 수 없도록 생성자를 private 선언합니다.
	private Singleton() {
				
	}
	//3. 외부에서 객체생성을 요구할 때. getter 를 통해서 instance반환시킴
	public static Singleton getInstance() {
		return instance;
	}
	
	private String domain = "www.aaa.com";
	
	public String getDomain() {
		return domain;
	}
	
	
	
}
