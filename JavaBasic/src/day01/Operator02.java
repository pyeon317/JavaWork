package day01;

public class Operator02 {

	public static void main(String[] args) {
		
		//2항 연산자
		int i = 7 / 3; //7을 3으로 나눈 몫 - 2
		int j = 7 % 3; //7을 3으로 나눈 나머지 - 1
		int k = 7 * 3; //7을 3으로 곱한 값 - 21
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		
		//비교연산 <, <=, ==, >=, >, !=
		System.out.println(i == j); //false
		System.out.println(i >= j); //true
		System.out.println(i < j); //false
		System.out.println(i != j); //true
		System.out.println(21 != k); // false
		System.out.println(k % 2 != 0); //k%2가 짝수가 아니다>true
		System.out.println(k % 2 ==1); //k%2가 홀수다>true
		
		//비트연산자 - 참고용
		int a = 5; //0000 0101
		int b = 3; //0000 0011
		
		System.out.println(a & b); // 두 비트가 1이면 1, 아니면 0 > 0000 0001
		System.out.println(a | b); // 두 비트중 하나만 1이어도 1, 아니면 0 >0000 0111
		System.out.println(a ^ b); // 같으면 0, 다르면 1 > 0000 0110
		
		//비트쉬프트 - 참고용
		int h = 100;
		System.out.println(h << 2);
		
		
	}
}
