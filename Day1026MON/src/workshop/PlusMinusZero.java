package workshop;

import java.util.Scanner;

public class PlusMinusZero {

	public static void main(String[] args) {
		// num > 0 ==> ��� 
		// num < 0 ==> ����
		// num == 0 ==> ����
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = scanner.nextInt();
		
		int isTrue = (num > 0) ?  1 : (num < 0 ) ? 0 : -1;
		
		if(isTrue == 1) {
			System.out.println(num + "�� ���");
		} else if(isTrue == 0) {
			System.out.println(num + "�� ����");
		} else {
			System.out.println(num + "�� 0�̴�.");			
		}
		
	}

}
