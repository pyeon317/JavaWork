package day03;

import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {
		
		//삭제의 개념 - 배열은 삭제가 없습니다.
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		int[] newArr = new int[arr.length - 1]; // 삭제한 후 복사할 새로운 배열
		
		int index = 5; //삭제할 위치
		
		for(int i = index; i < arr.length - 1; i++) {
			arr[i] = arr[i+1]; //뒤의 수를 앞으로 저장
		}
		
		//새로운 배열에, 기존배열을 옮겨 담는 작업
		for(int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i];
		}
		
		//기존 arr는 지움
		arr = null; //통째로 지우는 방법
		
		
		
		System.out.println(Arrays.toString(newArr));
	}
}
