package workshop01.exam05;

import java.util.Scanner;

public class ChoiceFigure {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		boolean stop = false;
		int figureNumber;
		int lowerSide;
		int upperSide;
		int heigth;
		double area = 0;
		
		while(!stop) {
			System.out.println("**** �������� ****");
			System.out.println("1. �ﰢ��");
			System.out.println("2. ��");
			System.out.println("3. ��ٸ���");
			System.out.println("4. ����");
			System.out.print("����>");
			figureNumber = scanner.nextInt();
			
			switch (figureNumber) {
			case 1:
				System.out.println("**** �ﰢ�� ���� ****");
				System.out.print("�Ʒ��� : ");
				lowerSide = scanner.nextInt();
				System.out.print("�� �� : ");
				heigth = scanner.nextInt();
				
				area = lowerSide * heigth / (double)2;
				break;
			case 2:
				System.out.println("**** �� ���� ****");
				System.out.print("�� �� : ");
				heigth = scanner.nextInt();
				
				area = (heigth/2) * (heigth/2) * 3.14;
				break;
			case 3:
				System.out.println("**** ��ٸ��� ���� ****");
				System.out.print("�Ʒ��� : ");
				lowerSide = scanner.nextInt();
				System.out.print("�� �� : ");
				upperSide = scanner.nextInt();
				System.out.print("�� �� : ");
				heigth = scanner.nextInt();
				
				area = ((upperSide + lowerSide) * (heigth) / (double)2);
				break;
			case 4:
				System.out.println("�����մϴ�^.^");
				System.out.println("�����Ͽ����ϴ�.");
				stop = true;
				break;
			default:
				System.out.println("1~4�� ��ȣ�� �����ּ���.");
				break;
			}
			if(!stop) {
				System.out.printf("���� : %.2f\n ", area);
			}
		}
	

	}
	

}
