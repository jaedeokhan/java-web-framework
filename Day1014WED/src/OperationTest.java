// Scanner :: 사용자가 입력한 데이터를 읽어 들이는 기능 제공하는 API
import java.util.Scanner;

public class OperationTest {
	public static void main(String[] args) {
		
		// 산술 연산자
		// 문자열 읽기
		Scanner scan = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int number1 = scan.nextInt();
		System.out.print("두 번째 숫자 : ");
		int number2 = scan.nextInt();
		
		int remainder = number1 % number2;
		System.out.println(number1);
		
	}
}
