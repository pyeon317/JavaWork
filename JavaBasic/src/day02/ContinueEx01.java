package day02;

public class ContinueEx01 {

	public static void main(String[] args) {
		
		//continue는 반복문을 건너뜀
		//for문에서는 증/감식으로 이동됩니다.
		/*
		for(int i = 1; i <= 10; i++) {
			
			if(i == 5) { //반복에서 5를 건너뛰어 출력에서 5가 안나옴
				continue;
			}
			
			System.out.println(i);
			
		}
		*/
		//while문에서는 continue는 조건식으로 갑니다.
		int i = 1;
		while(i <= 10) {
			
			if(i == 5) { 
				i++;
				continue;
			}
			
			System.out.println(i);
			
			i++;
		}
		
	}
}
