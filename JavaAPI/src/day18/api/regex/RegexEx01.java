package day18.api.regex;

public class RegexEx01 {

	public static void main(String[] args) {
		
		String info = "홍길동|30세|서울시 강남구|010-1234-5678";
		
		//휴대폰 형식을 찾아서 ***-****-**** 해주세요.
		
		String pattern = "[0-9]{3}-[0-9]{4}-[0-9]{4}";//0-9 연속3개인수 - 0-9연속4개인 수 - 이런식
		//info.replaceAll(정규표현식, 치환될 문자)
		//특정 API에서 regex가 있다면, 정규표현식을 적용할 수 있다는 의미입니다.
		String result = info.replaceAll(pattern, "***-****-****");
		System.out.println(result);
		
		
		
		
	}
}
