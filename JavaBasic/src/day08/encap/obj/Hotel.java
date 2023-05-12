package day08.encap.obj;

public class Hotel {

	//chef c: 변수로 chef라는 클래스를 받는다?
	//chef c = new chef(); 클래스는 멤버변수로 만들 때
	//private Chef chef = new Chef(); 
	private Chef chef;
	
	//호텔이 생성될 때  외부에서 셰프 객체를 받는다.
	public Hotel() {
		
	}
	
	//chef의 게터 세터
	//객체를 매개변수로 받는 모형
	public void setChef(Chef chef) { //배열을 전달하듯이 객체도 전달가능
		this.chef = chef; //chef값을 바꾸는 - 요리사가 바뀐다
	}
	
	//객체를 반환하는 모형
	public Chef getChef() {
		return chef;
	}
	
}
