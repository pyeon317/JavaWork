package day03;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		
		//배열정렬 - 정렬은 대략 6개
		//선택정렬 - 모든 경우의 수를 다 따짐
		int[] arr = {5, 23, 1, 43, 200, 100, 40}; //작은 순서대로 정렬 할 경우.
		
		//첫 항에서 모든 배열이랑 비교해서(6번) 제일 작은값과 자리 바꿈
		
		//1, 23, 5, 43, 200, 100, 40 - 1회전 후//두번째 항에서 모든 배열이랑 비교해서 제일 작은값과 자리 바꿈  
		//1, 5, 23, 43, 200, 100, 40 - 2회전 후
		//1, 5, 23, 43, 200, 100, 40 - 3회전 후
		//1, 5, 23, 40, 200, 100, 43 - 4회전 후
		//1, 5, 23, 40, 43, 200, 100 - 5회전 후
		//1, 5, 23, 40, 43, 100, 200 - 6회전 후
		
		//바깥반복문은 회전수
		//안쪽바깥문은 비교할 값
		for(int i = 0; i < arr.length - 1; i++) { //0~5까지
		
			for(int j = i+1; j < arr.length; j++) { //i+1~끝
				
				if(arr[i] > arr[j]) { //비교대상이 작다면, swap
					//arr[i] < arr[j]면 큰 수부터 나열됨
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}
