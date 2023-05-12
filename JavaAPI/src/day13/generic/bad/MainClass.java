package day13.generic.bad;

public class MainClass {

	public static void main(String[] args) {
		
		/*
		 * Object형으로 선언하면 무엇이든 저장할 수 있지만,
		 * 그 값을 사용할 때, 알맞은 타입으로 반드시 형변환을 해야 합니다.
		 * 
		 * 잘못형변환 하면, 예외가 발생합니다.
		 */
		ABC abc = new ABC();
		abc.setObj("홍길동");
		
		//Object name = abc.getObj();
		String name = (String)abc.getObj();
		
		ABC abc2 = new ABC();
		//Person p = new Person();
		abc2.setObj( new Person() );
		
		Person p = (Person)abc2.getObj();
		
		
		
	}
}
