package workshop01;

import java.util.Scanner;

public class IsProgrammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. while�� �ȿ��� 1. ���� | 2.���� �����ϱ�
		// 2. int choice�� scanner �Է� �޾Ƽ� 1,2 ����
		// 3. string talk �� scanner�� �Է� �ޱ�
		// 4. 1�� ���� ���񽺷� ������ �Է� ���� talk ����ϱ�
		// 	 4.2 2.����� boolean isFinshed = true�� �ֱ�
		
		Scanner scanner = new Scanner(System.in);
		
		boolean isFinshed = false;
		
		while(!isFinshed) {
			
			System.out.println("1. ���� || 2. ����");
			System.out.print("����> ");
			int choice = scanner.nextInt();
			String talk = null;
			if(choice == 1) {
				System.out.print("�Է�> ");
				talk = scanner.next();
				System.out.println("����> " + talk);
			} else if(choice == 2) {
				System.out.println("�̿����ּż� �����մϴ�.");
				isFinshed = true;
			} else {
				System.out.println("1,2���� �������ּ���.");
			}
		}
		

	}

}
