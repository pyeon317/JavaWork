package day10.static_method;

public class Count {

	public int a;
	public static int b; //static이 있으면 클래스 내부에 만들어도 클래스 밖에 있는 것과 같다. 
	
	//일반 메서드 - 일반 멤버와, 정적멤버 모두 사용 가능
	public int method01() {
		a = 10;
		b++;
		return b;
	}
	
	//정적 메서드 - 일반 멤버를 사용할 수 없음, 정적멤버는 사용이 가능
	//			단, 객체생성을 통해서는 일반멤버 사용이 됩니다.
	public static int method02() {
		//a = 10; //사용 안되는 이유 - static이 생성될 당시에 a변수 없음
		Count c = new Count();
		c.a = 10; //
		
		b++; //정적멤버라서 사용가능
		return b;
	}
}
