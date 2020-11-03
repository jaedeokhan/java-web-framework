
public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 배열선언
		// 데이터타입 배열변수명[]
		// 데이터티입[] 배열변수명;
		int arr1[];
		int[] arr2[];
		
		// 2. 배열객체 선언
		arr1 = new int[3];
		
		// 3. 배열의 각 인덱스 영역에 값할당
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		// 4. 값 조회
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr[" + i + "] = " + arr1[i]);
		}
		
		// 5. 각 인덱스 영역의 값을 초기화 하면서 배열 객체 생성하기
		
		
	}

}
