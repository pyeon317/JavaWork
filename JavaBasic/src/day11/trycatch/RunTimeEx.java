package day11.trycatch;

public class RunTimeEx {

	public static void main(String[] args) {
		
		//실행 에러들
		//int[] arr = {1,2,3,4,5};		
		//System.out.println( arr[5] );
		
		//castException
		//String s = (String)new Object();
		
		//문자열 => 숫자로 변경
		//String str = "10a";		
		//int num = Integer.parseInt(str); //
		
		//Nullpointer
		String str = null;
		str.charAt(0);
		
		
		
	}
}
