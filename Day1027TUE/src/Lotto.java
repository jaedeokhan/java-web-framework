
public class Lotto {

	public static void main(String[] args) {
		// 45개의 숫자를 배열에 저장
		int[] ball = new int[45];
		
		// 각 ball에 1~45까지에 숫자를 넣기
		for (int i = 0; i < ball.length; i++) {
			ball[i] = i + 1;
		}
		
		// 배열에 저장된 숫자값들을 섞는다.
		int temp = 0; // swap을 할 값을 임시적으로 저장할 변수
		int index = -1; // 0번 인덱스 값과 교환할 값을 가지고 있는 인덱스 번호
		
		for (int i = 0; i < 100; i++) {
			index = (int)(Math.random() * 45) + 1;
			temp = ball[0];
			ball[0] = ball[index];
			ball[index] = temp;
		}
		
		System.out.print("로또 번호 : ");
		for (int i = 0; i < 6; i++) {
			System.out.print(ball[i] + " ");
		}
		
		
		
		
	}

}
