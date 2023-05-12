package day08.modi.protec.pac1;

public class A {
	/*
	 * protected는 기본적으로 같은 패키지에서만 접근이 가능합니다.
	 * 단, 패키지가 다르더라도 상속관계에서 super키워드 참조가 가능합니다.
	 */
	//멤버변수
	protected boolean bool;
	//생성자
	protected A() {
		
	}
	//메서드
	protected void method() {
		
	}
}
