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
			System.out.println("**** 도형선택 ****");
			System.out.println("1. 삼각형");
			System.out.println("2. 원");
			System.out.println("3. 사다리꼴");
			System.out.println("4. 종료");
			System.out.print("선택>");
			figureNumber = scanner.nextInt();
			
			switch (figureNumber) {
			case 1:
				System.out.println("**** 삼각형 넓이 ****");
				System.out.print("아랫변 : ");
				lowerSide = scanner.nextInt();
				System.out.print("높 이 : ");
				heigth = scanner.nextInt();
				
				area = lowerSide * heigth / (double)2;
				break;
			case 2:
				System.out.println("**** 원 넓이 ****");
				System.out.print("높 이 : ");
				heigth = scanner.nextInt();
				
				area = (heigth/2) * (heigth/2) * 3.14;
				break;
			case 3:
				System.out.println("**** 사다리골 넓이 ****");
				System.out.print("아랫변 : ");
				lowerSide = scanner.nextInt();
				System.out.print("윗 변 : ");
				upperSide = scanner.nextInt();
				System.out.print("높 이 : ");
				heigth = scanner.nextInt();
				
				area = ((upperSide + lowerSide) * (heigth) / (double)2);
				break;
			case 4:
				System.out.println("감사합니다^.^");
				System.out.println("정지하였습니다.");
				stop = true;
				break;
			default:
				System.out.println("1~4의 번호를 눌러주세요.");
				break;
			}
			if(!stop) {
				System.out.printf("넓이 : %.2f\n ", area);
			}
		}
	

	}
	

}
