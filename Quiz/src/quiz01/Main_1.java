package quiz01;

import java.util.Arrays;
import java.util.Scanner;

//문제 풀면서 프로그램 짜다가 중간에 있는 일부 코드가 생각대로 실행되는지 확인하는 곳 
public class Main_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
		int[] arr = new int[N];
		int b = 1;
		int temp = 0;
		
		for(int a = 0; a < arr.length; a++) {
			arr[a] = b++;
		}
		
		int i = scan.nextInt()-1;
		
		for(int j = scan.nextInt()-1; i < j ; j--) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
		}
		System.out.println(Arrays.toString(arr));
	}
}
