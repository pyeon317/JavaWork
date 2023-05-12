package day05;

public class VarMain {

	public static void main(String[] args) {
		
		Variable var = new Variable();
		
		var.a = 100; //외부에서 값변경
		var.b = "바꿔버릴거야"; //
		
		var.printNum(10); //(10)은 객체에서 printnum 의 int부분(d)
	}
}
