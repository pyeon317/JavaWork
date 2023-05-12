package day04;

public class MethodEx03 {

	public static void main(String[] args) {
		
		
		
		/*
		 * return이란
		 * 1. 메서드에서 리턴은 실행결과를 돌려주는 값에 대한 타입
		 * 2. 리턴이 있는 메서드는 다른 메서드의 매개값으로도 사용이 됩니다.
		 * 
		 * 3. 반환값은 없을 수도 있습니다. void로 선언합니다.
		 * 4. void메서드도 return을 사용할 수 있습니다.
		 *              - 값을 돌려주지는 못하고, 종료의 의미
		 * 
		 */
		//System.out.println(add(1, 2)); //소괄호가 있다는 것은 전부 메서드
		add( add(1, 2), add(3, 5) ); //안쪽에 있는 것부터 계산
		// add( 3     ,      8); 이 되므로 답은 11
		
		int result = add( add(1, 2), add(3, 5) );
		System.out.println("결과:" + result);
		
		//void형 메서드는 return이 없기 때문에 단순히 호출만 가능합니다.
		//System.out.println( sub() ); //에러!
		sub();
		div(6, 2);
		noReturn("bye");
		noReturn("hello");
		
		
		
		
	}//main
	
	//
	static int add(int a, int b) {
		return a + b;
	}
	
	//반환이 없고, 매개변수도 없는 모형
	static void sub() {
		System.out.println("5 - 3 = 2");
	} //void 라서 return이 없어도 빨간줄 안 생김. 한번 실행하고 끝. 호출만 가능
	
	//반환이 없고, 매개변수는 있는 모형.
	static void div(int a, int b) {
		System.out.println(a + " / " + b + " = " + (a/b) );
	}
	
	static void noReturn(String s) {
		
		if(s.equals("hello")) { //s라는 문자열이 hello라는 문자열과 같으면 true
			System.out.println("메서드를 종료함당!");
			return;
		}
		
		System.out.println("hello를 전달해야 할껄요?");
		
	}
	
}
