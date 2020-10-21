import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� : ");
		int year = scanner.nextInt();
		
		System.out.print("�� : ");
		int month = scanner.nextInt();
		
		// ���� 
		// 30, 31��, 2�� ����
		int totalDay = 0;
		boolean isRightMonth = true;
		
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			totalDay = 31;
			break;
		case 4, 6, 9, 11:
			totalDay = 30;
			break;
		case 2:
			// 2���� ������ �Ǿ��� �� ���ϴ°� ȿ�����̴�.
			// ������ ���� ���⼭�� ����ϹǷ� if�� ���꿡�� ó���� ���ش�.
			if ((year % 4 == 0 && year % 400 != 0 || year % 100 == 0 )) {
				totalDay = 29;
			} else {
				totalDay = 28;
			}
		default:
			isRightMonth = false;
			break;
		}
		
		// ���
		if(isRightMonth) {
			System.out.println(year + "�� " + month + "���� �� " + totalDay + "�ϱ��� �����մϴ�.");
		} else {
			System.out.println("�� ���� 1~12�� �Է����ּ���.");
		}
		
		
		
		
	}

}
