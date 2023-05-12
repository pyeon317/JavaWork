package quiz01;

import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		
		//1. 두 정수를 입력을 받고, 큰 수를 출력하면 됩니다.
		//단, 같은 수라면 "같은 수입니다" 출력.
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">");
		int a = scan.nextInt();
		System.out.println(">");
		int b = scan.nextInt();
		
		if(a > b) {
			System.out.println(a + "가 큰 수 입니다");
		} else if(a < b) {
			System.out.println(b + "가 큰 수 입니다");
		} else {
			System.out.println("같은 수입니다");
		}
		scan.close();
	}
}
