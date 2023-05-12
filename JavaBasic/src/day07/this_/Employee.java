package day07.this_;

public class Employee extends Person {

	String department;

	Employee(String name, int age, String department){
		this.name = name;
		this.age = age;
		this.department = department;
	}
	String info() {
		return "이름:" + name + ", 나이:" + age + ", 부서:" + department;
	}
	
}
