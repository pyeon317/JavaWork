package day12.api.lang.string;

public class StringBuilderEx2 {

	public static void main(String[] args) {
		
		//문자열과 향상된 문자열과 차이
		
		long start = System.currentTimeMillis();
//		
//		String str = "A";
//		for(int i =1; i <=300000;i++) {
//			str += "A";
//		}
//		
//		long end = System.currentTimeMillis();
//		System.out.println("수행시간:" + (end - start) * 0.01);
//		//75.28		
		
		StringBuilder sb = new StringBuilder ("A");
		for(int i = 1; i <= 300000; i++) {
			sb.append("A");
		}
		long end = System.currentTimeMillis();
		System.out.println("수행시간:" + (end - start) * 0.01);
		//0.09
		
		
		
		
		
		
		
	}
}
