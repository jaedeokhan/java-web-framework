import java.util.Scanner;

public class CompareOperation {
	public static void main(String[] args) {
		
		/*
		 * Scanner scan = new Scanner(System.in); System.out.print("ù ��° ���� : "); int
		 * number1 = scan.nextInt(); System.out.print("�� ��° ���� : "); int number2 =
		 * scan.nextInt();
		 * 
		 * // �� ������ (!=) boolean notEqual = number1 == number2; if(!notEqual) {
		 * System.out.println("number1 �� number2�� �ٸ���."); } else {
		 * System.out.println("number1 �� number2�� ����."); }
		 */
		
		
		// �� ������
		System.out.println("&& ������\n");
		System.out.println("true && true = " + (true && true));
		System.out.println("true && false = " + (true && false));
		System.out.println("false && true = " + (false && true));
		System.out.println("false && false = " + (false && false));
		System.out.println();
		
		System.out.println("|| ������");
		System.out.println("true ||& true = " + (true || true));
		System.out.println("true ||& false = " + (true || false));
		System.out.println("false ||& true = " + (false || true));
		System.out.println("false ||& false = " + (false|| false));
		System.out.println();
		
		System.out.println("! ������");
		System.out.println("!false = " + !false);
		System.out.println("!true = " + !true);
		
		// ª�� �� ������
		boolean alwaysAnd = false && true;
		boolean alwaysOr = true || true;
		boolean notAlwaysAnd = false & true;
		boolean notAlwaysOr = true | true;
		
		// ��Ʈ ������
		int x = 3;
		int y = 2;
		int z = x & y;
		System.out.println("x & y = " + z);
		
		
		z = x  | y;
		System.out.println("x | y = " + z);

		z = x ^ y;
		System.out.println("x ^ y = " + z);
		
		// ����Ʈ ������
		int test = 10 >> 1;
		System.out.println("10 >> 1 : " + test);
		
		int test2 = 10 << 1;
		System.out.println("10 << 1 : " + test2);
		
		// ���� ������
		// ��ġ : ���������ڰ� �����տ� ���� ���������� ���� �����ϰ� �ٸ� ������ �����Ѵ�.
		x  = 5;
		int y2 = ++x;
		System.out.println("x = " + x + ", y2 = " + y2);
		
		// ��ġ : ���������ڰ� ���� �ڿ� ���� �ٸ� ������ ���� �����ϰ� ���������ڸ� �����Ѵ�.
		int x3 = 5;
		int y3 = x++;
		System.out.println("x = " + x + ", y3 =" + y3);
		
	}
}
