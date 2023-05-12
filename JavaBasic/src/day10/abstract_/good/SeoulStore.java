package day10.abstract_.good;

public class SeoulStore extends Store{

	@Override
	public void melon() {
		System.out.println("서울지점 메론 800원");
		
	}

	@Override
	public void orange() {
		System.out.println("서울지점 오렌지 700원");
		
	}

	@Override
	public void grape() {
		System.out.println("서울지점 포도 600원");
		
	}

	@Override
	public void apple() {
		System.out.println("서울지점 사과 500원");
		
	} //
	
}
