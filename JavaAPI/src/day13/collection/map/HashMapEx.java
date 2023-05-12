package day13.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		
		//Map인터페이스를 구현하는 클래스 HashMap
		//key에 대한 타입과 value에 대한 타입지정
		//탐색이 빠릅니다.(key 값만 알면 되서)
		
		//HashMap<Integer, String> map = new HashMap<>();
		Map<Integer, String> map = new HashMap<>(); //위아래 같음. 근데 아래를 많이 씀
		
		//맵에 값을 저장 put(키, 값)
		
		map.put(1,"홍길동");
		map.put(2, "이순신");
		map.put(3, "홍길자");
		map.put(4, "홍길동");
		map.put(5, "신사임당");
		
		//문자열로 맵의 결과 출력
		System.out.println(map.toString());
		System.out.println(map.size());
		
		//맵에 동일한 키를 저장하면? 값이 변경됩니다.
		map.put(4, "강감찬");
		System.out.println(map.toString()); 
		
		//맵의 값을 얻기 get(키) : 값을 반환
		String item = map.get(3);
		System.out.println("3번 키에 대한 값:" + item);
		
		//key의 유무확인 containsKet(키)
		
		if(map.containsKey(3)) {
			System.out.println("3번 키가 존재함");
		}
		
		//맵의 삭제 remove(키)
		map.remove(4);
		System.out.println(map.toString());
		
		
		//맵의 순회 - 기본적으로 순서대로 나오는 방법이 없어서 따로 만들어야 함.
		//방법1
		Set<Entry<Integer, String>> entrySet = map.entrySet();//맵을 셋으로 변경. -> map에 있는 엔트리를 set에 집어넣음
		
		//엔트리에는 키, 값을 꺼내는 기능
		for(Entry<Integer, String> entry : entrySet) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("-----------------------------");
		//방법2
		Set<Integer> set = map.keySet();//키만 꺼내서 set에 저장
		for(int key : set) {
			System.out.println(key);
			System.out.println(map.get(key));
		}
		
		System.out.println("-----------------------------");
		
		//맵에 객체를 담는 모형
		//Map<Integer, 유저> map2 = new HashMap<>();
		Map<Integer, Object> map2 = new HashMap<>();
		
		
	}
}
