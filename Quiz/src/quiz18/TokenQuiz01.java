package quiz18;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TokenQuiz01 {

	public static void main(String[] args) {
	      /*
	       * 1. 스캐너를 통해서 nextLine() 문장을 받습니다.
	       * 2. 입력된 문자열을 토크나이저를 이용해서 공백기준으로 분리
	       * 3. 분리한 토큰의 개수를 출력
	       * 4. 분리된 토큰을 콘솔에 숫자를 붙여서 세로로 출력
	       *    1. 안녕
	       *    2. 하세요.
	       *    3. 오늘은 
	       * 5. 분리된 문자열을 배열에 저장
	       */
		Scanner scan = new Scanner(System.in);
		
		
		String str = scan.nextLine();
		
		StringTokenizer token = new StringTokenizer(str, " "); //이미 공백으로 나눠진 거 같지만 조건에 있으니 확실히 하는?
		
		int cnt = token.countTokens();
		System.out.println(cnt);
		
		String[] arr = new String[cnt];
		
		for(int i = 0; token.hasMoreTokens(); i++) {
			arr[i] = token.nextToken();
			System.out.println((i+1) + ". " + arr[i]); 
			//nexttoken을 또 쓰면 이미 넘어간 상태라 다음 토큰이 써지므로 안됨. 한번에 2개를 쓴다고 할까나
			
		}
		
		System.out.println(Arrays.toString(arr));
		scan.close();
	}
	//선생님
	public void TokenQuiz011() {
	Scanner scan = new Scanner(System.in);
	
	System.out.println(">");
	String word = scan.nextLine();
	
	StringTokenizer st = new StringTokenizer(word);
	String[] arr = new String[st.countTokens()];
	
	for(int i = 1; st.hasMoreTokens(); i++) {
		
		String str = st.nextToken();
		arr[i-1]= str;
		System.out.println(i + ". " + str);
	}
	
	
	}
}
