package workshop;

public class ConfirmDice {

	public static void main(String[] args) {
		
		// 두 개의 주사위를 던졌을 때 두 수의 합이 6이 되는 모든 경우가 몇 개인지 계산
		int count = 0;
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				if(i + j == 6) {
					System.out.println(i + " + " + j + " = " + (i  + j));
					count++;
				}
			}
		}
		System.out.println("주사위 합이 6이 되는 경우의 수 : " + count);
		

	}

}

