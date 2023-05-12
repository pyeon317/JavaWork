package quiz02;

public class AccountMain { //퀴즈 1

	public static void main(String[] args) {
		
		Account a = new Account("나비", "1234", 50000);
	
		a.deposit(-5000); //입금
		
		a.withDraw(10000); //출금
		
		int balance = a.getBalance();//잔고확인
		System.out.println(balance);
		}
}
