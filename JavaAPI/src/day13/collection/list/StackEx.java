package day13.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		/*
		 * Stack
		 * => Last in First out (후입선출)
		 * => push(), pop()
		 * 
		 */
		
		Stack<String> stack = new Stack<>();
		//List<String> stack = new Stack<>(); 이렇게(자식클래스로)도 쓸 수는 있는데 제약이 생김
		
		stack.push("홍길동"); //처음 만들 때 (위 명령어에서) ()안에 아무것도 입력 안하면 여기서 입력됨
		stack.push("이순신"); 
		stack.push("홍길자"); 
		
		//형태를 문자열로 확인
		System.out.println(stack.toString());
		
		String n = stack.pop(); //반환을 하면서 어떤 값이 반환됬는지 알려줌. 그냥 stack.pop();만 써도 제거됨
		System.out.println("pop:" + n); 
		System.out.println(stack.toString());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.toString());
		
		
		
		
		
	}
}
