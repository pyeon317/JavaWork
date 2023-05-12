package quiz09;

public class Main {

	public static void main(String[] args) {
		
		SuperSonicAp a = new SuperSonicAp("비행");
		SuperSonicAp b = new SuperSonicAp("비행");
		
		
		
		a.takeOff();
		a.fly();
		a.land();
		
		System.out.println(a.info());
		System.out.println(b.info());
		
	}
}
