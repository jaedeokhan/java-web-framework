package workshop;

import java.util.Scanner;

public class WorkShop3 {
	public static void main(String[] args) {
		
		// 입력받아 계산하시오
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = scan.next();
		
		System.out.print("국어 점수를 입력하세요 : ");
		int kor = scan.nextInt();

		System.out.print("국어 점수를 입력하세요 : ");
		int eng = scan.nextInt();
	
		System.out.print("국어 점수를 입력하세요 : ");
		int mat = scan.nextInt();
		
		int total = kor + eng + mat;
		double avg = (kor + eng + mat) / (double)3;
		
		System.out.println("이름 : " + name);
		System.out.println("total 점수 : " + total);
		System.out.printf("avg 점수 : %.1f", avg); 
		
		
	}
}
