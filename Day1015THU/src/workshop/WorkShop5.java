package workshop;

import java.util.Scanner;

public class WorkShop5 {
	public static void main(String[] args) {
		
		// ū ���� ���Ͻÿ�
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù ��° �� : ");
		int firstValue = scan.nextInt();		

		System.out.print("ù ��° �� : ");
		int secondValue = scan.nextInt();		
		
		String bigValue = (firstValue > secondValue) ?  firstValue  + "�� ũ��": (firstValue == secondValue) ?  "����" : firstValue + "�� �۴�";
		
		System.out.println("ū �� : " + bigValue);
		
	}
}
