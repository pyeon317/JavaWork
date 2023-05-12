package day12.api.lang.string;

import java.util.Arrays;

//day12.api.lang.
public class MainClass {

	public static void main(String[] args) {
		
		
		
		
		
		
		
//		char[] arr = {'a','b', 'c'};
//		
//		String str = new String(arr);
		
		String str = "안녕하세요~";		
		System.out.println(str);
		
		//한글자 자르기
		char c = str.charAt(0);
		System.out.println(c);
		
		//찾으면 인덱스번호를 반환, 없다면 -1로 반환
		
		System.out.println(str.indexOf("안녕"));
		System.out.println(str.indexOf("xx"));
		
		if(str.indexOf("안녕") != -1) {
			System.out.println("문자에 값이 존재함");
		}
		
		//문자열 끝에서부터 값을 찾음
		System.out.println(str.lastIndexOf("안녕"));
		
		//contains = 있다면 true 없으면 false
		if( str.contains("안녕") ) {
			System.out.println("문자에 값이 존재함");
		}
		
		//length
		System.out.println("문자열의 길이:" + str.length());
		
		System.out.println("====================================");
		
		//문자열 변경 replace
		//charsequence -문자열 변경
		str = "자바의 기원은, 자바칩 프라페치노 커피집에서 시작되었습니다";
		
		System.out.println( str.replace("자바", "java"));
		//출력시에만 바껴서 배열 자체는 그대로임
		
		System.out.println(str.replaceFirst("자바", "java")); //regex = 정규표현 문자식
		
		System.out.println(str.replace(" ", ""));
		
		System.out.println("====================================");
		
		//문자열 자르기 substring
		System.out.println(str.substring(9)); //입력 숫자 미만 절삭
		System.out.println(str.substring(9,17)); //9이상 17미만 추출
		
		String[] arr = str.split(" ");//매개변수가 1개면 매개변수를 기준으로 잘라서 배열을 생성
		System.out.println(Arrays.toString(arr));
		
		String[] arr2 = str.split(" ",3);//최대 배열의 크기가 3 - 매개 변수 전자의 기준대로 배열을 만들지만, 후자에 입력한 숫자만큼의 배열만 생성됨
		System.out.println(Arrays.toString(arr2));
		
		char[] arr3 = str.toCharArray();//한글자씩 배열에 담음
		System.out.println(Arrays.toString(arr3));
		
		System.out.println("====================================");
		
		//문자열의 비교
		str = "홍길동";
		System.out.println(str.equals("홍길동"));
		
		//사전 등재순의 비교
		System.out.println(str.compareTo("홍길동")); //0 - 같은 문자
		System.out.println(str.compareTo("홍길자")); //음수 - str이 홍길자보다 사전등재순 앞에 위치함 =>가나다 순에서 앞이란 소린듯?
		System.out.println(str.compareTo("홍길가")); //양수 - str이 홍길가보다 사전등재순 뒤에 위치함 =>가나다 순에서 뒤라는 소린듯?		
		
		//특정 구분자로 문자열을 연결할 수 있음		
		System.out.println(String.join("-", "hello", "world", "!!!", "~~~"));
		//hello-world-!!!-~~~ 가 나오므로 처음에 연결한 문자로 뒤에 나열한 글자들이 연결된 것을 볼 수 있다
		
		//기본타입을 문자열로 변경
		System.out.println(String.valueOf(1) + String.valueOf(2));//숫자를 문자열로 바꿈
		System.out.println("" + 1 + 2);//위와 같음
		
	}
}
