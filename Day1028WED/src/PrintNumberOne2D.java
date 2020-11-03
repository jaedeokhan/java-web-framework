
public class PrintNumberOne2D {
	public static void main(String[] args) {
		
		
		int number[][] = new int[4][4];
		
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				if(i == j) {
					number[i][j] = 1;
				}
				if(i == 0 || i == 3 || j == 0 || j == 3) {
					number[i][j] = 1;
				}
				
			}
		}

		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				System.out.print(number[i][j] + " ");
			}
			System.out.println();
		}
		 
		System.out.println();
		
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				if(i == j || i == 0 || i == number.length - 1 || j == 0 || j == number[i].length) {
					number[i][j] = 1;
				}
			}
		}
		
		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				System.out.print(number[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
