import java.util.Scanner;

public class NumberInputTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// 맞추어야할 번호
		int rightNumber = (int)(Math.random() * 100) + 1; // 1~100
		// Math.radnom() : 0.0보다 크거나 같고 1.0보다 작은 double 타입의 난수 발생
		// (Math.random) == 0.0 ~ 0.999999999999999999
		// (int)(Math.radnom * 100) == 0 ~ 99 
		// (int)(Math.radnom * 100) + 1 == 1 ~ 100
		boolean stop = false;
		do {
			System.out.print("숫자입력 : ");
			int inputNumber = scanner.nextInt();
			if(inputNumber > rightNumber) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			else if(inputNumber < rightNumber) {
				System.out.println("더 큰수 수를 입력하세요.");
			} 
			else {
				System.out.println("정답입니다!");
				stop = true;
			}
		} while(!stop);
		
	}

}
