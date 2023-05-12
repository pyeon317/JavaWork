package day11.trycatch;

public class ThrowsEx02 {

	public ThrowsEx02() throws Exception{
		System.out.println("생성자시작");
		aaa();
		System.out.println("생성자종료");
	}
	
	public void aaa() throws Exception {
		System.out.println("aaa시작");
		bbb();
		System.out.println("aaa종료");
	}
	
	public void bbb() throws Exception{
		System.out.println("bbb시작");
		
		System.out.println(10 / 0);
		
		
		
//		try {
//			System.out.println(10 / 0);
//		} catch (Exception e) {
//			System.out.println("예외처리 끝");
//		}
		
		System.out.println("bbb종료");
	}
	
	
	
	//main
	public static void main(String[] args) {
		
		try {
			ThrowsEx02 ex = new ThrowsEx02();
		} catch (Exception e) {
			System.out.println("예외처리 끝");
			
		}
		
	}
	
}
