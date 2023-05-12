package day13.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		/*
		 * 리스트와 반대(순서x,중복x)
		⇒인덱스 기준으로 조회하는 메서드가 없습니다.
		⇒동일한 값을 저장하면, 들어가지 않습니다.
		set계열 순회할 때는 향상된 for문, 반복자 개념을 사용해야합니다.
		
		HashSet
		TreeSet
		 *
		 */
		
		//HashSet<String> set = new HashSet<>();
		Set<String> set = new HashSet<>();
		
		//add()
		set.add("java");
		set.add("database");
		set.add("spring");
		set.add("jsp");
		set.add("python");
		set.add("java");
		
		//
		System.out.println(set.toString());
		//크기
		System.out.println(set.size());
		//삭제
		set.remove("python");
		System.out.println(set.toString());
		
		//순회 => 내부적으로 반복자의 개념을 사용해서 회전
		for(String s : set ) {
			System.out.println(s);
		}
		
		System.out.println("------------------------");
		
		//set => iteratir 타입으로 변경
		Iterator<String> iter = set.iterator();
		
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
//		System.out.println(iter.next());
		
		while(iter.hasNext()) { //다음이 있다면 true
			System.out.println(iter.next()); // 주석처리한 것과 같은 내용 
		}
		
		
	}
}
