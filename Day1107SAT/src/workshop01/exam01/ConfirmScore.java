package workshop01.exam01;

import java.util.Scanner;

public class ConfirmScore {

	public static void main(String[] args) {
		
		System.out.println("===== ����ó�����α׷� =====");
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�߰���� : ");
		int midTermScore = scanner.nextInt();
		
		System.out.print("�⸻��� : ");
		int finalTermScore = scanner.nextInt();
		
		System.out.print("����Ʈ : ");
		int reportScore = scanner.nextInt();
		
		System.out.print("�⼮ : ");
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
		
		System.out.printf("���� : %.2f", score);
		System.out.println("���� : " + grades);
		System.out.println("�� : " + evaluation);
		
	}

}
