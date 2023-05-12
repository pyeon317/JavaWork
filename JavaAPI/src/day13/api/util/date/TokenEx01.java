package day13.api.util.date;

import java.util.StringTokenizer;

public class TokenEx01 {

	public static void main(String[] args) {
		
		//빠른 문자열 분리
		//split()
		//toCharArray()
		
		//문자열, 구분자, bool을 매개변수로 받아 문자열 분리
		
		String str1 = "오늘은 날씨가 맑고, 매우 시원하지 않습니다";
		
		StringTokenizer token1 = new StringTokenizer(str1);
		
		//토큰의 개수 확인
		int cnt = token1.countTokens();//달라진 토큰의 개수
		System.out.println("나눠진 문자열 개수:" + cnt);
		
		//다음 토큰의 확인
//		System.out.println(token1.nextToken()); //연속으로 쓰면 자동으로 그 다음 문자열을 보여주는
//		System.out.println(token1.nextToken()); //한번 토큰이 진행되면 뒤로 못 돌아감
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken());
//		System.out.println(token1.nextToken()); //문자열을 넘겨서 에러 발생
		
		//다음 토큰의 여부확인
		System.out.println(token1.hasMoreTokens());
		
		while(token1.hasMoreTokens() != false) { //!=false를 꼭 넣을 필요는 없는데 좀더 자세하게 하기 위해서
			System.out.println(token1.nextToken());
			
		}
		
		System.out.println("-------------------------------------------");
		//다양한 구분자를 한번에 지정해서 토큰화 가능
		
		String str2 = "2022/11/31/홍길동/010-1111-2222/서울시/www.example.com";
		
		//  /기준으로 자름
		StringTokenizer token2 = new StringTokenizer(str2, "-/."); // "/"는 구문자. -/. 여러개 넣으면 다 적용
		
		while(token2.hasMoreTokens() != false) {
			System.out.println(token2.nextToken());
		}
		
		System.out.println("-------------------------------------------");
		//구분자를 토큰에 포함시킴
		StringTokenizer token3 = new StringTokenizer(str2, "/", true);
		
		for(int i = 1 ; token3.hasMoreTokens(); i++) {
			System.out.println(token3.nextToken());
		}
		
		System.out.println("-------------------------------------------");
		
		/*
		 * 1.
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
