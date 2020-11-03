
public class Sort {

	public static void main(String[] args) {
		 
		// 작은 값은 앞으로 큰 값은 뒤로
		int[] number = new int[10];
		
		for (int i = 0; i < number.length; i++) {
			number[i] = (int)(Math.random() * 10);
		}
		
		// 정렬 전 출력
		for (int i = 0; i < number.length; i++) {
			System.out.print(number[i] + " ");
		}
		
		// 차례로 정렬
		System.out.println();
		
		for (int i = 0; i < number.length; i++) {
			// 숫자 배치에 따라서 작업 순서가 다르기에, 정렬이 되었는지 체크한다.
			boolean changed = false;
			for (int j = 0; j < number.length - 1 - i; j++) {
				if(number[j] > number[j + 1]) {
					int temp = number[j];
					number[j] = number[j+1];
					number[j+1] = temp;
					changed = true;
				}		
			}
			if(!changed) { // true인 경우
				break;
			}
			
			for (int j = 0; j < number.length; j++) {
				System.out.print(number[j] + " ");
				
			}
			System.out.println();
		}	
	}
}
