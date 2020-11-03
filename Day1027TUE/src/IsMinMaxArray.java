
public class IsMinMaxArray {

	public static void main(String[] args) {
		// 배열에 있는 점수 중에 최댓값과 최솟값을 구해서 출력해라.
		// 최댓값, 최솟값
		
		int[] score = {100, 99, 90, 98, 89, 2, 1, 75, 34, 25, 15, 3};
		int maxNumber=  0;
		int minNumber = 12341234;
		
		for (int i = 0; i < score.length; i++) {
			if(score[i] > maxNumber) {
				maxNumber = score[i];
			}
			else if(score[i] < minNumber) {
				minNumber = score[i];
			}
		}
		
		System.out.println("최댓값 : " + maxNumber + ", 최솟값 : " + minNumber);

	}

}
