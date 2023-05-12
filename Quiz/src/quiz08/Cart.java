package quiz08; //부모, 건드리지 말것 

public class Cart {

	String[] cart = new String[1];
	int money; // 금액
	int i = 0; //cart의 순서
	
	int tv;
	int com;
	int radio;
	
	void buy(String product) {
		System.out.println("재정의 하세요");
	}
	
	void add(String product) {
		System.out.println("재정의 하세요");
	}
	
	void info() {
		System.out.println("재정의 하세요");
	}
	
}
