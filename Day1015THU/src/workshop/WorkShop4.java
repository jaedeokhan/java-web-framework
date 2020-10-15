package workshop;

import java.util.Scanner;

public class WorkShop4 {
	public static void main(String[] args) {
		// **** 삼각형의 넓이 구하기  ****
		Scanner scan = new Scanner(System.in);
		
		System.out.print("밑변을 입력하세요 : ");
		int base = scan.nextInt();
		
		System.out.print("높이를 입력하세요 : ");
		int height = scan.nextInt();
		
		double area = (base * height) / (double)2;
		System.out.println("삼각형의 넓이 : " + area);
		
	}
}
