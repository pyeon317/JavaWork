package day06.import_ex;

//import day06.fruit.Apple; //패키지명을 포함한 클래스명
//import day06.fruit.Melon;
import day06.fruit.*;   // *을 붙이면 패키지의 클래스를 다 쓸 수 있다.

public class MainClass {

	public static void main(String[] args) {
		
		Apple app = new Apple();
		Melon melon = new Melon();
	}
}
