
public class TwoDimensionArray {

	public static void main(String[] args) {
		
		// 2차원 배열
		int[][] arr1;
		int arr2[][];
		int[] arr3[];
		
		// 배열 객체 생성
		arr1 = new int[2][3];
		int num = 0;
		
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = num++;
			}
		}

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.println("arr1[i][j] == " + arr1[i][j]);
			}
		}
		
		// 가변길이 배열
		System.out.println("=========================");
		System.out.println("=======가변길이 배열=====");
		
		int[][] arr5 = new int[3][];
		int num2 = 0;
		
		arr5[0] = new int[2];
		arr5[1] = new int[3];
		arr5[2] = new int[4];
		
		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				arr5[i][j] = num2++;
			}
		}
		
		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				System.out.print(arr5[i][j] + " ");
			}
			System.out.println();
		}
		
		// 2.
		int[][] arr9 = new int[][] {{1,2,3}, {4,5,6}, {7,8,9}};
		for (int i = 0; i < arr9.length; i++) {
			for (int j = 0; j < arr9[i].length; j++) {
				System.out.print(arr9[i][j] + " ");
			}
			System.out.println();
		}
		
		
		

	}

}
