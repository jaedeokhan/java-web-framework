package workshop01;

public class StarTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// i, ÇÑ Ä­ ¶ç¿ì±â, º°Âï±â
		// 0, 4, 1, 0 * 2 + 1 = 1     
		// 1, 3, 3, 1 * 2 + 1 = 3
		// 2, 2, 5, 2 * 2 + 1 = 5
		// 3, 1, 7, 3 * 2 + 1 = 7
		// 4, 0, 9, 4 * 2 + 1 = 9
		
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j < 5 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// i, ÇÑ Ä­ ¶ì¿ì±â, º°Âï±â
		// 0, 0, 9, 12 - 2 * 1 = 10 
		// 1, 1, 7, 12 - 2 * 2 = 8
		// 2, 2, 5, 12 - 2 * 3 = 6
		// 3, 3, 3, 12 - 2 * 4 = 4
		// 4, 4, 1, 12 - 2 * 5 = 2
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < 12 - 2 * i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}

}
