
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�� : ");
		int tables = scanner.nextInt();
		System.out.println("===" + tables + "��===");

		for (int i = 1; i <= 9; i++) {
			System.out.println(tables + " * " + i + " = "  + (tables * i));
		}
	
	}

}
