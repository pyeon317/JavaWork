package day11.trycatch;

public class TryCatchEx02 {

	public static void main(String[] args) {
		
		//반복문에서의 예외처리
		
		String[] arr = {"홍길동", "이순신", "홍길자"};
		
		int i = 0;
		while(i < 4) {
			
			try {
				System.out.println(arr[i]);
			} catch (Exception e) {
				System.out.println("배열의 범위를 벗어남");
			} finally { //catch뒤에 붙여도 되고 안붙여도 됨. 에러의 유무에 상관없이 실행.
				System.out.println("이 문장은 무조건 실행되는 문장입니다");
			}
			
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
