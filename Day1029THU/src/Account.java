import java.util.Scanner;

public class Account {
	
	// �ܾ�����
	int balance; 
	
	// �޼ҵ�
	// deposit : �Ա��� �ݾ��� �޾Ƽ� �ش� �ݾ��� ���� �ݾ׿� �߰�
	// withdraw : ���
	// showBalance : �ܾ���ȸ => ���� �ܾ��� ( ) �� �Դϴ�.
	void deposit(int money) {
		balance += money;
	}
	
	void withdraw(int money) {
		balance -= money;
	}
	
	void showBalance() {
		System.out.println("���� �ܾ��� " + balance + "�Դϴ�.");
	}
}
