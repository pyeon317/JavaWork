package quiz11;

public class Main {

	public static void main(String[] args) {
		
		KeyBoard key = new KeyBoard();
		Monitor monitor = new Monitor();
		Mouse mouse = new Mouse();
		
		Computer com = new Computer(key, mouse, monitor);
		
		com.computerInfo();
		
		//get
		Monitor m = com.getMonitor();
		m.info();
		
	}
}
