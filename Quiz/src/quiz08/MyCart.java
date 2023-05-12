package quiz08;

import java.util.Arrays;

public class MyCart extends Cart{

	//1.생성자는 money를 전달받고 money값 초기화, tv = 300, com = 400, radio = 500
	
	//2. buy(), add(), info() 메서드 오버라이드
	/*
	 * 상품명 "tv", "com", "radio"
	 * 
	 * buy(상품명) 기능
	 * 매개변수가 tv, com, radio라면 금액에서 상품가격을 차감하고, add() 메서드를 실행합니다.
	 * 단, 올바른 상품이 아니거나, 금액이 부족할 경우에는 적절한 처리를 해주세요
	 */
	
	/*
	 * add(상품명) 기능
	 * 매개변수로 넘어온 상품을 cart배열에 순서대로 담아줍니다.
	 * 단, cart배열이 꽉 찼다면, 2배 크기의 카트배열로 옮겨주세요.  일단 처음에 1개넣으면 배열 2로 증가
	 * 
	 * 마지막에는 info() 메서드를 호출합니다.
	 */
	
	/*
	 * info() 는
	 * cart배열에 담긴 물건 목록만 (null제외) 출력해주세요. Arrays.tostring 쓰면 안됨
	 * 
	 * 
	 */
		
	MyCart(int money) {
		this.money = money;
		tv = 300;
		com = 400;
		radio = 500;
	}
	
	void buy(String product) {
		
		switch (product) {
		case "tv":
			if(this.money < 300) {
				System.out.println("금액이 부족합니다.");
				return; //함수종료
			} else {
				this.money -= tv;
				System.out.println(money);
				add(product);
			}
			break;
		case "com":
			if(this.money < 400) {
				System.out.println("금액이 부족합니다.");
				return; //함수종료
			} else {
				this.money -= com;
				System.out.println(money);
				add(product);
			}
			break;
		case "radio":
			if(this.money < 500) {
				System.out.println("금액이 부족합니다.");
				return; //함수종료
			} else {
				this.money -= radio;
				System.out.println(money);
				add(product);
			}
			break;

		default:
			System.out.println("올바른 상품이 아닙니다.");
			return;
		}
			
		
	}
	
	void add(String product) {
		                 
		if(i >= cart.length) {        //배열이 꽉 찰 경우
			String[] newcart = new String[cart.length*2];  //배열 크기 증가
			
			for(int i = 0; i < cart.length; i++) {
				newcart[i] = cart[i];   //원래 있던 것들 입력
			}
			cart = newcart;    //늘어난 배열로 변경
			newcart = null;    //다시 써야하니 삭제
		}
		cart[i] = product;
		i++;
		info();
	}
	
	void info() {
		
		String str = "[";
		for(int j = 0; j < i; j++) {
			str += cart[j] + " ";
		}
		str += "]";
		System.out.println(str);
		
	}
	
}
