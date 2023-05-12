package quiz04;

public class Main {

	public static void main(String[] args) {
	
		Warrior a = new Warrior("az");
		a.info();
		
		a.bash();
		
		Wizard b = new Wizard("wqdasd");
		
		b.info();
		
		System.out.println(b.mp);
		
		b.iceArrow();
		b.iceArrow();
		b.iceArrow();
		b.iceArrow();
		b.iceArrow();
		b.iceArrow();		
	}	
}
