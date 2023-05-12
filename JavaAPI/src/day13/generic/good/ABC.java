package day13.generic.good;

public class ABC<T> { //클래스에 전달되는 매개변수 타입, 
	//클래스 or 인터페이스의 매개변수 <>
	//T는 미정, 객체를 생성할 당시에 결정합니다.
	private T t;
	
	public void setT(T t) {//string a 처럼 타입 변수
		this.t = t;
	}
	
	public T getT() {
		return t;
	}
}
