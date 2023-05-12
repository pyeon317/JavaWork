package day13.generic.good;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {

	public static void main(String[] args) {
		//제네릭<?> = 제네릭에 뭐든 다 들어갈 수 있음
		//제네릭<? extends String> = String과 String의 자식들이 들어감
		//제네릭<? super String> = String 타입이 될 수 있다면 전달가능	
		
		List<String> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		List<Object> list3 = new ArrayList<>();
		
		add1(list1);//o
		add1(list2);//o
		add1(list3);//o
		
		add2(list1); //string o
		//add2(list2); //integer x
		//add2(list3); //object x
		
		add3(list1); //string o
		//add3(list2); //integer x
		add3(list3); //object o
		
	}
	
	//
	public static void add1(List<?> list) { //제네릭 타입(<T>)은 생략 가능. 쓰려면 쓸수있음.
		//<?>가 있으면 어떤 리스트 타입이든 상관없다는 뜻
	}
	
	public static void add2(List<? extends String> list) {
		
	}
	
	public static void add3(List<? super String> list) {
		
	}
	
	
}
