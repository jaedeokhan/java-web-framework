package workshop;

import java.util.Scanner;

public class WorkShop7 {
	public static void main(String[] args) {
		
		// ¦��/Ȧ���˾ƺ���
		// ( %������,���׿����� ���) 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("number : ");
		int number = scan.nextInt();
		
		String isEven = (number % 2 == 0) ? "¦����!" :  "Ȧ����!";
		System.out.println(isEven);
	}
}
