package workshop;

import java.util.Scanner;

public class WorkShop4 {
	public static void main(String[] args) {
		// **** �ﰢ���� ���� ���ϱ�  ****
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�غ��� �Է��ϼ��� : ");
		int base = scan.nextInt();
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int height = scan.nextInt();
		
		double area = (base * height) / (double)2;
		System.out.println("�ﰢ���� ���� : " + area);
		
	}
}
