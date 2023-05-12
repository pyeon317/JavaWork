package quiz01;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int[] arr = new int[a]; //크기가 a인 배열
		
		int i= 0;
		while(i<arr.length) {
			arr[i] = scan.nextInt();
			i++;
		}
		
		//최소, 최대 결정
		int min = arr[0];
		int max = arr[0];
		
		i = 0;
		
		while(i<arr.length) {
			
			if(max < arr[i]) {
				max = arr[i];
			}
			
			if(min > arr[i]) {
				min = arr[i];
			}
		}
	}
}
