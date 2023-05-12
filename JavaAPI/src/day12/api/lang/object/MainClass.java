package day12.api.lang.object;

import java.io.PrintStream;

public class MainClass {

	public static void main(String[] args) {
		 
		Person p = new Person("홍길동",3);
		
		Person p2 = new Person("홍길동",5);
		
		//equals
		//객체의 name변수가 같아면 true반환 하도록 오버라이딩
		boolean result = p.equals(p2); //equals 기본 기능은 객체판단이라서 두개가 이름만 같은 거니까 false인게 맞는데
									//Person에서 equals를 오버라이딩해서 String 비교로 바꿔버림. 그래서 이름같으면 true가 나오게 됨
		System.out.println(result);
		
		
		//toString - 주소값을 문자열로 반환
		//toString메서드는 멤버변수 값을 출력하도록 오버라이딩 많이 사용됩니다.
		System.out.println(p.toString()); 
		
		try {
			//새로운 Person객체를 복사해서 반환
			Person clonePeople = (Person)p.clone();//person클래스에서 오버라이딩으로 throw,예외 설정이 있어서 try catch로 감싸야함 
			
			System.out.println(clonePeople.getName());
			
		} catch (CloneNotSupportedException e) {
			// 
			e.printStackTrace();
		} 
		
		//객체의 주소를 해시알고리즘을 통해 변경한 값을 반환
		int x = p.hashCode();
		System.out.println(x);
		
		PrintStream ps = System.out; //system.out.까지만 써도 이미 출력문이고,println은 출력의 형태
		ps.println("출력");
		
		
	}
}
