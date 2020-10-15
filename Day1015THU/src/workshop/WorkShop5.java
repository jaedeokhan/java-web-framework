package workshop;

import java.util.Scanner;

public class WorkShop5 {
	public static void main(String[] args) {
		
		// 큰 수를 구하시오
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 수 : ");
		int firstValue = scan.nextInt();		

		System.out.print("첫 번째 수 : ");
		int secondValue = scan.nextInt();		
		
		int bigValue = (firstValue > secondValue) ?  firstValue : secondValue;
		
		System.out.println("큰 수 : " + bigValue);
		
	}
}
