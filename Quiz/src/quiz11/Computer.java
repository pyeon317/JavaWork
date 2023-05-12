package quiz11;

public class Computer {
	
	//1. 키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	private KeyBoard key;
	private Monitor monitor;
	private Mouse mouse;
	
	//2.기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	public Computer() {
		this.key = new KeyBoard();
		this.mouse = new Mouse();
		this.monitor = new Monitor();
	}
	
	//3.KeyBoard, Mouse, Monitor를 전달받는 생성자를 생성하세요.
	public Computer(KeyBoard key, Mouse mouse, Monitor monitor) {
		
		this.key = key;
		this.monitor = monitor;
		this.mouse = mouse;
	}
	
	//4.키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	public void computerInfo() {		
		System.out.println("=====컴퓨터 정보=====");
		key.info();
		System.out.println(key);
		monitor.info();
		System.out.println(monitor);
		mouse.info();
		System.out.println(mouse);	
		System.out.println("===============");
	}
	
	//5.키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	public KeyBoard getKey() {
		return key;
	}
	public void setKey(KeyBoard key) {
		this.key = key;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public Mouse getMouse() {
		return mouse;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
		
	
	//6.메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
}
