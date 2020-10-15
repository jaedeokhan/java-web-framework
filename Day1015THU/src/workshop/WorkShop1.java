package workshop;

import java.util.Scanner;

public class WorkShop1 {
	public static void main(String[] args) {
		/*
		   Q1. 기본급과 시간 수당을 입력받아 실수령액을 구하시요.
		   기본급(pay) : 1500000
		   시간수당(o_time) : 55000
		   조건>
		   세금(tax) : 기본급의 10%
			
		   일때  실수령액(t_pay)를 구하시오.
		   (실수령액 = 기본급 + 시간수당 - 세금)
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.print("기본급을 입력하세요 : ");
		int pay = scan.nextInt();
		
		System.out.print("시간수당을 입력하세요 : ");
		int o_time = scan.nextInt();
		int tax = pay / 10;
		
		int realIncome = pay + o_time - tax;
		
		System.out.println("실수령액  : " + realIncome);
		
		
		
	}

}
