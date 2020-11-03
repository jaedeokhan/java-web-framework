import java.util.Scanner;

public class Account {
	
	// 잔액저장
	int balance; 
	
	// 메소드
	// deposit : 입금할 금액을 받아서 해당 금액을 현재 금액에 추가
	// withdraw : 출금
	// showBalance : 잔액조회 => 현재 잔액은 ( ) 원 입니다.
	void deposit(int money) {
		balance += money;
	}
	
	void withdraw(int money) {
		balance -= money;
	}
	
	void showBalance() {
		System.out.println("현재 잔액은 " + balance + "입니다.");
	}
}
