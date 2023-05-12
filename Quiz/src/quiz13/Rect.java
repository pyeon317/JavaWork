package quiz13;

public class Rect extends Shape{

	/*
	 * 사각형은 side변수를 가집니다.
	 * 사각형은 생성될 때 이름과, side를 받을 수 있도록 생성자 선언.
	 * getArea() = 사각형의 너비를 구하도록 오버라이딩
	 */
	
	private int side;
	
	public Rect(String name, int side) {
		super(name);
		this.side =side;
	}
	
	
	public double getArea() {
		return side * side;
	}
	
}
