
public class ConfirmArrayCount {

	public static void main(String[] args) {
		
		// �迭�� ����� 0 ~ 9 ������ ���� �����ϰ� �Ҵ��ϰ�
		// �迭�� ����� �ش� ���ڵ��� ������ ���ϴ� ����
		int[] number = new int[10];
		
		// ���ڸ� ������ �迭
		int[] counter = new int[10];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = (int)(Math.random() * 10);	
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		
		System.out.println();
		for (int i = 0; i < counter.length; i++) {
			counter[number[i]]++;
		}
		
		for (int i = 0; i < counter.length; i++) {
			System.out.print(counter[i] + " ");
		}
		
		

		

	}

}
