package workshop;

import java.util.Scanner;

public class WorkShop6 {
	public static void main(String[] args) {

		//  값을 입력받아 0보다 작거나 100보다 크면 "입력오류!!"  출력
		//  (  || 연산자 , 삼항연산자 이용)
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int score = scan.nextInt();
		
		String isError = (score < 0 || score > 100) ? "입력오류" : "정상처리됨";
		System.out.println(isError);
	}
}
