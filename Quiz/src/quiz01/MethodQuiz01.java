package quiz01;

public class MethodQuiz01 {

	public static void main(String[] args) {
		
		method1();
		
		String result = method2("가");
		System.out.println(result);
		
		double x = method3(3,4,5);
		System.out.println(x);
		
		String y = method4(5);
		System.out.println(y);
		
		method5("가",5);
		
		
		int a= maxNum(2,3);
		System.out.println(a);
		
		int b = abs(-1);
		System.out.println(b);
		
		String str = java(8);
		System.out.println(str);
	}

	//1
	static void method1() {
		System.out.println("안녕하세요");
	}

	//2
	static String method2(String s) {
		
		return s;
	}

	//3
	static double method3(int a, int b, double c) {
		return a+b+c; 
	}

	//4
	static String method4(int a) {
		/*
		String str = "";
		if(a % 2 == 0) {
			str = "짝수";
		}else {
			str = "홀수";
		}
		return str;
		*/
		
		/*
		if(a % 2 == 0) {
			return  "짝수";
		}else {
			return "홀수";
		}
		*/
		
		return a % 2 == 0 ? "짝수" : "홀수";
		
	}

	//5
	static void method5(String b, int a) {
		
		for(int i = 0; i <= a; i++) {
			System.out.println(b);
		}
		System.out.println();
	}

	//6
	static int maxNum(int a, int b) {
		
		if(a > b) {
			return a;
		}else {
			return b;
		}
	}

	//7
	static int abs(int a) {
		
		return a > 0? a : -a;
	}
	
	
	//8
	static String java(int c) {
		
		String str = "";
		
		for(int i = 1; i <= c; i++) {
			if(i % 2 == 1) {       //str에 +=를 해야 누적됨. =만 쓰면 안나옴
				str += "자";
			}else {
				str += "바";
			}			
		}
		return str;
	}
	
	
}

