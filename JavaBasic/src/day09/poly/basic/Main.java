package day09.poly.basic;

public class Main {

	public static void main(String[] args) {
		
		Child c = new Child();
		c.method01(); // 상속받은
		c.method02(); // 오버라이드 된
		c.method03(); // 내꺼
		
		
		System.out.println("==========다형성 적용(형변환)==========");
		
		//Parent처럼 사용됩니다. 단, 자신의 오버라이드 된 메서드가 실햅됩니다.
		Parent p = c;
		p.method01();
		p.method02();
		//p.method03();
		
		System.out.println(p); //parent타입
		System.out.println(c); //child 타입
		System.out.println( p == c ); //child로 생성된 자식은 원래의 객체를 유지함
		
		System.out.println("==========클래스 강제 형변환==========");
		//원본이 child로 생성되었다면, 강제 형변환이 가능함
		
		Parent pp = new Child();
		System.out.println(pp);//child 원본
		
		Child cc = (Child)pp; //강제 형변환
		cc.method01(); //부모에 pp로 저장했던거지만 원본이 자식이라 변형이 가능하다.
		cc.method02();
		cc.method03();
		
		//주의 할 점 : 다형성이 적용되었던 객체만 강제형변환이 가능함
		Object obj = new Object();
		//Child ccc = (Child)obj; //runtime exception
		
		System.out.println("==========다형성의 또 다른 예시==========");
		
		String str = "홍길동";
		Object o = str;
		
		System.out.println(o);
		
		String result = (String)o; //ok 
		//o는 o. 해서 나오는게 기본적인 것뿐이고 할 수 있는게 없어서 다시 형변환을 하는 것
			
	}
}
