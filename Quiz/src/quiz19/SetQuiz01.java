package quiz19;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetQuiz01 {

	public static void main(String[] args) {
		
		/*
		 * 중복되지 않는 6자리 수 (로또번호)
		 * 
		 * 1. Random객체를 이용해서 1~45까지 랜덤한 수를 생성
		 * 2. Set에 6개의 랜덤한 로또 번호를 저장해주세요.
		 */
		Set<Integer> lotto = new HashSet<>();
		Random ran = new Random();
		
		while(lotto.size() < 6) {
			
			int N = ran.nextInt(45)+1;
			lotto.add(N);
					
		}
		System.out.println(lotto.toString());
	}
}
