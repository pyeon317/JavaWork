package day02;

public class ForEx01 {

	public static void main(String[] args) {
		
		int sum = 0; //합계변수
		
		for(int a = 1; a <= 10; a++) { //3번째 비워두면 무한으로 돌아감
			sum += a;
		}
		
		System.out.println("합계:" + sum);

		System.out.println("---------------------");
		
		for(int a = 10; a >= 1; a--) {
			System.out.println(a);
		}
	}
}
