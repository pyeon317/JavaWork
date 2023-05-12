package day04;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		
		//문자열 다루기
		//문자열은 사실 배열입니다. 문자열은 인덱스가 있습니다.
		
		String str = "안녕하세요~영어로 하면 하이!";
		//System.out.println(str[0]); -안됨
		
		//문자열을 다루는 다양한 메서드를 제공
		
		//문자열을 한글자 자르기 charAt(int index)
		char c = str.charAt(3); //char string 반환
		System.out.println(c);
		
		
		//문자열의 위치확인 IndexOf -앞에서부터 검색
		int idx = str.indexOf("나"); //가장 처음 발견된 위치를 알려준다.
		System.out.println("나 의 위치:" + idx); //indexOf를 했을 때 -1 이 나오면 없는 글자
		
		//lastIndexOf - 뒤에서부터 검색
		int idx2 = str.lastIndexOf("하");
		System.out.println("뒤에서부터 찾은 위치:" + idx2); //위치 순서표시는 앞이 기준이지만 검색은 뒤에서부터
		
		//문자열 변환 toUpperCase, toLowerCase 영어에만 해당. 각각 대문자/소문자로 변환.
		String s = "abcDEF";
		
		String result = s.toLowerCase();
		System.out.println(result); //소문자로
		System.out.println(s); //  👍👍원본 문자열은 그대로 유지👍👍
		
		String result2 = s.toUpperCase();
		System.out.println(result2); //대문자로
		
		System.out.println("===============================================");
		
		//문자열 변경 replace
		s= "abcdefaaa";
		
		String result3 = s.replace("a", "x");
		System.out.println(result3); //a > x 로 모두 변경
		System.out.println(s); //  👍👍원본 문자열은 그대로 유지👍👍
		
		
		String result4 = s.replaceFirst("a", "x"); //버전에 따라 이 명령어가 없을 수도 있음
		System.out.println(result4); //a > x 로 변경(첫번째만)
		
		System.out.println("===============================================");
		
		//공백제거 trim
		str =  "  010-1111-2222  ";
				
		String result5 = str.trim(); //앞뒤 공백을 제거해서 반환
		System.out.println(result5); //원본문자는 변하지 않음.
		
		str = " 안녕 하세요? 오늘은 4월 19일 입니다   ";
		str = str.replace(" ", ""); //공백을 전부 제거해서 원본문자열에 저장.
		System.out.println(str.trim());
		
		
		System.out.println("===============================================");
		
		//문자열 자르기
		
		//특정 위치에서 자르기 
		//substring = 인덱스 기준으로 자름
		str = "010-1111-2222";
		String result6 = str.substring(9); //인덱스 N반쩨 미만 절삭
		System.out.println(result6);
		
		//str은 변함 없음.
		String result7 = str.substring(4,8);//반환은 스트링 4<= x < 8 인덱스 추출
		System.out.println(result7);
		
		System.out.println(str); //원본은 변함없음
		
		
		//split - 특정문자를 기준으로 자름(제대로 사용하려면 정규표현식)
		
		String[] arr = str.split("-");
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = str.split("");
		System.out.println(Arrays.toString(arr2)); //String 배열
		
		//toCharArray - 한글자씩 char형으로 자름
		char[] arr3 = str.toCharArray();
		System.out.println(Arrays.toString(arr3)); //char 배열
		
		//arr2 arr3 출력값은 같지만 출력 방식이 다름
		
		System.out.println("===============================================");
		
		//문자열의 길이
		str = "안녕하세요";
		int len = str.length();
		System.out.println("문자열 길이:" + len);
		
		//문자열의 비교 equals()  - 반드시 외울 걸
		if(str.equals("안녕하세요") ) {
			System.out.println("두 문자가 같음");
		}
		
		//문자열의 포함여부 contains()
		if(str.contains("녕") ) {
			System.out.println("녕이 포함되어 있음");
		}
		
	}
}