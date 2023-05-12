package day08.super_2;

public class Person {

	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
		
		System.out.println( this ); //?
	}
	
	Person(String name) {
		//this.name = name;
		//this.age = 1;
		//System.out.println(this);
		this(name, 1); //내 생성자 호출 현재 1번 생성자 호출
	}
	
	Person() {
		//this.name = "이름없음";
		//this.age = 1;
		//System.out.println(this);
		this("이름없음", 1);
	}
	
	String info() {
		return "이름:" + name + ", 나이:" + age;
	}
}
