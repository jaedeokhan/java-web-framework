package workshop;

import java.util.Scanner;

public class CalculateDigit {

	public static void main(String[] args) {
		
		// 자릿수 구하기
		Scanner scanner = new Scanner(System.in);
		System.out.print("자릿수를 구할 수를 입력하세요 : ");
		int number = scanner.nextInt();
		
		int count = 1;
		int digitNumber = number;
		while(true) {
			digitNumber /= 10;
			if(digitNumber == 0)break;
			count++;
		}
		
		System.out.println(digitNumber + "의 자릿수는 => " + count);
		
		int calculatorNumber = 1;
		for (int i = 1; i < count; i++) {
			calculatorNumber *= 10;
		}
		
		System.out.println(number / calculatorNumber * calculatorNumber);
	}

}
