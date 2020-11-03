import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// �迭�� ����, ����
		
		// ����
		int aArray[] = {1,2,3};
		int bArray[] = Arrays.copyOf(aArray, 2 * aArray.length);
		
		for (int i = 0; i < bArray.length; i++) {
			System.out.println("bArray[" + i + "] = " + bArray[i]);
		}
		
		// ����
		
		System.out.println("=========================");
		System.out.println("========Sort Method======");
		int[] a = {4,1,3,2,6,5};
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		
		int[] number = {4,1,3,2,6,5};
		
		System.out.println("=========================");
		System.out.println("=======Sort ����======");
		for (int i = 0; i < number.length; i++) {
			boolean changed = false;
			for (int j = 0; j < number.length - 1 - i; j++) {
				if(number[j] > number[j + 1]) {
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
					changed = true;
				}
			}
			
			if(!changed) {
				break;
			}
			
			for (int j = 0; j < number.length; j++) {
				System.out.print(number[j] + " ");
			}
			System.out.println();
		}
		
	}

}
