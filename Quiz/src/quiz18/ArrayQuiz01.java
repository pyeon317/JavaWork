package quiz18;

import java.util.Arrays;

public class ArrayQuiz01 {

	public static void main(String[] args) {
		
		//arr과 arr2는 길이가 1 차이가 납니다.
		//arr은 마라톤 참가자입니다.
		//arr2는 마라톤 완주자입니다.
		//완주하지 못한 사람을 리턴하는 메서드를 만드세요.
		
		String[] arr = {"홍길동","홍길자","이순신","신사임당"};
		String[] arr2 = {"홍길동","이순신","신사임당"};
		
		test(arr,arr2);
		
	}
	
	public static String test(String[] arr, String[]arr2) {
		Arrays.sort(arr);
		String[] newarr = Arrays.copyOfRange(arr, 0, arr.length);
		Arrays.sort(arr2);
		
		if(Arrays.equals(newarr, arr2)) {
			System.out.println(arr[arr.length-1]);
		}else {
			for(int i = 0; i< arr.length; i++ ) {
				int x = Arrays.binarySearch(arr2, newarr[i]);
				if(x < 0) {
					System.out.println(newarr[i]);
					break;
				}
			}
		}
		return null;
	}
	
	
	public static String test1(String[] arr, String[]arr2) {
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		for(int i = 0; i< arr2.length; i++) {
			if( !arr[i].equals(arr2[i])) { //!를 붙여서 두 배열이 같지 않을 경우로 해야 함 
				return arr[i];
			}
		}
		return arr[arr.length-1];
	}
}
