package quiz16;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * updown 게임
		 * 
		 * 1~100까지 랜덤한 수를 1번 생성합니다. (반복문 밖에서)
		 * 
		 * 스캐너를 통해서 값을 입력받습니다.
		 * 
		 * 
		 * 
		 * 정답을 맞추면 시도횟수: x회를 출력하고 종료
		 * 
		 * 에러가 발생하면 시도횟수는 증가하고 다시 입력받을 수 있도록 코드를 변경
		 * */
		
		int a = (int) (Math.random() * 100) + 1;
		int x = 0;
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			 try {
				 System.out.print("정답입력>");
				 int answer = scan.nextInt();
				 
				 if(answer < a) {
					 System.out.println("더 큰 수를 입력하세요");
					 x++;
				 }else if(answer > a) {
					 System.out.println("더 작은 수를 입력하세요");
					 x++;
				 }else { 
					 System.out.println("정답입니다");
					 x++;
					 System.out.println("시도횟수:" + x);
					 break;
				 }
			} catch (Exception e) {
				
				System.out.println("정수만 입력하세요");
				scan.nextLine();
				x++;
			} 
			
		 }
	}
}

		/*
	  * int num = (int) (Math.random() * 100) + 1;
		int count = 0; //시도횟수
		Scanner scan = new Scanner(System.in);
		
			while(true) {
			 	System.out.print("정답입력>");
			 	int answer = scan.nextInt();
			 	count++; //시도횟수 증가
			 if(num == answer) {
				 System.out.println("정답입니다");
				 System.out.println("시도횟수:" + count);
				 break;
			 }else if(num > answer) {
				 System.out.println("더 큰 수를 입력하세요");
			 }else { 
				 System.out.println("더 작은 수를 입력하세요");
				 
			 }
		 * */
