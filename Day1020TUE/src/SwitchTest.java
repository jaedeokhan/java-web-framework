import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("====ȸ������====");
		System.out.println("====1. ȸ�����====");
		System.out.println("====2. ȸ����Ϻ���====");
		System.out.println("====3, ȸ����������====");
		System.out.println("====4. ȸ����������====");
		
		int menuNumber = 1;
		
		while(menuNumber != 0) {
			System.out.print("�޴� �Է� : ");
			menuNumber = scanner.nextInt();
			switch(menuNumber) {
				case 1:
					System.out.println("ȸ�����ó��");
					break;
				case 2:
					System.out.println("ȸ����Ϻ���");
					break;
				case 3:
					System.out.println("ȸ����������");
					break;
				case 4:
					System.out.println("ȸ����������");
					break;
			}
		}
		
	}

}
