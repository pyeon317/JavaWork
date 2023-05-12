package day10.static_.singleton;

public class MainClass {

	public static void main(String[] args) {
		
	
	//Singleton s = new Singleton();
	Singleton s = Singleton.getInstance();
	Singleton s1 = Singleton.getInstance();
	Singleton s2 = Singleton.getInstance();
	
	System.out.println(s);
	System.out.println(s1);
	System.out.println(s2);

	System.out.println(s.getDomain());
	
	}
}
