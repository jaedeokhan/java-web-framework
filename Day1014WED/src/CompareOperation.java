import java.util.Scanner;

public class CompareOperation {
	public static void main(String[] args) {
		
		/*
		 * Scanner scan = new Scanner(System.in); System.out.print("첫 번째 숫자 : "); int
		 * number1 = scan.nextInt(); System.out.print("두 번째 숫자 : "); int number2 =
		 * scan.nextInt();
		 * 
		 * // 비교 연산자 (!=) boolean notEqual = number1 == number2; if(!notEqual) {
		 * System.out.println("number1 과 number2는 다르다."); } else {
		 * System.out.println("number1 과 number2는 같다."); }
		 */
		
		
		// 논리 연산자
		System.out.println("&& 연산자\n");
		System.out.println("true && true = " + (true && true));
		System.out.println("true && false = " + (true && false));
		System.out.println("false && true = " + (false && true));
		System.out.println("false && false = " + (false && false));
		System.out.println();
		
		System.out.println("|| 연산자");
		System.out.println("true ||& true = " + (true || true));
		System.out.println("true ||& false = " + (true || false));
		System.out.println("false ||& true = " + (false || true));
		System.out.println("false ||& false = " + (false|| false));
		System.out.println();
		
		System.out.println("! 연산자");
		System.out.println("!false = " + !false);
		System.out.println("!true = " + !true);
		
		// 짧은 논리 연산자
		boolean alwaysAnd = false && true;
		boolean alwaysOr = true || true;
		boolean notAlwaysAnd = false & true;
		boolean notAlwaysOr = true | true;
		
		// 비트 연산자
		int x = 3;
		int y = 2;
		int z = x & y;
		System.out.println("x & y = " + z);
		
		
		z = x  | y;
		System.out.println("x | y = " + z);

		z = x ^ y;
		System.out.println("x ^ y = " + z);
		
		// 시프트 연산자
		int test = 10 >> 1;
		System.out.println("10 >> 1 : " + test);
		
		int test2 = 10 << 1;
		System.out.println("10 << 1 : " + test2);
		
		// 증감 연산자
		// 전치 : 증감연산자가 변수앞에 오면 증감연산자 먼저 실행하고 다른 연산을 실행한다.
		x  = 5;
		int y2 = ++x;
		System.out.println("x = " + x + ", y2 = " + y2);
		
		// 후치 : 증감연산자가 변수 뒤에 오면 다른 연산을 먼저 실행하고 증감연산자를 실행한다.
		int x3 = 5;
		int y3 = x++;
		System.out.println("x = " + x + ", y3 =" + y3);
		
	}
}
