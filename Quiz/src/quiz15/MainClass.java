package quiz15;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		 IBag b = new Bag();
		 
		 b.insert("수박");
		 b.insert("딸기");
		 b.insert("포도");
		 b.insert("고기");
		 b.insert("생선");
		 b.insert("딸기");
		 b.print();
		 System.out.println(b.search("생선"));
		 System.out.println(b.search("라"));
		
	}
}
