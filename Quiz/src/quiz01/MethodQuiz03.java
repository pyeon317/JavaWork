package quiz01;

import java.util.Arrays;
import java.util.Scanner;

public class MethodQuiz03 {

	public static void main(String[] args) {
		char[] arr = {'a', 'b', 'c', 'd', 'e'};//메서드에 넣을 배열 선언
		String result = method06(arr); //배열 이름.method06() 괄호 안에 arr을 변수로 넣음
		
		System.out.println(result); //결과 출력
		
		int arr2[] = {1,2,3,4}; //메서드에 넣을 배열 선언
		int result2 = method07(arr2); //배열 이름
		System.out.println(result2); //결과 출력
		
		/*
		String[] result3 = {"a", "b"}; //메서드에 넣을 배열 및 배열 이름 결정
		System.out.println(Arrays.toString(result3)); //결과 출력
		*/
		String[] arr3 = method08("가","나");
		System.out.println(Arrays.toString(arr3));
		
	} //main
	
	//1
	static String method06(char[] arr) { //String met~ 니까 문자열 리턴 
		
		String str = ""; //문자열 출력을 위한 설정
		for(int i = 0; i < arr.length; i++) {
			str += arr[i]; //+를 함으로서 문자 뒤에 문자를 붙이는 작업
		}
		return str;
	}
	
	//2
	static int method07(int[] arr) { //int metho~니까 정수로 리턴
		
		int sum = 0;
		for(int a : arr) { //향상된 for문
			sum += a;
		}
		/* 기존 for문
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			sum += arr[i];
		} */
		return sum;
	}
	
	//3
	static String[] method08(String a, String b) { //String[] 니까 문자열 배열 반환
		String arr[] = {a,b}; //매개변수를 배열로 선언
		return arr;
	}
}
