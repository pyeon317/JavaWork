package quiz01;

public class Quiz01 {

	public static void main(String[] args) {
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65
		
		
		System.out.println(y += 10 - x++); //5+10-4?=11 //13, 10-(x=2)+(y+5) x=3
		System.out.println(x+=2); //2+2=4 // 3 + 2= 5
		System.out.println( !('A' <= c && c <='Z') ); // true //t&t인데 !로 false
		System.out.println('C'-c); //2 //67('C')-65(c = 'A')
		System.out.println(c+1); //66 //65+1=66
		System.out.println(c++); //65 //A
		System.out.println(c);  //65 //A에서 1증가되서 B

		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
