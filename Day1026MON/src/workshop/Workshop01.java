package workshop;

import java.util.Scanner;

public class Workshop01 {

	public static void main(String[] args) {
		// 1�� : �Ʒ��� �ڵ�� ����� ��µ� �ʿ��� �ٱ���(����)�� ���� ���ϴ� �ڵ��̴�.
		// ����, ����� ���� 123���̰� �ϳ��� �ٱ��Ͽ��� 10���� ����� ���� �� �ִٸ�,
		// 13���� �ٱ��ϰ� �ʿ��� ���̴�. 
		
		Scanner scanner = new Scanner(System.in);
		
		int numOfApples = scanner.nextInt();
		int sizeOfBucket = 10;
		// 10 �� ������ ������ �������� + 0
		// 10�� �������� �ֵ��� + 1
		int numOfBucket = (numOfApples % sizeOfBucket != 0) ? 
				(numOfApples / sizeOfBucket) + 1  : (numOfApples / sizeOfBucket) ;
		
		System.out.println("�ʿ��� �ٱ����� �� : " + numOfBucket);
		
		
		
	}

}
