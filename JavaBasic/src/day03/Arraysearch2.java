package day03;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysearch2 {

	public static void main(String[] args) {
		
		
		//이진탐색 = 반을 분할해서 찾아가는 방법.
		//조건  - 순서대로 정렬
		/*
		 * 1. 포인터(start, end)를 처음과 끝에 2개를 배치
		 * 2. 중간값을 구함
		 * 3. 중간이 찾는 값인지 확인
		 * 4. 중간값이 찾는 값보다 크면, end를 중간값-1 로 내림
		 * 5. 중간값이 찾는 값보다 작다면, start를 중간값+1 로 올림 
		 * 
		 * */
	int[] arr = {1, 3, 5, 10, 20, 30, 50, 80, 100};
		
	Scanner scan = new Scanner(System.in);
	System.out.print("찾을값>");
	int find = scan.nextInt();
	/*
	int count = 0;
	
	int start = 0;
	int end = arr.length-1; //8
	
	
	while(start <= end) {
		
		count++; //회전수 확인
		//중간값
		int mid = (start + end) / 2;
		if(arr[mid] == find) {	
			
			System.out.println("회전수:" + count);
			
			System.out.println("찾을 경우:" + mid + "번째 존재함");
			break;
		}
		//찾을 값이 중간값보다 큰 경우
		if(arr[mid] < find) {
			start = mid + 1;			
		} else {
			end = mid - 1;
		}
	}
		*/
	//두 지점이 교차했다면 찾는 값은 없음.
	//if(start > end) {
		System.out.println("찾는 값은 없습니다.");
	//}
	//이진탐색 - 찾은 위치를 알려줌, 찾을 값이 없다면 음수를 알려줌
	System.out.println(Arrays.binarySearch(arr, 102));
	scan.close();
	}
}
