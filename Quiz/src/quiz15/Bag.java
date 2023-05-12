package quiz15;

import java.util.Arrays;

public class Bag implements IBag {
	
	private String[] arr = new String[100]; 
	private int x;
	
	
	@Override
	public void insert(String item) {
		
		if(x >= 100) {
			System.out.println("가방이 가득 찼습니다.");
		} else {
			arr[x] = item;
		this.x++;
		}
		
	}

	@Override
	public void print() {
		
		for(int a = 0; a < x; a++) {
			System.out.print(this.arr[a] + " ");
			
		}
		
	}

	@Override
	public int search(String item) {
		for(int i = 0; i < x; i++) {  //아이템 탐색
			if(arr[i].equals(item)) { //있으면?
				return i; //번호 리턴
			}
		}
		return -1; //없는 경우 -1
	}

	@Override
	public boolean delete(String item) {
		
		
		
		for(int i = 0; i < x; i++) {
			
			if(arr[i].equals(item)) {		//아이템 있으면?
								
				for(int j = i; j < x - 1; j++) {	//아이템 당겨서 재배치
					arr[j] = arr[j+1];					
				}
				arr[x-1] = null; //빈공간 만들기 위해 삭제
				x--;
				return true;
			}
		}
		return false;
	}
}
