package workshop01.exam01;

import java.util.Scanner;

public class ConfirmScore {

	public static void main(String[] args) {
		
		System.out.println("===== 성적처리프로그램 =====");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("중간고사 : ");
		int midTermScore = scanner.nextInt();
		
		System.out.print("기말고사 : ");
		int finalTermScore = scanner.nextInt();
		
		System.out.print("레포트 : ");
		int reportScore = scanner.nextInt();
		
		System.out.print("출석 : ");
		int attendanceScore = scanner.nextInt();
		
		double score = (midTermScore + finalTermScore) / 2 * 0.6 + reportScore * 0.2 + attendanceScore * 0.2; 
		String grades = "";
		String evaluation = "";
		
		if(score >= 90 && score <= 100) {
			grades = "A";
		} else if(score >= 80) {
			grades = "B";
		} else if(score >= 70) {
			grades = "C";
		} else if(score >= 60) {
			grades = "D";
		} else {
			grades = "F";
		}
		
		switch (grades) {
		case "A":                                                                                                                                                                                  
		case "B":
			evaluation = "excellent";
			break;
		case "C":
		case "D":
			evaluation = "good";
			break;
		case "F":
			evaluation = "poor";
			break;
		}
		
		System.out.printf("성적 : %.2f", score);
		System.out.println("학점 : " + grades);
		System.out.println("평가 : " + evaluation);
		
	}

}
