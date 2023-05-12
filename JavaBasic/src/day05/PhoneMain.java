package day05;

public class PhoneMain {

	public static void main(String[] args) {
		
		Phone black = new Phone();
		
		black.info();
		
		Phone pink = new Phone("아이폰14"); //a가 될 문자열을 입력
		
		pink.info();
		
		Phone red = new Phone("TTL", "빨강색");
		
		red.info();
		
		Phone white = new Phone("가로본능", 4000);
		
		white.info();
		//Phone 생성자가 늘어날 수록 선택지가 많아진다.
		
		//model, color, price를 매개변수로 받아서 초기화하는 생성자를 만들어보세요
		//객체생성도 해보세요
		Phone yellow = new Phone("샤오미", "노란색", 1000);
		
		yellow.info();
		//클래스 쪽을 저장을 안했더니 에러가 떴다. 항상 저쪽 먼저 저장할 것.
	}
}
