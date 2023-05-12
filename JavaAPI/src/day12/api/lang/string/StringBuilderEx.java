package day12.api.lang.string;

public class StringBuilderEx {

	public static void main(String[] args) {
		
		//Stringbuolder - 단일 쓰레드 환경에서 사용
		//StringBuffer = 멀티 쓰레드 환경에서 사용
		
		String str = new String("Java ");
		StringBuilder sb = new StringBuilder("Java ");
		
		//차이점
//		System.out.println(str + "program"); //1회성
//		System.out.println(sb.append("program"));// 아예 기존값에 추가
		str = str+"program";
		sb.append("program");
		
		
		System.out.println(str);
		System.out.println(sb);
		
		//빌더의 메서드
		//append() = 문자열 끝에 추가
		sb.append("ming");
		System.out.println(sb);
		
		//insert() = 중간에 추가
		sb.insert(4, " study ");
		System.out.println(sb);
		
		//
		sb.replace(5, 10, "book");
		System.out.println(sb);
		
		//delete() = 삭제
		sb.delete(5, 10); // 이상. 미만
		System.out.println(sb);
		
		sb.deleteCharAt(0); //인덱스번째 삭제
		System.out.println(sb);
		
		//reverse() - 거꾸로
		sb.reverse();
		System.out.println(sb);
		
		//toString() - 문자열로 형변환
		String result = sb.toString();
		System.out.println(result);
		
		
		
		
		
	}
}
