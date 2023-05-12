package day10.final_basic;

public class Child extends Parent{ 

	
	
	//final클래스 - 상속금지
	//final메서드 - 오버라이드 금지
	
	
	//override
	public void method01() {
		this.method02();
	}
	
//	public void method02() { final이 있어서 변경할 수 없음
//		this.method02();
//	}
}
