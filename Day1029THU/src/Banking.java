import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// 1. ���α׷��� ���۵Ǹ� �Ʒ��� ���� �޴��� ����Ѵ�.
		//	  1. �Ա�
		//	  2. ���
		//    3. �ܾ���ȸ
		//    4. ���α׷� ����
		// 2. 1�� �޴��� 2�� �޴��� ���������� ������� �ݾ��� ����� ����� ó���� �Ѵ�.
		// 3. 3�� �޴��� ���������� ���� �ܾ��� �����ش�.
		// 4. 4���� ������ ����ȴ�.
		
		Account account =  new Account();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.�Ա� ||  2.��� ||  3.�ܾ���ȸ || 4.����");
		
		boolean isFinish = false;
		
		while(!isFinish) { // isFinish == true
			System.out.print("�̿��� ���񽺸� �������ּ��� : ");
			int choice = scanner.nextInt();
			int money = 0;
			
			switch (choice) {
			case 1: // �Ա�
				System.out.print("�Ա��� �ݾ��� �Է����ּ��� : ");
				money = scanner.nextInt();
				account.deposit(money);
				break;
				
			case 2: // ���
				System.out.print("����� �ݾ��� �Է����ּ��� : ");
				money = scanner.nextInt();
				account.withdraw(money);				
				break;
				
			case 3: // �ܾ���ȸ
				account.showBalance();				
				break;
				
			case 4: // ���α׷� ����
				System.out.println("�̿��� �ּż� �����մϴ�.");
				isFinish = true;
				break;
				
			default: 
				System.out.println("1~4�� �ش��ϴ� ���ڸ� �Է����ּ���.");
				break;
			}
		}
	}

}
