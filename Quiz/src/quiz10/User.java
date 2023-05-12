package quiz10;

public class User {

	private String name;
	private int rrn;
	private int age;
	
	 public User() {

	}
	
	public User(String name, int rrn, int age) {
		super();
		this.name = name;
		this.rrn = rrn;
		this.age = age;
	}

	public void setName(String name) { //입력
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRrn(int rrn) { //입력
		this.rrn = rrn;
	}
	
	public int getRrn() {
		return rrn;
	}
	
	public void setAge(int age) { //입력
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	String info() {
		return  "이름:" + name + ", rrn:"+ rrn + ", 나이" + age;
	}
}
