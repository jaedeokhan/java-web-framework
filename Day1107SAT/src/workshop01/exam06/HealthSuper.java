package workshop01.exam06;

import java.util.Scanner;

public class HealthSuper {
	
	protected char gender;
	protected double tall;
	protected double weight;
	
	public HealthSuper() {
	}
	
	void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("***** 비만도 체크 *****");
		System.out.print("성별(M/F) : ");
		gender = scanner.next().charAt(0);
		System.out.print("신장(Cm) : ");
		tall = scanner.nextDouble();
		System.out.print("체중(Kg) : ");
		weight = scanner.nextDouble();
	}
	
	void output1() {
		System.out.println("\n성별 - " + gender);
		System.out.printf("신장 - %.1fCm\n", tall);
		System.out.printf("성별 - %.2fKg\n", weight);
	}

}
