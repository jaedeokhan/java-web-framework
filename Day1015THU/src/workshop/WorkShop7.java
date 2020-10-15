package workshop;

import java.util.Scanner;

public class WorkShop7 {
	public static void main(String[] args) {
		
		// 짝수/홀수알아보기
		// ( %연산자,삼항연산자 사용) 
		Scanner scan = new Scanner(System.in);
		
		System.out.print("number : ");
		int number = scan.nextInt();
		
		String isEven = (number % 2 == 0) ? "짝수다!" :  "홀수다!";
		System.out.println(isEven);
	}
}
