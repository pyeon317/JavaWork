package quiz13;

public class MainClass {

	public static void main(String[] args) {
		
		Circle c = new Circle("원",4); //shape c 도 가능
		System.out.println( c.getName() );
		System.out.println( c.getArea() );
		
		Rect r = new Rect("사각형",5);
		System.out.println( r.getName() );
		System.out.println( r.getArea() );
	}
}
