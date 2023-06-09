package mineSweeper;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class MineSweeper01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("난이도를 선택하세요");
			System.out.println("1.easy | 2.normal | 3.hard");
			int d = scan.nextInt();
			
			
			
			switch (d) {
			case 1://10*10 10
				mine(10, 10, 10);
				
				break;
				
			case 2://16*16 40
				mine(16, 16, 40);
				
				break;
			case 3://16*30 99
				mine(16, 30, 99);
				
				break;

			default:
				break;
			}
		}
	}
	
	static void mine(int x, int y, int z) {
		
		int m = -1;
		
		int[][] arr = new int [x][y];
		
		int i = 0;
		
		while(i < z) {
		
			int a = (int)(Math.random()*x); //배열은 0부터 시작하니까 +1 안해도 됨
			int b = (int)(Math.random()*y);
			
			if(arr[a][b] != 0) {
				arr[a][b] = m;
				i++;
			}																					
		}//생성완료
		System.out.println(Arrays.deepToString(arr));
		//여기부터 숫자넣기
		for(int a = 0; a < x; a++) {
			for(int b = 0; b < y; b++) {//전체배열
				
				if(arr[a][b] == 0) {//빈칸이면 계산하고 수 입력
					int count = 0;
					
					for(int c = a-1; c < a + 2; c++) {//범위탐색
						for(int d = y - 1; d < y + 2; d++) {
							
//							if(c < 0 || c > (a+2) || d < 0 || d > (y+2))continue; //범위밖으로 벗어나면 생략
//							if(arr[c][d] == -1)count++;
						}
					}
				arr[a][b] = count;
				}
			}
		}
		
	}
}
