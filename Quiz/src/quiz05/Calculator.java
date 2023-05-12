package quiz05;

public class Calculator {

	
	int result;
	double pi = 3.14;
	
	void add(int a) {
		result += a;
		System.out.println(result);
	}
	
	void sub(int a) {
		result -= a;
		System.out.println(result);
	}
	
	double circle(int a) {
		return a * a * pi;
		 
	}	
}
