package workshop02;

public class EqualsArray {

	public static void main(String[] args) {
		// �迭 �׸��� �ϳ��� �����ͼ� ����ϴ� ����
		// array �׸��߿� index�� 2�� three�� �Ǹ� while���� ����������.
		// stop �÷��� ������ �̿��ؼ� �ڵ带 �ۼ�
		
		String[] array = {"one", "two", "three", "four"};
		boolean stop = false;
		int index = 0;
		while(!stop) {
			String item = array[index];
			if(item.equals("three")) {
				System.out.println("���� ���� : " + array[index] +  "�Դϴ�.");
				stop = true;
			} else {
				System.out.println(item);
				index++;
			}
		}
	}

}
