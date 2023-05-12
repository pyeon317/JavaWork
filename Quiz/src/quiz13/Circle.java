package quiz13;

public class Circle extends Shape{
	
	/*
	 * 원은 radius변수를 가집니다.
	 * 원은 생성될 때 이름과, radius를 받을 수 있도록 생성자 선언.
	 * getArea() = 원의 너비를 구하도록 오버라이딩
	 */
	
	private int radius;
	
	public Circle(String name, int radius) {
		super(name); //부모와 자식이 항상 super로 연결되있는걸 잊으면 안됨. 추상으로 끊겼으니 이렇게 다시 연결..인 듯?
		this.radius = radius;
	}

	@Override
	public double getArea() {
		
		return radius * radius * Circle.PI;
	}

	
}
