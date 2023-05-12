package day04;

public class MethodEx02 {

	public static void main(String[] args) {
		/*
		 * 매개변수(parameter)
		 * 메서드가 전달박는 매개값
		 * 여러개 받을 수도 있고, 받지 않을 수도 있습니다.
		 */
		
		int result = calSum(10);
		System.out.println("결과:" + result);
		
		int result2 = calSum(100);
		System.out.println("결과:" + result2);
		
		int result3 = calSum2(1, 2);
		System.out.println("결과:" + result3);
		
		String result4 = calSum3(5, "가");
		System.out.println("결과:" + result4);
		
	} //main
	
	
	//1~매개변수까지의 합계
	static int calSum(int a) { //다른 메서드에서 매개변수를호출할 때는 a의 값을 정확히 정해야 함. 
		                       //a라고 쓰지말고 10 이라던가 정하면 이 a값이 결정되어 해당 메서드가 계산됨
		int sum = 0;
		for(int i = 1; i <= a; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	//매개변수를 2개 받음
	static int calSum2(int a, int b) {
		return  a + b;
	}
	
	//간단한 실습 - 정수, 문자열을 전달받는 String calSum3() 생성
	static String calSum3(int a, String s) {
		
		String str = "";
		for(int i = 1; i <= a; i++) {
			str += s;
		}
		
		return str; //return안쓰면 static String calSum3 여기에 빨간 줄 생겨서 매우 거슬린다.잊지말자.
	}
	
	
}
