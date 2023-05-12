package day08.super_;

public class Child extends Parent {

	String me;
	
	//부모닝믜 기본생성자가 없을 때 해결 2가지 방안
	//1. 부모님의 기본생성자를 만든다.
	//2. 자식에서 super() 통해서 부모님의 생성자와 강제연결한다.
	
	Child(String me) {
		super("홍순자","홍길동"); //입력함으로써 부모클래스에서 입력한 변수가 같은 타입인 생성자와 연결됨.
		this.me = me;
	}
}
