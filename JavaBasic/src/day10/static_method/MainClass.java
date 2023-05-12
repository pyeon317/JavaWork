package day10.static_method;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		Count c = new Count();
		c.method01();//일반
		c.method02();//static - 이렇게는 잘 안씀
		
		//static 메서드의 사용
		Count.method02(); //
		
		//main과 항상 연관지어 생각, main 이 static 임.
		//main은 사실 꼭 따로 둘 필요없이 한 클래스 안에서 쓸 수도 있음.
		
		MainClass mc = new MainClass(); //test를 쓰기 위해서 객체생성
		mc.test();
		
		//static메서드의 사용예시
		Math.random();
		Arrays.toString(new int[3]);
		
		
		
	}
	
	
	public void test() { //static이 없으므로 메인에서 쓰려면 객체생성을 해야
		
	}
	
	
	
}
