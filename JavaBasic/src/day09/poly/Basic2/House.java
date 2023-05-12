package day09.poly.Basic2;

public class House {
 
	
	private Student[ ]student = new Student[100];
	private Employee[] emoloyee = new Employee[100];
	private Teacher[] teacher = new Teacher[100];
//	private int index1;
//	private int index2;
//	private int index3;
//	
//	public void inHouse(Student s) {
//			student[index1] = s;
//			index1++;
//	}		
//	public void inHouse(Teacher t) {
//			teacher[index2] = t;
//			index2++;
//	}
//	public void inHouse(Employee e) {
//		employee[index3] = e;
//		index3++;
//	}
	private Person[] person = new Person[100];
	private int index;
	
	public void inHouse(Person p) {
		person[index] = p;
		index++;
	}
	
	
	public void WhoAreYou(Person p) {
		
		if(p instanceof Student) { //Student > true
			System.out.println("너는 학생이야!");
			Student s = (Student)p; //이미 조건문에서 학생타입인게 확인되서 학생타입으로 변경가능함.
		}else if (p instanceof Teacher) {
			System.out.println("나는 선생이야!");
		}else if(p instanceof Employee) {
			System.out.println("너는 직원이야!");
		}else {
			System.out.println("너는 그냥 사람이야!");
		}
	}
	
	
//	//추가 > 배열 안에 들어있는 객체의 타입에 맞춰 출력
//	public void printHouse() {
//		
//		for(int i = 0; i < index; i++) {
//			
//			if(person[i] instanceof Student) {
//				
//			}
//		}
//	}	
}
