package workshop;

import java.util.Scanner;

public class WorkShop6 {
	public static void main(String[] args) {

		//  ���� �Է¹޾� 0���� �۰ų� 100���� ũ�� "�Է¿���!!"  ���
		//  (  || ������ , ���׿����� �̿�)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� : ");
		int score = scan.nextInt();
		
		String isError = (score < 0 || score > 100) ? "�Է¿���" : "����ó����";
		System.out.println(isError);
	}
}
