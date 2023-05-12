package day02;

public class EnhanceForEx {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7};
		
		//향상된 포문 - 배열같은 연속된 타입을 돌리기에 적합
		for(int a : arr) {
			System.out.println(a);
		}
		
		System.out.println("--------------------------");
		
		String[] arr2 = {"월", "화", "수", "목", "금", "금", "금"};
		
		for(String a : arr2 ) {
			System.out.println(a + "요일");
		}	
		System.out.println("--------------------------");
		//이 값들의 합계와, 평균(실수형)을 출력
		int[] score = {50, 40, 30, 20, 10};
		int sum = 0;
		int c = 0;
		
		for(int a : score) {
			sum +=a;
			//c = (double)sum/score.length
		}
		System.out.println("합계:" + sum);
		System.out.println("평균:" + (double)sum/score.length);
		//System.out.println("평균:" + c); double을 써서 소수점이 나오도록 함
	}
}
