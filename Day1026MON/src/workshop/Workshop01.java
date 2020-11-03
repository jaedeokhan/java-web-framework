package workshop;

import java.util.Scanner;

public class Workshop01 {

	public static void main(String[] args) {
		// 1번 : 아래의 코드는 사과를 담는데 필요한 바구니(버켓)의 수를 구하는 코드이다.
		// 만일, 사과의 수가 123개이고 하나의 바구니에는 10개의 사과를 담을 수 있다면,
		// 13개의 바구니가 필요할 것이다. 
		
		Scanner scanner = new Scanner(System.in);
		
		int numOfApples = scanner.nextInt();
		int sizeOfBucket = 10;
		// 10 을 나눠서 나누어 떨어지면 + 0
		// 10의 나머지가 있따면 + 1
		int numOfBucket = (numOfApples % sizeOfBucket != 0) ? 
				(numOfApples / sizeOfBucket) + 1  : (numOfApples / sizeOfBucket) ;
		
		System.out.println("필요한 바구니의 수 : " + numOfBucket);
		
		
		
	}

}
