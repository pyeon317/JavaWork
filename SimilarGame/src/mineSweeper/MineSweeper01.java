package mineSweeper;

import java.io.*;
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
		
		String m = "mine";
		
		String[][] arr = new String [x][y];
		
		int i = 0;
		
		while(i < z-1) {
		
			int a = (int)(Math.random()*x); //배열은 0부터 시작하니까 +1 안해도 됨
			int b = (int)(Math.random()*y);
			
			if(arr[a][b] == null) {
				arr[a][b] = m;
				i++;
			}else {						
				i--;
			}																					
		}
	}
	
	static void numbering() {
		int cnt = 0;
		
	}
}
