package quiz01;

public class Quiz02 {

	public static void main(String[] args) {
		
		//1~100까지의 랜덤한 정수를 생성
		int result = (int)(Math.random()*100)+1; //+1을 안했었음
		//랜덤하게 나온 수가 3의 배수인지, 3의 배수다 아닌지 3항연산식으로 결과 출력
				String s = result % 3==0? "3의 배수":"3의 배수가 아님";
				System.out.println(result);
				System.out.println(result+"는"+s);
				System.out.println(result % 3==0? result + "는 3의 배수":"는 3의 배수가 아님");
	}
}
