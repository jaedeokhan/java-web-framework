package workshop;

import java.util.Scanner;

public class WorkShop1 {
	public static void main(String[] args) {
		/*
		   Q1. �⺻�ް� �ð� ������ �Է¹޾� �Ǽ��ɾ��� ���Ͻÿ�.
		   �⺻��(pay) : 1500000
		   �ð�����(o_time) : 55000
		   ����>
		   ����(tax) : �⺻���� 10%
			
		   �϶�  �Ǽ��ɾ�(t_pay)�� ���Ͻÿ�.
		   (�Ǽ��ɾ� = �⺻�� + �ð����� - ����)
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�⺻���� �Է��ϼ��� : ");
		int pay = scan.nextInt();
		
		System.out.print("�ð������� �Է��ϼ��� : ");
		int o_time = scan.nextInt();
		int tax = pay / 10;
		
		int realIncome = pay + o_time - tax;
		
		System.out.println("�Ǽ��ɾ�  : " + realIncome);
		
		
		
	}

}
