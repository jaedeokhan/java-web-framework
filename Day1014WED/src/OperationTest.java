// Scanner :: ����ڰ� �Է��� �����͸� �о� ���̴� ��� �����ϴ� API
import java.util.Scanner;

public class OperationTest {
	public static void main(String[] args) {
		
		// ��� ������
		// ���ڿ� �б�
		Scanner scan = new Scanner(System.in);
		System.out.print("ù ��° ���� : ");
		int number1 = scan.nextInt();
		System.out.print("�� ��° ���� : ");
		int number2 = scan.nextInt();
		
		int remainder = number1 % number2;
		System.out.println(number1);
		
	}
}
