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
		
		int bigValue = (firstValue > secondValue) ?  firstValue : secondValue;
		
		System.out.println("ū �� : " + bigValue);
		
	}
}
