
public class NumberNestedFor {

	public static void main(String[] args) {
		
		// Nested for문 두 개 사용
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i) - 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i = 6; i < 10; i++) {
			for (int j = 1; j <= i - 5; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 19 - (2 * i); j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println("===========================================");
		
		// if-else 분기로 Nested for문 처리
		for (int i = 1; i <= 10; i++) {
			if(i <= 5) {
				for (int j = 1; j <= 5 - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= (2 * i) - 1; j++) {
					System.out.print(j);
				}
				System.out.println();
			}
			else {
				for (int j = 1; j <= i - 5; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 19 - (2 * i); j++) {
					System.out.print(j);
				}
				System.out.println();
			}
		}	
		System.out.println("===========================================");

		// 삼항 연산자로 Nested for문 처리
		for (int i = 1; i <= 10; i++) {
			int isSpace = (i <= 5) ? 5 - i : i - 5;
			int isCount = (i <= 5) ? (2 * i) - 1: 19 - (2 * i);
			for (int j = 1; j <= isSpace; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= isCount; j++) {				
				System.out.print(j);
			}
			System.out.println();

		}	
		System.out.println("===========================================");
		
	}	

}
