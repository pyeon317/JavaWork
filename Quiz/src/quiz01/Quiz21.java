package quiz01;

import java.util.Arrays;

public class Quiz21 {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		/*
		 * 1. 1~9까지 숫자 중 중복되지 않는 숫자를 추출.
		 * 	  arr을 핸덤하게 10번 섞어줍니다.
		 *    0~2번째 값을 새로운 배열로 옮겨 담아보세요.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		
		
		for(int i = 1; i <= 10; i++) { //10바퀴 돌리기
			
			int x = (int) (Math.random()*9); //배열은 0부터 시작하기 때문에 랜덤에 9를 곱해야 0~8
			int y = (int) (Math.random()*9);
			
			
			int temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
			
		}
		int[] newArr = new int[3];
		for(int i = 0; i < newArr.length; i++) {
			newArr[i]= arr[i];
		}
		
		System.out.println(Arrays.toString(newArr));	
	}
}