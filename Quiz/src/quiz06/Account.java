package quiz06;
					
public class Account { //퀴즈 1

	//한 사람의 은행 계좌
	/*
	 * accountNumber변수 - 식별아이디
	 * password - 비밀번호
	 * balance 변수 - 잔고
	 * 
	 * 생성자
	 * 3가지를 모두 받아서 초기화하는 생성자
	 * 
	 * 메서드
	 * deposit : void - 잔고의 매개변수를 누적하는 기능
	 * withDraw : void - 잔고에서 매개변수를 차감하는 기능
	 * getBalance : int - 잔고를 리턴하는 기능
	 * 
	 * 메인클래스에서는 각각의 기능을 확인
	 */
	
	String accountNumber; //식별아이디
	String password; //비밀번호
	int balance;  // 이걸 안했었네 딴걸 만들어서 할 필요가 없었음
	
	Account(){}
	
	Account(String num, String pw, int money){
		accountNumber = num;
		password = pw;
		balance = money;		
	}
	
	
	
	
	void deposit(int money) {
		//매개변수가 양수일때만 가능하도록 변경
		if(money >= 0) {
			balance += money;       //처음 변수(돈)들어가는 곳에 누적해야되는구나
		}else {
			System.out.println("입금을 할 수 없습니다.");
		}	
	}
	
	void withDraw(int money) {
		//잔고(매개변수)가 잔고보다 작을 때만 출금이 가능하도록 변경
		if(money > balance) {
			System.out.println("잔고가 부족합니다.(잔고:" + balance + ")");
		}else {
			balance -= money;
			System.out.println("잔고: " + balance);
		}	
	}
	
	int getBalance() {
		return balance;
	}	
}

// 기본생성자 없이 조건만 맞춘 클래스를 만든 상태
//String accountNumber; //식별아이디
//String password; //비밀번호
//int balance;  // 이걸 안했었네 딴걸 만들어서 할 필요가 없었음
//
//
//Account(String num, String pw, int money){
//	accountNumber = num;
//	password = pw;
//	balance = money;		
//}
//
//
//
//
//void deposit(int money) {
//	
//	balance += money;       //처음 변수(돈)들어가는 곳에 누적해야되는구나
//}
//
//void withDraw(int money) {
//	
//	balance -= money;
//}
//
//int getBalance(int money) {
//	return balance;
//}	
//}