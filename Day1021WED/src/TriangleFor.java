
public class TriangleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("===== 중첩 for문을 두 번 사용 =====");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}

		// i = 6 -> 5 ==> 11 - i 
		// i = 7 -> 4 ==> 11 -1 
		// i = 8 -> 3
		// i = 9 -> 2
		// i = 10 -> 1
		// 
		System.out.println("===== 중첩 for문에서 if-else 분기처리 =====");
		for (int i = 1; i <= 10; i++) {
			if(i <= 5) {
				for (int j = 1; j <= i; j++) {
					System.out.print("#");
				}
				System.out.println();
				}
			else {
				for (int j = 1; j <= 11 - i; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
	   }
		
		// 변수로 중복을 해결
		System.out.println("===== 중첩 for문에서 변수로 중복을 해결 ===== ");
		for (int i = 1; i <= 10; i++) {
			// i 가 5보다 같거나 작냐? 크냐?
			int sharpCount = (i <= 5) ? i : 11 - i;
			for (int j = 1; j <= sharpCount; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
		
		
	}
}
