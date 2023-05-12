package day11.trycatch;

public class ThrowEx01 {

	public static void main(String[] args) {
		
		int result;
		try {
			result = sum(-10);
			System.out.println(result);
		} catch (Exception e) {
			String msg = e.getMessage(); //예외 메시지를 문자열로 반환
			System.out.println(msg);
		}
				
	}
	
	public static int sum(int n) throws Exception {
		
		//예외를 직접 생성해서, 메서드를 종료할 때 사용할 수 있습니다.
		if (n < 0) {
			throw new Exception("0 이상의 값이어야 합니다"); //예외를 생성할 때, 예외에서 사용되는 메시지를 전달 할 수 있습니다.
		}
		
		int sum = 0;
		for(int i = 1; i <= n ; i++) {
			sum += i;
		}
		
		return sum;
	}
}
