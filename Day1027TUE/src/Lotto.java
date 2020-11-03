
public class Lotto {

	public static void main(String[] args) {
		// 45���� ���ڸ� �迭�� ����
		int[] ball = new int[45];
		
		// �� ball�� 1~45������ ���ڸ� �ֱ�
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		
		// �迭�� ����� ���ڰ����� ���´�.
		int temp = 0; // swap�� �� ���� �ӽ������� ������ ����
		int index = -1; // 0�� �ε��� ���� ��ȯ�� ���� ������ �ִ� �ε��� ��ȣ
		
		for (int i = 0; i < 100; i++) {
			index = (int)(Math.random() * 45) + 1;
			temp = ball[0];
			ball[0] = ball[index];
			ball[index] = temp;
		}
		
		System.out.print("�ζ� ��ȣ : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		
		
		
		
	}

}
