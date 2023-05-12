package quiz17;

import java.util.Scanner;

public class Calculator {

	public int input() throws Exception{
		/*
		 * 1. 스캐너로 정수 2개를 입력을 받아서 두 수의 합을 반환하는 기능
		 * 2. 입력된 값이 정수라면 합계를 반환
		 * 3. 예외가 발생하면, 직접 예외를 생성하고 예외 메시지를 외부로 전달하면 됩니다.
		 * 4. scan.close()은 finally에서 처리하세요./
		 */
		Scanner scan = new Scanner(System.in);
			
		try {
			//예외가 발생하면 가장 가까운 catch문으로 이동합니다.
			System.out.println(1 + ">");
			int a = scan.nextInt();
				
			System.out.println(2 + ">");
			int b = scan.nextInt();
			
			return a + b;
			
		} catch (Exception e) {
			throw new Exception("문자를 입력하세요"); //예외 생성
		} finally {
			
			scan.close();
		}
		
	}
	
	public static void main(String[] args) {
		
		Calculator cc = new Calculator();
		
		try {
			cc.input();
		} catch (Exception e) {
			e.getMessage();
		} 
		
	}
}
