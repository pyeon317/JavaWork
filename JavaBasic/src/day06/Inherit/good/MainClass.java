package day06.Inherit.good;

public class MainClass {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.age = 20;
		s.name = "홍길동";
		s.studentId = "123123";
		System.out.println(s.info());
		
		Teacher t = new Teacher();
		t.age = 30;
		t.name ="이순신";
		t.subject = "수학";
		System.out.println(t.info());
		
		Employee e = new Employee();
		e.age = 40;
		e.name = "임꺽정";
		e.department = "정원";
		System.out.println(e.info());
	}
}
