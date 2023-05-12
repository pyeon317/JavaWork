package day05;

public class ObjectBasic01 {

	public static void main(String[] args) {
		
		//기존에 사용하는 방법
		System.out.println("======1번 계산기======");
		System.out.println( add(10) );
		System.out.println( add(20) );
		System.out.println( add(30) );
		
		System.out.println("======2번 계산기======");
		System.out.println( add2(100) );
		System.out.println( add2(200) );
		System.out.println( add2(300) );
		
		
		
		
		
	}
	
	//1번 계산기
	static int result = 0;
	static int add(int a) { //a를 누적헤서 result 변환
		result += a;
		return result;
	}
	
	//2번 계산기 - 기능은 똑같은데 다른 계산
	static int result2 = 0;
	static int add2(int a) { 
		result2 += a;
		return result2;	
	}
	
}
