package quiz08;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		MyCart a = new MyCart(10000);
		
		
		a.buy("tv");
		a.buy("tv");
		a.add("com");
		a.info();
		
	}
}
