package day01;

public class DataType {
	public static void main(String[] args) {
		//정수형타입
		byte a = 127;
		byte a1 = -128;
		short b = 32767;
		short b1 = -32768;
		int c = 2147483647;
		int c1 = -2147483648;
		long d = 123123123123123123L; // 뒤에 L을 붙여주기
		long d1 = -123123123123123123L; // 뒤에 L을 붙여주기
		
		//2, 8, 16진수
		int bin = 010; // 8진수: 맨앞에 0을 붙임
		System.out.println("8진수 010은: " + bin + "입니다.");
		
		int bin2 = 0b111; //2진수: 맨앞에 0b를 붙임
		System.out.println("2진수 111은: " + bin2 + "입니다.");
		
		int hexa = 0xA9; //16진수: 맨앞에 0x를 붙임
		System.out.println("16진수 A9는: " + hexa + "입니다.");
		
		System.out.println("-------------------------");
		
		//실수형타입
		float f1 = 3.14F; //뒤에 f를 붙여서 float타입 지정
		double dou1 = 3.14;
		
		System.out.println(f1);
		System.out.println(dou1);
		
		float f2 = 3.141231231232123F; //뒤에 f를 붙여서 float타입 지정
		double dou2 = 3.141231231231231232132;
		
		System.out.println(f2); //7자리까지만
		System.out.println(dou2); //15자리까지만
		
		System.out.println("-------------------");
		
		//true, false만 가능
		boolean bool1 = true;
		boolean bool2 = false;
	
		System.out.println(bool1);
		System.out.println(bool2);
		
		
	}
}
