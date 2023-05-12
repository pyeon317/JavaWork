package quiz01;

public class Quiz18 {

	public static void main(String[] args) {
		
		//매열 요소들 중 짝수인 값들의 합
		int[] arr = {54, 32, 3, 5, 7, 14, 20};
		
		int sum = 0;
		for(int i=0; i < arr.length; i++) {
			if(arr[i] % 2 ==0) {
				sum += arr[i];
			}
		}
		System.out.println("짝수인 값들의 합:" + sum);
	}
}

/*
		int i = 0;
		int sum = 0;
		while(i < arr.length;) {
			if(arr[i] % 2 ==0) {
				sum += arr[i];
			}
			 i++;
		}
		System.out.println("짝수인 값들의 합:" + sum);

*/