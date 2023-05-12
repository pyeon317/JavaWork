package day07.override;

public class Student extends Person{

	
	String studentId;
	
	String info() {
		return "이름:" + name + ", 나이:" + age + ", ID:" + studentId;
	}
	
}
