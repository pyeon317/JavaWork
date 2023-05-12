package day10.static_basic;

public class MyArrays {

	/*
	 * Arrays클래스의 toString메서드 똑같이 만들기
	 * 
	 * 1. 외부에서 객체 생성하지 못하도록 생성자에 접근제어자를 붙입니다.
	 * 2. printArray() 생성하는데, 배열을 매개변수로 받아서 toString처럼 리턴되도록
	 * 	  메서드 오버로딩 (String) (int), (char) 
	 */
	
	private MyArrays() {}
	
	public static String printArrays(String[] arr) { 
		
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i == arr.length - 1) {
				return str += "]";
			}
			str += ", ";
		}
		str += "]";
		return str;
	}
	
	public static String printArrays(int[] arr) { 
		
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i == arr.length - 1) {
				return str += "]";
			}
			str += ", ";
		}
		str += "]";
		return str;
	}
	
	public static String printArrays(char[] arr) { 
		
		String str = "[";
		for(int i = 0; i < arr.length; i++) {
			str += arr[i];
			if(i == arr.length - 1) {
				return str += "]";
			}
			str += ", ";
		}
		str += "]";
		return str;
	}
	
	
	
	
	
}
