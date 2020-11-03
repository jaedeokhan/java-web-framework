package workshop02;

import java.util.Scanner;

public class ConvertDecimalToBinary {
	public static void main(String[] args) {
		// 십진수 값을 이진수로 출력되는 프로그램을 만들어라
		// 입력값 : 3
		// 0000 0000 0000 0011
		// inputNumber /= 2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("입력값 : ");
		int array[] = new int[16];
		int inputNumber = scanner.nextInt();
		int index = 0;
		
		while(inputNumber != 0) {
			array[index] = inputNumber % 2;
			inputNumber = inputNumber / 2; 
			index++;
		}
		
		for (int i = array.length - 1; i >= 0; i--) {
			if(i != array.length - 1 && i % 4 == 3 ) {
				System.out.print(" ");
			}
			System.out.print(array[i]);
		}
		
		
	}
}
