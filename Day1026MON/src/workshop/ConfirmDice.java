package workshop;

public class ConfirmDice {

	public static void main(String[] args) {
		
		// �� ���� �ֻ����� ������ �� �� ���� ���� 6�� �Ǵ� ��� ��찡 �� ������ ���
		int count = 0;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if(i + j == 6) {
					System.out.println(i + " + " + j + " = " + (i  + j));
					count++;
				}
			}
		}
		System.out.println("�ֻ��� ���� 6�� �Ǵ� ����� �� : " + count);
		

	}

}

