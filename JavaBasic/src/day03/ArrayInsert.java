package day03;

import java.util.Arrays;

public class ArrayInsert {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50};
		int[] newArr = new int [arr.length + 1];
		
		
		int data = 100; // 중간에 추가할 값
		int targetIndex = 2; //추가할 위치
		
		//newArr의 기존배열의 값을 옮김
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		
		
		//배열의 마지막부터~타겟인덱스 마지막까지 옮겨담는 작업
		for(int i = newArr.length-1; i > targetIndex; i--){
			newArr[i] = newArr[i-1];
			
		}	
		//인덱스번째에 데이터 추가
		newArr[targetIndex] = data;
		
		//arr를 newArr로 변경
		arr = newArr;
		newArr = null;//완전삭제
		
		System.out.println(Arrays.toString(arr));	
		
		
	}
}
