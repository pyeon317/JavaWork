package day13.collection.list;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		/*
		 * LinkedList
		 * =>순서 o,중복 o
		 * =>노드객체(양방향 연결리스트)
		 * 삽입, 삭제는 ArrayList보다 좋으나, 탐색은 느립니다.
		 */
	
		LinkedList<Integer> list = new LinkedList<>();
		//list에 저장하면 list, deque에 저장하면 deque 기능만 쓸 수 있지만
		//linkedlist에 저장하면 list, deque 두 기능 다 사용가능함
		
		//list와 기능은 동일합니다.
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//
		System.out.println(list.toString());
		
		//중간에 추가
		list.add(3,  10); //3번째 인덱스에 10추가
		System.out.println(list.toString());
		
		//값 얻기 get()
		int n = list.get(3);
		System.out.println(n);
		
		//값 삭제 remove()
		list.remove(3);
		System.out.println(list.toString());
		
		System.out.println("--------------------------------------");
		
		//linklist는 queue의 기능을 구현하기 때문에 queue기능도 사용이 가능
		
		list.offer(10);
		list.offer(11);
		
		System.out.println(list.toString());
				
		int r = list.poll();
		System.out.println(r); //반환값 출력
		System.out.println(list.toString());
		
		
		
	}
	
}
