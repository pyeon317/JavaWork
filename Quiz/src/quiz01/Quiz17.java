package quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		 
		
		int c = 0;
		int d = 0;
		
		while(true) {
			int x = (int) (Math.random() * 100 +1); 
			int y = (int) (Math.random() * 100+ 1);
			int z = (int) (Math.random() * 2);
			String[] arr = {"+", "-"};
			
			System.out.println(x + " " + arr[z] + " " + y + " = ?");			
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			
			int answer = scan.nextInt();
			
			if(answer == 0){
				System.out.println("프로그램 정상 종료");
				System.out.println("정답:" + c);
				System.out.println("오답:" + d);
				break;
			}
			
			if(z == 0) { //if(arr[z] == "+") 이거도 가능은 한데 비추천
				if(answer == (x + y)) {
					System.out.println("정답입니다");
					c++;
				} else {
					System.out.println("틀렸는데요?");
					d++;
				}
				System.out.println("---------------");
			}
			
			if(z == 1) { //if(arr[z] == "-") 이거도 가능은 한데 비추천
				if(answer == (x - y)) {
					System.out.println("정답입니다");
					c++;
				}else {
					System.out.println("틀렸는데요?");
					d++;
				}
				System.out.println("---------------");
			}
		}
		scan.close();
	}
}

// 선생님 풀이
/*
package quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
		 
		
		int c = 0; //정답횟수
		int d = 0; //오답횟수
		
		while(true) {
			
			int num1 = (int) (Math.random() * 100 +1); 
			int num2 = (int) (Math.random() * 100+ 1);
			int oper = (int) (Math.random() * 2);
			
			System.out.println("---------------");
			System.out.println(x + " " + (oper == 0 ? "+" : "-") + " " + y + " = ?");			
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			
			int answer = scan.nextInt();
			
			int correct = oper == 0 ? num1 + num2 : num1 - num2; //실제정답
			
			if(answer == 0){
				System.out.println("프로그램 정상 종료");
				System.out.println("정답:" + c);
				System.out.println("오답:" + d);
				break;
			}
			
			if(answer == correct) { //정답
				System.out.println("정답입니다");
				c++;
			} else { //오답
				System.out.println("틀렸는데요?");
				d++;
			} 
			
		}
		scan.close();
	}
}
*/
