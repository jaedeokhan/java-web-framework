import java.util.Scanner;

public class SwitchOperationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 : ");
		int oper1 = scanner.nextInt();
		
		System.out.print("��Ģ �����ȣ�� �Է� : ");
		String opt = scanner.next();
		
		System.out.print("�ǿ�����1 : ");
		int oper2 = scanner.nextInt();
		
		int result = 0;
		
		switch (opt) {
		case "+":
			result = oper1 + oper2;
			break;
		case "-":
			result = oper1 - oper2;
			break;
		case "/":
			result = oper1 / oper2;
			break;
		case "*":
			result = oper1 * oper2;			
			break;
		default:
			break;
		}
		
		System.out.println(result);
		
	
	}

}
