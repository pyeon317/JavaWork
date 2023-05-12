package day02;//4회차

public class IfEx01 {

	public static void main(String[] args) {
		
		//Math.random
		//0~100
		int point = (int)(Math.random() * 101);
		
		System.out.println("너의 점수는:" + point);
		
		//커트라인 60점
		if(point >= 60) {
			System.out.println("60점 이상입니다");
			System.out.println("합격");
		} else {
			System.out.println("60점 미만입니다");
			System.out.println("불합격");
		}
		
		System.out.println("수고!");
		
		
		
	}
}
