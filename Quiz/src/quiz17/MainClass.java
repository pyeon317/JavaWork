package quiz17;

public class MainClass {

	public static void main(String[] args) {
		
		Calculator cc = new Calculator();
		
		try {
			cc.input();
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
		} 
		
	}
}
