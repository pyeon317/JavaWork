package day02;

import java.util.Scanner;

public class WhileEx04 {

	public static void main(String[] args) {
		 /*
		  * 입력을 받을 횟수를 지정
		  * 처름 5를 입력받으면
		  * 5번 입력받을 수 있도록 처리
		  * 
		  * 입력 받은 값들의 합
		  * */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("반복수>");
		int size = scan.nextInt();
		
		int sum = 0; //합계누적
		int a = 1;
		while(a <= size) {
			
			System.out.print(">");
			int x = scan.nextInt();
			sum += x;
			
			a++;
		}
		System.out.println("입력받은 수의 합계:" + sum);
		scan.close();
	}
}
