package day13.collection.set;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		
		//set + 정렬
		TreeSet<Integer> set = new TreeSet<>();
		
		set.add(100);
		set.add(100);
		set.add(10);
		set.add(20);
		set.add(5);
		set.add(34);
		
		System.out.println(set.toString());
		
		for(int a : set) {
			System.out.println(a);
		}
		
		
	}
}
