package day04;

import java.util.Arrays;

public class MethodEx04 {

	public static void main(String[] args) {
		
		//배열을 매개변수로 전달할 수 있을까요? yes
		char[] arr = {'a', 'b', 'c', 'd', 'e'};
		
		method01(arr); //변수명으로 주면 됩니다.
		
		
		//배열을 반환유형으로 전달 받을 수 있습니다.
		int[] result = method02();
		System.out.println(Arrays.toString(result));
		
		
		
		
	}
	
	static void method01(char[] arr) { //메서드에서 배열을 얻으려면 선언할 때 그대로 쓰면 된다.
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	static int[] method02() { //반환유형. int[]을 써서 정수배열을 반환한다.
		int[] arr = new int[3];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		
		return arr;
	}
	
	
	
	
	
}
