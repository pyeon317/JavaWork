package quiz19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class MapQuiz01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//맵을 이용하는데 key : 메뉴이름  value: 가격
		Map<String, Integer> map = new HashMap<>();

		while(true) {

			System.out.println("-----음식 메뉴 관리------");
			System.out.println("1. 신규 메뉴 등록"); //이미 등록된 메뉴인지 확인 후에 메뉴 등록
			System.out.println("2. 메뉴판 전체 보기"); //메뉴와 가격을 전부 출력
			System.out.println("3. 메뉴판 수정"); //변경할 메뉴를 받아서 메뉴가 있다면 가격을 수정
			System.out.println("4. 메뉴판 삭제"); //변경할 메뉴를 받아서 메뉴가 있다면 삭제
			System.out.println("5. 프로그램 종료"); //종료

			System.out.print("메뉴입력>");
			int menu = scan.nextInt();

			if(menu == 1) { //메뉴 등록하기
				System.out.print(">");
				String name = scan.next(); //메뉴입력
				System.out.print(">"); //등록 절차
				int price = scan.nextInt(); 
				
				if(map.containsKey(name)) { //등록된지 확인. 있다면 true
					System.out.println("이미 등록된 메뉴입니다");
				}else {					
					map.put(name, price);
					System.out.println("정상 입력되었습니다.");
				}
				
			} else if(menu == 2) { //메뉴판 전체 보기
				
				//Set<Entry<String, Integer>> entrySet = map.entrySet();				
				//Iterator<Entry<String, Integer>> iter = entrySet.iterator(); 이거 써도 됨
				
				for(Entry<String, Integer> entry : map.entrySet()) { 			
					System.out.println("메뉴:" + entry.getKey() + ", 가격:" + entry.getValue());
				}
				
			} else if(menu == 3) {// 메뉴판 수정
				
				System.out.print("수정할 메뉴>");
				String name = scan.next(); //입력
				
				if(map.containsKey(name)) { //찾기
					System.out.println("수정할 가격>");
					int price = scan.nextInt();
					
					map.put(name, price);
					System.out.println("수정되었습니다");
				}else {
					System.out.println("메뉴가 존재하지 않습니다");
				}
				
			} else if(menu == 4) { //삭제
				System.out.print("삭제할메뉴>");
				String name = scan.next();
				
				Integer x = map.remove(name);
				
				if(x != null) {
					System.out.println("삭제되었습니다");
				}else {
					System.out.println("메뉴가 존재하지 않습니다");
				}
				
			} else if(menu == 5) {
				System.out.println("종료합니다");
				System.exit(0);
			}
		}
	}
}
