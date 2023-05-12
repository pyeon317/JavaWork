package day05;

public class ObjectBasic02 {

	public static void main(String[] args) {
		
		Calculator call = new Calculator();
		
		System.out.println("====1번 계산기====");
		System.out.println( call.add(10) );
		System.out.println( call.add(20) );
		System.out.println( call.add(30) );
		
		Calculator cal2 = new Calculator();
		System.out.println("====2번 계산기====");
		System.out.println( cal2.add(100) );
		System.out.println( cal2.add(200) );
		System.out.println( cal2.add(300) );
		
		//ObjectBasic01에서는 1번,2번계산기를 만들 때마다 메서드를 만들어야 했는데
		//ObjectBasic02에서는 클래스로 메서드를 하나 만들어 놓으니까 필요할 떄마다
		//불러오기만 하면 되서 시간과 용량을 줄일 수 있다.
		//이 클래스에서 각각의 계산기는 하나의 객체라고 한다.
		
	}
}
