package day02;

public class BreakEx03 {

	public static void main(String[] args) {
		/*
		//변수를 사용하는 방법
		boolean flag = false; //탈출을 위한 변수
		for(char c = 'A'; c <= 'Z'; c++) {
			for(char l = 'a'; l <= 'z'; l++) { //숫자 1이 아니라 알파벳 l
				
				System.out.println(c + "-" + l);
				
				if(l == 'f') {
					flag = true; //탈출을 위해 true
					break;
				}
			} // 내부 for end
			
			if(flag) break;
			
		}//외부 for end
		*/
		x:for(char c = 'A'; c <= 'Z'; c++) {   //반복문 앞에 x 를 넣어서 밑의 브레이크에서 한번에 x가 있는 부분까지의 모든 반복문을 탈출시킨다.
			for(char l = 'a'; l <= 'z'; l++) {

				System.out.println(c + "-" + l);
				if(l== 'f') {
					break x;
				}
			
			}
		}
	}
}
