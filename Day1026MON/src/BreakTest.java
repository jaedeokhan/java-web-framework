import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1���� 4���� ����ϰ� ����");
		for (int i = 1; i <= 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println("i = " + i);
		}
		
		// �����ϴ� �������� �Է��ϼ���
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("�����ϴ� �������� �Է��ϼ���");
			System.out.print("������ : ");
			String name = scanner.next();
			if(name.equals("������")) {
				System.out.println("�� ���� ������");
				break;
			}
			else {
				System.out.println("�ٽ� �����غ���~~");
			}
		}
	}

}
