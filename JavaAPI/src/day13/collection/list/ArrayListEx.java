package day13.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) { //add, get, size - 최중요로 꼭 기억할 것
		/*
		 * ArrayList
		 * =>배열기반
		 * => 순서 ㅇ, 중복 ㅇ
		 */
		ArrayList<String> list = new ArrayList<>();
		//List로 사용하는게 대부분임.
		//List<String> list = new ArrayList<String>();
		
		//list추가 add()
		list.add("홍길동");
		list.add("이순신");
		list.add("홍길자");
		list.add("홍길동");
		list.add("신사임당");
		
		//문자열로 확인
		System.out.println(list.toString());
		
		
		//길이 확인 size() - 컬렉션에서는 length가 아닌 size
		System.out.println("리스트의 길이:" + list.size()); 
		
		//중간에 추가 add()
		list.add(0, "0번째 추가"); //원하는 위치에 원하는 내용 추가(변경 아님)
		System.out.println(list.toString());
		
		//값의 확인 get()
		String n = list.get(3);
		System.out.println(n);
		
		//값의 수정 set()
		list.set(4, "홍순자"); //원하는 위치에 원하는 내용으로 변경
		System.out.println(list.toString());
		
		//값의 제거 remove()
		list.remove(0); //배열위치 삭제
		list.remove("신사임당"); //입력한 내용 찾아 삭제
		System.out.println(list.toString());
		
		//contains()
		if(list.contains("홍길동")) {
			System.out.println("홍길동이 있음"); //true면 출력
		}
		
		//빈 리스트의 확인 isEmpty()
		if(list.isEmpty()) {
			System.out.println("리스트가 비었음");
		}else {
			System.out.println("리스트가 비어있지 않음");
		}
		
		//전부삭제 clear()
		list.clear();
		System.out.println(list.toString());
		
		System.out.println("------------------------------------");
		
		//제네릭<?> = 제네릭에 뭐든 다 들어갈 수 있음
		//제네릭<? extends String> = String과 String의 자식들이 들어감
		//제네릭<? super String> = String 타입이 될 수 있다면 전달가능		
		
		List<String> list2 = Arrays.asList("a", "b","c","d");
		//asList 리스트 t타입으로 반환
		//aslist로 만든 배열은 추가,삭제가 불가능함(list2). 일종의 고정값?
		//다른 리스트에 병합시킨건 aslist가 아니니까 상관없음
		System.out.println(list2.toString());
		
		//리스트를 병합 - 값이 들어있든 말든 상관없음
		list.addAll(list2); //extends 붙은거는 윈하는 위치에 병합
		
		System.out.println(list.toString());
		
		
		
	}
}
