package day04;

public class MethodEx01 {

	public static void main(String[] args) {
		
		/*
		 * 메서드는 생성과 호흡이 있습니다.
		 * 메서드는 메서드안에서 생성할 수 없습니다.
		 * =메인도 메서드라 사용할 수 없음.
		 * 
		 * */

		//calSum(); //메서드 호출, 메서드는 몇번이고 재사용이 가능하다
		System.out.println("1~10까지 합:" + calSum());
		
		int result = calSum();
		System.out.println("1~10까지 합:" + result);
		
		String result2 = calSum2();
		System.out.println(result2);
		
		
		
	} //main
	
	//new method
	//반환유형 이름()
	static int calSum() {
		
		//여기에서 전부 사용 가능?
		int sum =0;
		for(int i = 1; i<= 10; i++) {
			sum +=  i;
		}
		
		
		return sum; // 합계를 반환
		
	}

	//문자열 반환
	static String calSum2() { // static은 대문자 아니다...  
		
		//A~Z문자열합
		String str = "";
		for(char c = 'A'; c <= 'Z';  c++) {
			str += c;
		}
		
		return str; //문자열 반환
					// return null;은 아직 뭘 해야할지 모를때 넣어두는
	}
	
}
