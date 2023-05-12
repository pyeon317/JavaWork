package day03;

public class ArrayBasic2 {

	public static void main(String[] args) {
		
		//배열의 순회
		int[] arr = {1,2,3,4,5,6,7,8,9,10}; //길이가 10
		/*
		int a = 0;
		while(a < arr.length ) { //<=를 쓰면 length 그대로 쓰면 10이 나와서 오류발생하므로 -1 필요
			
			System.out.println("배열의" + a + "인덱스:" + arr[a]);
			
			a++;
		}
		*/
		
		//배열값들의 합
		int i = 0;
		int sum = 0;
		while(i < arr.length) {
			sum = sum + arr[i];
			i++;			
		}
		System.out.println(sum);
	}
}
