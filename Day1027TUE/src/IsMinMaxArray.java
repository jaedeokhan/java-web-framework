
public class IsMinMaxArray {

	public static void main(String[] args) {
		// �迭�� �ִ� ���� �߿� �ִ񰪰� �ּڰ��� ���ؼ� ����ض�.
		// �ִ�, �ּڰ�
		
		int[] score = {100, 99, 90, 98, 89, 2, 1, 75, 34, 25, 15, 3};
		int maxNumber=  0;
		int minNumber = 12341234;
		
		for (int i = 0; i < score.length; i++) {
			if(score[i] > maxNumber) {
				maxNumber = score[i];
			}
			else if(score[i] < minNumber) {
				minNumber = score[i];
			}
		}
		
		System.out.println("�ִ� : " + maxNumber + ", �ּڰ� : " + minNumber);

	}

}
