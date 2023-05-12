package day12.api.lang.object;

public class Person extends Object implements Cloneable{ //클론을 사용하기 위해 implements사용

	//모든 클래스를 Object 상속받습니다.
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj) { //equals의 기능을 바꿈. 객체 -> 문자열
		//멤버변수 name 값이 같다면 true변환
		
		if( obj instanceof Person) {
			Person p = (Person)obj;
			
			if(p.getName() != null) {
				if(p.getName().equals(this.name)) {
					return true;
				}
			}
		}
		return false;
	}

//	@Override // 멤버변수가 여러개면 다 보여줌
//	public String toString() {
//		return "Person [name=" + name + "]";
//	}
	
	

	@Override //- 객체가 사라질 때 실행됨
	protected void finalize() throws Throwable {
		//객체가 사라지는 시점에서 자동으로 실행
		System.out.println(this.name + "님이 소멸되었습니다");
		
	}
	
	/*
	 * 객체 복사 메서드
	 * clone()을 오버라이드하면
	 * 
	 */
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	/*
	 * 객체 복사 메서드
	 * clone()을 오버라이드하면 외부에서 사용이 가능해집니다.
	 * 클래스는 Cloneable인터페이스를 상속받아야합니다.
	 */

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	//오버라이드
	//alt + shift + s -> implement/override methods
	
	
	
	
}
