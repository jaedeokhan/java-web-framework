package workshop;

import java.util.Scanner;

public class CalculateDigit {

	public static void main(String[] args) {
		
		// �ڸ��� ���ϱ�
		Scanner scanner = new Scanner(System.in);
		System.out.print("�ڸ����� ���� ���� �Է��ϼ��� : ");
		int number = scanner.nextInt();
		
		int count = 1;
		int digitNumber = number;
		while(true) {
			digitNumber /= 10;
			if(digitNumber == 0)break;
			count++;
		}
		
		System.out.println(digitNumber + "�� �ڸ����� => " + count);
		
		int calculatorNumber = 1;
		for (int i = 1; i < count; i++) {
			calculatorNumber *= 10;
		}
		
		System.out.println(number / calculatorNumber * calculatorNumber);
	}

}
