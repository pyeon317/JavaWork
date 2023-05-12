package day10.static_field;

public class MainClass {

	public static void main(String[] args) {
		
		Count c1 = new Count();
		c1.a++;
		c1.b++;
		
		System.out.println("c1:" + c1.a);
		System.out.println("c1:" + c1.b);
		
		Count c2 = new Count();
		c2.a++;
		c2.b++;
		
		System.out.println("c2의 a:" + c2.a);
		System.out.println("c2의 b:" + c2.b);
		
		Count c3 = new Count();
		c3.a++;
		c3.b++;
		
		System.out.println("c3의 a:" + c3.a);
		System.out.println("c3의 b:" + c3.b);
		
		//a는 객체마다 값이 있어서 정의할 떄마다 다시 시작해서 1인데 
		//b는 객체 유지가 되서 이전 값에 추가됨. 여기서 다시 c1 호출해도 3이 나옴
		
		System.out.println("==============================");
		/*
		 * static은 클래스 밖에 1개가 생성이 되기 때문에
		 * 
		 * 객체 생성없이 클래스 이름. 변수명 으로 사용됩니다.
		 */
		
		Count.b++;
		Count.b = 100;
		System.out.println(Count.b);
		
		//여기서 c2의 b는 몇일까요? 100. c3도 100
		
		
		
		
	}
}
