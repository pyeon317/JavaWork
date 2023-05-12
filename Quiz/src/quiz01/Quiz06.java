package quiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		/*if구문 밖에 선언된 변수를 잘 활용합니다.
		 * 
		 * 정수 2개를 입력을 받습니다.
		 * 
		 * 가장 큰 값, 중간값, 작은값을 구분해서 출력. (조건 - 같은 수는 없다라고 가정)
		 *
		 *입력
		 *15, 30, 7 -> max:30, mid:15, min:7
		 *1, 2, 3 -> max:3, mid:2, min:1
		 * */
		Scanner scan = new Scanner(System.in);
	//int max =0; int mid =0; int min =0; 을 활용하라고 했는데 모르겠다.
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if(a > b && a > c) {
			System.out.println("max: " + a);
			 if(b > c) {
				 System.out.println("mid: " + b);
				 System.out.println("min: " + c);
			 } else {
				 System.out.println("mid: " + c);
				 System.out.println("min: " + b);
			 }
		} else if(a < b && a > c) {
			System.out.println("max: " + b);
			System.out.println("mid: " + a);
			System.out.println("min: " + c);
		} else if(a < b && a < c) {
			if(b > c) {
				System.out.println("max: " + b);
				System.out.println("mid: " + c);
			} else {
				System.out.println("max: " + c);
				System.out.println("mid: " + b);
			}
			System.out.println("min: " + a);
		}
			
		scan.close();
	}
}
