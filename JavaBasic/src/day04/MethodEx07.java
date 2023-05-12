package day04;

public class MethodEx07 {

	public static void main(String[] args) {
		
		//메서드의 연쇄호출 (동기적 방식) - 메서드 안에 메서드를 넣어서 동기화시키는 방식?
		//메서드 안에서 메서드 호출이 가능함
		//test01();
		
		recursive(1);
		
		System.out.println( fac(5) );
		
	}
	
	static void test01() {
		System.out.println("1번 메서드 실행");
		test02();
		System.out.println("1번 메서드 종료");
	}
	
	static void test02() {
		System.out.println("2번 메서드 실행");
		
		System.out.println("2번 메서드 종료");
	}
	
	static void recursive(int a) {
		//함수의 재귀는 반드시 탈출의 조건이 있어야 합니다.
		if(a == 10) {
			return; //함수의 종료
		}
		System.out.println(a + "호출");
		a++;
		recursive(a); //자기 자신을 호출 - 조건이 없으면 무한히 증가함
	}
	
	static int fac(int a) { //팩토리얼 만들기
		
		if(a == 1) {
			return 1;
		}
		
		return a * fac(a-1); //a*a-1 그리고 리턴해서 a-1*a-2 ...조건없으면 무한반복
	}
	
}

