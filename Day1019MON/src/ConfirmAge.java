import java.util.Scanner;

// ���̴븦 �Ǵ� 
public class ConfirmAge {

	public static void main(String[] args) {
		
		// 1. ���α׷��� ���۵Ǹ� �Ʒ��� ���� ���̸� �Է� �޴´�
		// ���� : 35
		// 2. �ý����� ���̴븦 �Ǵ��Ͽ� �Ʒ��� ���� ���̴븦 ����Ѵ�.
		// ����� 30���Դϴ�.
		// ��, ���̰� �����̸� �Ʒ��� ���� ����ϰ� ���α׷��� �����Ѵ�.
		// ���̰� �ùٸ��� �ʽ��ϴ�.
		// ����� ����Դϴ�.
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("���̸� �Է����ּ��� : ");
		int age = scanner.nextInt();
		
		// ����
		String isAge = "";
		boolean isMinus = true;
		
		if(age >= 90) {
			isAge = "90";
		} else if (age >= 80) {
			isAge = "80";
		} else if (age >= 70) {
			isAge = "70";
		} else if (age >= 60) {
			isAge = "60";
		} else if (age >= 50) {
			isAge = "50";
		} else if (age >= 40) {
			isAge = "40";
		} else if (age >= 30) {
			isAge = "30";
		} else if (age >= 20) {
			isAge = "20";
		} else if (age >= 10) {
			isAge = "10";
		} else {
			isMinus = false;
			isAge = "���";
		}
		
		// ���
		if (isMinus) {
			System.out.println(isAge);			
		} else {
			System.out.println("�����ڰ� �ùٸ��� �ʽ��ϴ�.");
		}
		
		
		// ����
		int IsintAge = age / 10 * 10;
		String IsintDone = (IsintAge >= 90) ?
				"90�� �̻�" : (IsintAge < 10 ) ?
				"���" : IsintAge  + "��";
		
		boolean rightAge = (age < 0) ? false : true;
		
		// ���
		if (rightAge) {
			System.out.println(IsintDone);
		} else {
			System.out.println("�����ڰ� �ùٸ��� �ʽ��ϴ�.");
		}
		
		// �������� ����
		int intDivisionIsAge = age - (age % 10);
		String intDivisionIsDone = (intDivisionIsAge >= 90) ?
				"90�� �̻�" : (intDivisionIsAge < 10  && intDivisionIsAge > 0) ?
				"���" : intDivisionIsAge  + "��";
		
		boolean DivisionrightAge = (intDivisionIsAge < 0) ? false : true;
		
		// �������� ���
		if (DivisionrightAge) {
			System.out.println(intDivisionIsDone);
		} else {
			System.out.println("�����ڰ� �ùٸ��� �ʽ��ϴ�.");
		}
		
		
		
		
	}

}
