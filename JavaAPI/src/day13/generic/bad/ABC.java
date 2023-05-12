package day13.generic.bad;

public class ABC {

	//제네릭이 없다면?
	//ABC를 뭐든 저장할 수 있는 클래스
	private Object obj;
	
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public Object getObj() {
		return obj;
	}
}
