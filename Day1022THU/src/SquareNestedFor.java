
public class SquareNestedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				if(i == 1 || i == 5 || j == 1 || j == 10) { 
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.print((i == 1 || i == 5 || j == 1 || j == 10) ? "*" : " ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
