package day01;

public class Operator03 {
	
	public static void main(String[] args) {
	
		int x =10;
		int y =20;
		
		//if뒤에 소괄호가 true면 if 중괄호 실행, false먄 else문 실행
		if ( x != 10 & ++y == 21)/*f&t*/ {
			System.out.println("참 입니다");			
		} else {
			System.out.println("거짓 입니다");			
		}
		
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		
		if(x == 10 | ++y == 21)/*t&f*/ {
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
		
		}
		
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		System.out.println("------------------------");

		x = 10;
		y = 20;
		
		if ( x != 10 && ++y == 21)/*f&t*/ {
			System.out.println("참 입니다");			
		} else {
			System.out.println("거짓 입니다");			
		}
		
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		
		if(x == 10 || ++y == 21)/*t&f*/ {
			System.out.println("참 입니다");
		} else {
			System.out.println("거짓 입니다");
		
		}
		
		System.out.println("x값:" + x);
		System.out.println("y값:" + y);
		
		/*&&과 ||은 뒤의 계산을 무시하기 때문에 참,거짓은 판별하지만  
		 *값의 변화가 없어서 y값이 변하지 않음
		 */
		
		
	}

}
