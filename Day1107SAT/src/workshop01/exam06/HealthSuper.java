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
		System.out.println("***** �񸸵� üũ *****");
		System.out.print("����(M/F) : ");
		gender = scanner.next().charAt(0);
		System.out.print("����(Cm) : ");
		tall = scanner.nextDouble();
		System.out.print("ü��(Kg) : ");
		weight = scanner.nextDouble();
	}
	
	void output1() {
		System.out.println("\n���� - " + gender);
		System.out.printf("���� - %.1fCm\n", tall);
		System.out.printf("���� - %.2fKg\n", weight);
	}

}
