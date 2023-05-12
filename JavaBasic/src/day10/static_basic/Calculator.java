package day10.static_basic;

public class Calculator {

	/*
	 * 클래스 설계를 할 때, 적절한 곳에 static을 붙이면 좋습니다.
	 * 
	 * 객체마다 다른값을 가져야 하면 일반변수
	 * 객체마다 동일한 값을 가져야 하면 static변수가 됩니다.
	 */
	
	private String color; //객체마다 다른 색을 부여하기 위해 객체생성이 필요하므로 일반.
	public static double pi = 3.14; //변하지 않는 값이니까 매번 객체생성하지않고 사용하기 위해 static사용
	
	/*
	 * 메서드
	 * 일반멤버변수룰 사용하는 메서드는 static이면 안됩니다. (getter/setter)
	 * 
	 * 일반멤버변수를 사용하지 않고,
	 * 외부에서 범용성있게 사용할 메서드는 static이면 좋습니다.
	 */
	
	public void setColor(String color) {
		this.color = color; //
	}
	
	public String getColor() {
		return color;
	}
	
	public static double circle(int r) {
		return r * r * Math.PI; //static을 안붙여도 되지만 붙여도 됨.
		//어차피 일반변수로 선언하면 매번 객체선언하기 귀찮으니 static붙이고 쓰는게 편함. 
	}
	
}
