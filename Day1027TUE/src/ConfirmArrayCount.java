
public class ConfirmArrayCount {

	public static void main(String[] args) {
		
		// 배열에 저장된 0 ~ 9 사이의 값을 랜덤하게 할당하고
		// 배열에 저장된 해당 숫자들의 개수를 구하는 예제
		int[] number = new int[10];
		
		// 숫자를 저장할 배열
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
