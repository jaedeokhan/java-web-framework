package workshop;

import java.util.Scanner;

public class WorkShop2 {
	public static void main(String[] args) {
	/*
	   각 변수의 값을 Scanner 로 받아 출력하시요.
	   변수명 :name,department,position,pay)
	 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.next();
		
		System.out.print("부서 : ");
		String department = scan.next();
		
		System.out.print("직위 : ");
		String position = scan.next();
		
		System.out.print("급여 : ");
		int pay = scan.nextInt();
		
	}
}
