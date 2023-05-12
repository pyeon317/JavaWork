package quiz12;

public class Main {

	public static void main(String[] args) {
		
		MyCart mc = new MyCart(10000);
		
		Radio r = new Radio(); //300, sony
		Tv a = new Tv();
		Computer c = new Computer();
		
		mc.buy(a);
		mc.buy(a);
		mc.buy(a);
		mc.add(r);
		mc.add(r);
		mc.add(r);
		System.out.println("==========");
		mc.info();
	}
}
