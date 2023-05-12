package quiz01;

import java.util.Scanner;

public class MethodQuiz02 {

	public static void main(String[] args) {
		
		
		/* 이 내부의 실행문들이 각각의 메서드로 기능되도록 하시오
		 *
		 
		//정수 2개를 받아서 합을 출력하는 문장
		//반환도 없고, 매개변수 없는 메서드 show()
		System.out.println("[두 수의 합을 구합니다]");
		
		
		//반환은 있고, 매개변수는 없는 메서드 input()
		//
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수입력>");
		int num1 = scan.nextInt();
		
		System.out.print("정수입력>");
		int num2 = scan.nextInt();
		
		//두 수의 합을 리턴하는 메서드 add()
		int result = num1 + num2;
		
		//매개변수로 result를 받아서 출력하는 메서드 print()
		System.out.println("두 수의 합:" + result);
		
				*/
		show();
		int num1 = input();
		int num2 = input();
		
		int result = add(num1,num2);
		
		print(result);
		
		
		
	}
	//show
	static void show() {
		System.out.println("[두 수의 합을 구합니다]");
	}
	
	//input
	static int input() {
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력>");
		int num = scan.nextInt();
		return num;
	}	
	
	//add
	static int add(int a, int b) {
		
		return a + b;
	}
	
	//print
	static void print(int result) {
		System.out.println("두 수의 합:" + result);
	}
	
}
