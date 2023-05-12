package day12.api.lang.math;

public class MathEx {

	public static void main(String[] args) {
		
		int r = (int)(Math.random() * 10 +1); //1~10
		
		double d = Math.abs(-3.14); //절대값
		System.out.println(d);
		
		double d2 = Math.ceil(3.14); //올림
		System.out.println(d2);
		
		double d3 = Math.floor(3.14); //내림
		System.out.println(d3);
		
		double d4 = Math.round(3.14); //반올림
		System.out.println(d4);
		
		int d5 = Math.max(3, 5); //큰 수 반환
		System.out.println(d5); 
		
		
		
		
	}
	
}
