package quiz19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListQuiz02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		List<User> list = new ArrayList<>(); //배열대체
		
		while(true) {
			System.out.println("[1.등록 | 2.회원정보확인 | 3.회원정보검색 | 4.회원정보삭제 | 5.프로그램종료]");
			System.out.print("메뉴(번호)>");
		
			int menu = scan.nextInt();
	
			switch (menu) {
			case 1:
				//이름, 나이를 입력받아서 user객체에 저장, 리스트에 순서대로 추가
				System.out.print("이름>");
				String name = scan.next();
				
				System.out.print("나이>");
				int age = scan.nextInt();
				
				User user = new User(name, age);
				list.add(user);
				System.out.println("정상 입력되었습니다");
				break;
			case 2:
				//리스트에 담긴 모든 회원 이름, 나이를 출력
				for(User i : list) {
					
					System.out.println(i.getName() + "-" + i.getAge());
				}
				break;
			case 3:
				//찾을 이름을 새롭게 입력받아서, 이름이 있다면 이름과 나이를 출력.
				//조건 - 찾는 이름이 없다면 "~~~는 목록에 없습니다" 출력합니다.
				System.out.print("이름>");
				String f = scan.next();
				int count = 0;
				
				boolean bool = true;
				for(int i = 0; i < list.size(); i++) {
					User name1 = list.get(i);
					String n = name1.getName();
					
					if(n.equals(f)) {
						System.out.println(name1.getName() + "-" +name1.getAge());
						bool = false; //실행했음
						break;
					}
				}
				if(bool) { //bool이 for문 다 돌았을 때 true면 출력인 듯?
					System.out.println(f + "는 목록에 없습니다");
				}
					
				break;
			case 4:
				//삭제할 이름을 입력박아서, 이름과 동일한 User객체를 첫번째 1개만 삭제
				System.out.print("이름>");
				String f1 = scan.next();
				
				for(int i = 0; i < list.size(); i++) {
					
					User name1 = list.get(i);
					String n = name1.getName();
					
					if(n.equals(f1)) {
						list.remove(i);
						break;
					}
					//list.remove(f); 이게 더 짧고 좋은거 같은데
				}
				break;
			case 5:
				System.out.println("프로그램 종료");				
				System.exit(0);
				
				break;

			default:
				break;
			}			
		}
	}	
}
