package day13.generic.good;

import day13.generic.bad.Person;

public class MainClass {

	public static void main(String[] args) {
		
		//ABC abc = new ABC();
		
		ABC<String> abc = new ABC<String>();
		
		abc.setT("홍길동");
		String name = abc.getT();
		
		
		
		ABC<Person> abc2 = new ABC<>(); //생성자 꺽쇠는 생략가능
		
		abc2.setT(new Person());
		Person p = abc2.getT();
		
		ABC<Object> abc3 = new ABC<>();
		
		//제네릭 타입은 원시타입 x
		//Integer 로 사용해야합니다. - 정수를 쓰고싶으면
		//ABC<int> abc4 = new ABC<>();
		
		////////////////////////////////////////////////////////
		DEF<Integer, String> def = new DEF<>();
		
		
		
		
		
	}
}
