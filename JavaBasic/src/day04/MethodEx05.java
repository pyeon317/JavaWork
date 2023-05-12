package day04;

import java.util.Arrays;

public class MethodEx05 {

	public static void main(String[] args) {
		//배열의 한계점 - 크기가 정적
		//Stack - Last In First Out( LIFO )
		
		push(4);
		push(5);
		push(6);
		push(7);
		System.out.println(Arrays.toString(arr));
		
		pop();
		pop();
		pop();
		pop();
		int r = pop(); //삭제된 데이터도 확인이 가능함
		System.out.println("삭제된 데이터:" + r);
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	static int[] arr = {1,2,3}; //main이 아니어도 같은 클래스 안이면 사용 가능
								//System.out.println(arr[0]); 를 main에서 사용해도 출력된다.
	
	//push -> 특정요소를 마지막에 추가
	static void push(int data) { //특정요소를 데이터로 받는다.
		//1.배열의 크기를 +1한 새로운 배열을 만든다.
		int[] temp = new int[arr.length +1];
		//2.arr배열의 요소를 복사
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		//3.마지막에 추가. 여기서 매개변수 data가 들어감
		temp[temp.length - 1] = data; // 항상 마지막 배열의 번호는 length-1임을 잊으면 안됨
						//temp = {1,2,3,temp}
		//4.원본배열을 temp로 변경
		arr = temp;
		temp = null; //temp는 지움
	}
	
	//pop -> 특정요소를 마지막에서 삭제 (반환 - 삭제된 데이터)
	static int pop() {
		
		if(arr.length > 0) { //0보다 작으면 배열이 파괴되서 오류남
			//1. 삭제할 데이터를 백업
			int del = arr[arr.length - 1]; // 삭제할 데이터(맨 마지막 배열값) 백업
			//2. arr보다 -1인 사본 배열을 생성
			int[] temp = new int[arr.length - 1]; //원본보다 1작은 배열
			//3. 원본 배열을 사본으로 복사 (맨 마지막 데이터만 제외)
			for(int i = 0; i < temp.length; i++) {
				temp[i] = arr[i];  //사본에 원본정보입력 - 여기서 한자리 작은 배열이기 때문에 마지막 배열이 자연스럽게 제외됨
			}
			//4. 사본 배열을 원본 배열로 변경
			arr = temp;  //원본변경
			temp = null; //temp 삭제 -초기화
			
			return del; //삭제된 데이터 반환
		}
		
		
		return 0;
	}
	
	
	
	
	
}
