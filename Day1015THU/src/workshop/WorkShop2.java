package workshop;

import java.util.Scanner;

public class WorkShop2 {
	public static void main(String[] args) {
	/*
	   �� ������ ���� Scanner �� �޾� ����Ͻÿ�.
	   ������ :name,department,position,pay)
	 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = scan.next();
		
		System.out.print("�μ� : ");
		String department = scan.next();
		
		System.out.print("���� : ");
		String position = scan.next();
		
		System.out.print("�޿� : ");
		int pay = scan.nextInt();
		
	}
}
