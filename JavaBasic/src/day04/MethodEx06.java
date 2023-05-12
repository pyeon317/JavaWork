package day04;

import java.util.Arrays;

public class MethodEx06 {

	public static void main(String[] args) {
		
		//Queue - First In First Out (FIFO - 선입선출)
		
		push(1); 
		push(2); 
		push(3); 
		push(4); 
		push(5); 
		System.out.println(Arrays.toString(arr));
		
		for(int i = 1; i <= 5; i++) {
			pop();
			System.out.println(Arrays.toString(arr));
			
		}
		int r = pop(); 
		System.out.println("삭제된 데이터:" + r);
		
		
	}



	static int[] arr = {}; //main이 아니어도 같은 클래스 안이면 사용 가능


	//push -> 특정요소를 마지막에 추가
	static void push(int data) { //특정요소를 데이터로 받는다.
		//1.배열의 크기를 +1한 새로운 배열을 만든다.
		int[] temp = new int[arr.length +1];
		//2.arr배열의 요소를 복사
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		//3.마지막에 추가. 여기서 매개변수 data가 들어감
		temp[temp.length - 1] = data;
		
		//4.원본배열을 temp로 변경
		arr = temp;
		temp = null; 
	}

	//배열의 맨 앞요소부터 삭제되도록 처리
	static int pop() {
		
		if(arr.length > 0) {
			
			int del = arr[0]; //삭제될 데이터(첫 항) 저장
			
			int[] temp = new int[arr.length-1]; //배열크기-1 하여 사본 배열 생성
			
			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i+1]; //배열입력(2항부터 끝항까지) - 첫항을 삭제
			}
			
			arr = temp; //원본변경
			temp = null; //초기화
			return del; //삭제데이터출력
		}
		
		return 0;
	}
	
	
}