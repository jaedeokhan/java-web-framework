import java.util.Scanner;

public class NumberInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// ���߾���� ��ȣ
		int rightNumber = (int)(Math.random() * 100) + 1; // 1~100
		// Math.radnom() : 0.0���� ũ�ų� ���� 1.0���� ���� double Ÿ���� ���� �߻�
		// (Math.random) == 0.0 ~ 0.999999999999999999
		// (int)(Math.radnom * 100) == 0 ~ 99 
		// (int)(Math.radnom * 100) + 1 == 1 ~ 100
		boolean stop = false;
		do {
			System.out.print("�����Է� : ");
			int inputNumber = scanner.nextInt();
			if(inputNumber > rightNumber) {
				System.out.println("�� ���� ���� �Է��ϼ���.");
			}
			else if(inputNumber < rightNumber) {
				System.out.println("�� ū�� ���� �Է��ϼ���.");
			} 
			else {
				System.out.println("�����Դϴ�!");
				stop = true;
			}
		} while(!stop);
		
	}

}
