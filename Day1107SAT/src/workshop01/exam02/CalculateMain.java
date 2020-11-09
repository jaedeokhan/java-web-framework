package workshop01.exam02;

import java.util.Scanner;

public class CalculateMain {
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		Calculate calculate = new Calculate();
		System.out.print("연산할 값 : ");
		int num = scanner.nextInt();

		int factorial = calculate.getFactorial(num);
		int power = calculate.getPower(num);
		
		System.out.println("factorial : " + factorial);
		System.out.println("power : " + power);
		
	}	
}
