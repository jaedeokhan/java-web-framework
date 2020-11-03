package workshop;

import java.util.Scanner;

public class PlusMinusZero {

	public static void main(String[] args) {
		// num > 0 ==> 양수 
		// num < 0 ==> 음수
		// num == 0 ==> 같다
		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = scanner.nextInt();
		
		int isTrue = (num > 0) ?  1 : (num < 0 ) ? 0 : -1;
		
		if(isTrue == 1) {
			System.out.println(num + "은 양수");
		} else if(isTrue == 0) {
			System.out.println(num + "은 음수");
		} else {
			System.out.println(num + "은 0이다.");			
		}
		
	}

}
