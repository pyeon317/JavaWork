package day03;

import java.util.Scanner;

public class StudentManage {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//학생정보를 등록할 배열을 while문 바깥에 선언.
		String[] nameList = new String[100];
		int[] ageList = new int[100];
		String[] infoList = new String[100];
		
		//고객수
		int count = 0;
		//조회할 위치
		int index = -1;
		
		
		x : while(true) {
			
			System.out.println("[정보]고객수:" + count + ", 조회위치:" + index);
			System.out.println("[메뉴]1.추가, 2.이전정보, 3.다음정보, 4.현재정보, 5.정보수정, 6.정보삭제, 7.종료");
			System.out.println("===============================================================");
			System.out.print("메뉴입력>");
			String menu = scan.next();
			
			
			
			switch (menu) {
			
			case "1":
				
				/*
				 * 이름, 성별, 간단한 정보를 입력받아서 각각의 배열에 순서대로 저장될 수 있게 처리합니다.
				 * count를 증가합니다.
				 * */
				//int N = scan.nextInt(); 이걸쓰면 원하는 칸. count를 쓰면 순서대로
				
				System.out.println("=================사용자정보입력=================");
				
				System.out.print("이름>");
				String name = scan.next();
				
				System.out.print("나이>");
				int age = scan.nextInt();
				
				System.out.print("정보>");
				String info = scan.next();
				
				nameList[count] = name; 
				ageList[count] = age;
				infoList[count] = info;
				
				count++;
				
				
				break;
				
			case "2":
				
				/*
				 * 이전정보출력
				 * 정보출력은 index위치로 출력합니다.
				 * 이전정보출력을 누르면 index를 -1 시키고 해당위치에 정보를 출력
				 * 
				 * 조건
				 * index가 0보다 작다면, 출력하지 않도록 처리.
				 * */
								
				if(index <= 0) {
					System.out.println("<이전 정보가 없습니다.>");
					
				} else {
					index--;
					System.out.println("=================이전 정보=================");
					System.out.println("이름:" + nameList[index]);
					System.out.println("나이:" + ageList[index]);
					System.out.println("정보:" + infoList[index]);
				}
				
				
				break;
				
			case "3":
				
				/*
				 * 다음정보출력
				 * 정보출력은 index위치로 출력합니다.
				 * 이전정보출력을 누르면 index를 +1 시키고 해당위치에 정보를 출력
				 * 
				 * 조건
				 * count-1보다 index가 같거나 크다면, 출력하지 않도록 처리
				 * */
				
				
				if(index >= count - 1) {
					System.out.println("<다음 정보가 없습니다.>");
					
				} else {
					index++;
					System.out.println("=================다음 정보=================");
					System.out.println("이름:" + nameList[index]);
					System.out.println("나이:" + ageList[index]);
					System.out.println("정보:" + infoList[index]);
				}
				
				break;
				
			case "4":
				
				/*
				 * 현재정보출력
				 * index가 가르키고 있는 위치정보를 출력
				 * 
				 * 조건
				 * 출력할 수 있는 조건을 생각해서 처리. 
				 * */
				
				if(index >= 0 && index <= count - 1) {
					System.out.println("=================현재 정보=================");
					System.out.println("이름:" + nameList[index]);
					System.out.println("나이:" + ageList[index]);
					System.out.println("정보:" + infoList[index]);
				} else {
					System.out.println("<현재 위치에 회원정보가 없습니다>");
				}
				break;
				
			case "5":
				
				/*
				 * 정보수정
				 * 새로운 이름, 나이, 정보를 입력받아서
				 * 현재위치를 수정해주면 됩니다.
				 * 
				 * 조건
				 * 출력할 수 있는 조건을 생각해서 처리. - 4번과 동일
				 * */
				
				if(index >= 0 && index <= count - 1) {
					
					System.out.println("=================현재 정보 수정=================");
					System.out.println(index + "번째 위치를 수정합니다.");
					
					System.out.println("현재정보:" + nameList[index] + ">");
					nameList[index] = scan.next();
					
					System.out.println(ageList[index] + ">");
					ageList[index] = scan.nextInt();
					
					System.out.println(infoList[index] + ">");
					infoList[index] = scan.next();
					
				} else {
					System.out.println("<현재 위치에 수정할 정보가 없습니다>");
				}
				
				break;
				
			case "6":
				
				/*
				 * 현재정보 삭제 
				 * 현재삭제하려는 index로부터 ~~뒤에 있는 배열요소롤
				 * 당겨와서 덮어 씌웁니다.
				 * 
				 * 사람 수를 감소
				 * 
				 * 조건
				 * 출력할 수 있는 조건을 생각해서 처리. - 4번과 동일
				 * */
				
				if(index >= 0 && index <= count - 1) {//삭제가능 조건
					
					System.out.println("=================정보 삭제=================");
					System.out.println(nameList[index] + "님 정보가 삭제되었습니다.");
					
					for(int i = index; i <= count - 1; i++) {
						nameList[i] = nameList[i + 1];
						ageList[i] = ageList[i + 1];
						infoList[i] = infoList[i + 1];
					}
				} else {
					System.out.println("<현재 위치에 삭제할 정보가 없습니다>");
				}
				
				
				count--; //사람수를 하나 줄여서 마치 삭제한 것처럼 처리
				
				break;
				
			case "7":
				
				//while문의 탈출
				
				System.out.println("안녕히계세요 여러분!");
				
				break x;
				
			default:
				System.out.println("잘못 입력했습니다");
				break;
			}			
		}
		scan.close();
	}
}

//System.out.println("이름:" + nameList[index] + " 나이:" + ageList[index] + " 정보:" +infoList[index]);

