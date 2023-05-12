package day07.overload;

public class Basic {

	/*
	 * 오버로딩 - 같은 이름의 메서드를 여러개 생성하는 것
	 * 
	 * 규칙
	 * 1. 이름은 똑같음
	 * 2. 매개변수를 다르게 해서 모형을 다르게 해야합니다.
	 * 3. 반환유형은 오버로딩에 영향을 미치지 않습니다.
	 */
	
	void input(int a) {
		System.out.println("정수 1개 입력받음");
	}
	
//	int input(int x) {
//		return 0;
//	}                       매개변수가 같아서 에러가 일어남.
	
	void input(String a) {  
		System.out.println("문자열 1개 입력받음");  //매개변수가 달라서 가능
	}
	
	void input(int a, double b) {
		System.out.println("정수 1개, 실수 1개 입력받음");  // 매개변수 개수가 다름
	}
	
	void input(double b, int a) {
		System.out.println("실수 1개, 정수 1개 입력받음");  // 매개변수 순서가 다름
	}
	
	void input(int a, char b, double c) {
		System.out.println("정수 1개, 문자 1개, 실수 1개 입력받음");
	}
	
	
	
}
