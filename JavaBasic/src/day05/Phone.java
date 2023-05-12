package day05;

public class Phone {
		
	String model;   //여기에도 초기값 설정 가능
	String color;
	int price;
		
	//생성자를 프로그래머가 직접 생성하게 되면, JVM이 기본생성자를 자동생성하지 않습니다.
	//생성자는 반환유형이 없습니다.
	//역할 - 멤버변수를 초기화하는 용도로 보통 사용됨
	Phone() {
		System.out.println("생성자 호출! ㅎ"); //하고싶은거 다 할 수 있다는데
		model = "갤럭시"; //초기값 설정 가능
		color = "검정색";
		price = 100000;
	}
	
	//생성자는 여러개 선언할 수 있습니다.
	//단, 매개변수의 종류 or 개수가 달라야 합니다.
	Phone(String a) {   //위 생성자는 매개변수가 없고 이건 있음
		model = a;
		color = "핑크색";
		price = 200000;
	}
	
	Phone(String a, String b){ //모델, 색상 - 매개변수 개수가 다르므로 가능
		model = a;
		color = b;
		price = 300000;
	}
	
	Phone(String a, int b){ //매개변수의 타입이 다르기 때문에 가능
		model = a;
		color = "하얀색";
		price = b;
	}
	
	Phone(String a, String b, int c){ //받는 매개변수의 개수가 다르기 때문에 생성가능
		model = a;
		color = b;
		price = c;
	}
	
	void info() {
		System.out.println("===폰의 정보====");
		System.out.println("모델:" + model);
		System.out.println("색상:" + color);
		System.out.println("가격:" + price);
	}	
}
