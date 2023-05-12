package day10.final_basic;

public class Person {

	//final 변수는 반드시 초기화를 합니다.
	//생성자를 통한 초기화 or 직접 초기화
	public final String nation = "한국"; //="한국"없으면 에러남
	public final String ssn;//
	public String name;
	
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
