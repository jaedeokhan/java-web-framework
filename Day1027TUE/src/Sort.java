
public class Sort {

	public static void main(String[] args) {
		 
		// ���� ���� ������ ū ���� �ڷ�
		int[] number = new int[10];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = (int)(Math.random() * 10);
		}
		
		// ���� �� ���
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		
		// ���ʷ� ����
		System.out.println();
		
		for (int i = 0; i < number.length; i++) {
			// ���� ��ġ�� ���� �۾� ������ �ٸ��⿡, ������ �Ǿ����� üũ�Ѵ�.
			boolean changed = false;
			for (int j = 0; j < number.length - 1 - i; j++) {
				if(number[j] > number[j + 1]) {
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
					changed = true;
				}		
			}
			if(!changed) { // true�� ���
				break;
			}
			
			for (int j = 0; j < number.length; j++) {
				System.out.print(number[j] + " ");
				
			}
			System.out.println();
		}	
	}
}
