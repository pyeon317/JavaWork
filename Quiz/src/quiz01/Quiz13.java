package quiz01;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		//1. 7~100까지 정수 중에 7의 배수만 가로로 출력.
		// System.out.println(); - 줄바꿈
		
		for(int i = 1; i <= 100; i+=7) {			
				System.out.print(i + " ");			
		}
		
		
		System.out.println();
		//2. 1~200까지 정수 중에 9의 배수의 개수를 츌력
		int count = 0;
		for(int i =1; i <= 200; i++) {
			
			if(i % 9 == 0) {
				count++; //1씩 증가				
			}
		}
		System.out.println("9의 배수의 개수:" + count);
		//3. 50~100 사이의 두 수 사이의 합		
		int sum = 0;
		for(int i = 50; i <= 100; i++) {
					sum += i;
		}										
			System.out.println("50-100까지 합:" + sum);
		
		//4. A~Z까지 가로로 붙여서 출력, A=65, Z=90
		String str = "";
		for(char c = 'A'; c <= 'Z'; c++) {
			//System.out.print(c);
			str += c;
		}
		//5. 입력받은 정수까지 팩토리얼 5! = 5 * 4 * 3 * 2 * 1
		Scanner scan = new Scanner(System.in);
		System.out.print(">");
		int num = scan.nextInt();
		
		int sum2 = 1;
		for(int i = 1; i <= num; i++) {
			sum2 *= i;
		}
		System.out.print(num + "!은" + sum2);
		scan.close();
	}
}