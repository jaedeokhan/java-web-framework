package workshop;

import java.util.Scanner;

public class WorkShop3 {
	public static void main(String[] args) {
		
		// �Է¹޾� ����Ͻÿ�
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = scan.next();
		
		System.out.print("���� ������ �Է��ϼ��� : ");
		int kor = scan.nextInt();

		System.out.print("���� ������ �Է��ϼ��� : ");
		int eng = scan.nextInt();
	
		System.out.print("���� ������ �Է��ϼ��� : ");
		int mat = scan.nextInt();
		
		int total = kor + eng + mat;
		double avg = (kor + eng + mat) / (double)3;
		
		System.out.println("�̸� : " + name);
		System.out.println("total ���� : " + total);
		System.out.printf("avg ���� : %.1f", avg); 
		
		
	}
}
