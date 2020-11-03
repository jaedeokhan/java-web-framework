package workshop01;

import java.util.Scanner;

public class IsProgrammer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. while문 안에서 1. 에코 | 2.종료 선택하기
		// 2. int choice로 scanner 입력 받아서 1,2 선택
		// 3. string talk 에 scanner로 입력 받기
		// 4. 1번 에코 서비스로 위에서 입력 받은 talk 출력하기
		// 	 4.2 2.종료는 boolean isFinshed = true로 주기
		
		Scanner scanner = new Scanner(System.in);
		
		boolean isFinshed = false;
		
		while(!isFinshed) {
			
			System.out.println("1. 에코 || 2. 종료");
			System.out.print("선택> ");
			int choice = scanner.nextInt();
			String talk = null;
			if(choice == 1) {
				System.out.print("입력> ");
				talk = scanner.next();
				System.out.println("에코> " + talk);
			} else if(choice == 2) {
				System.out.println("이용해주셔서 감사합니다.");
				isFinshed = true;
			} else {
				System.out.println("1,2번만 선택해주세요.");
			}
		}
		

	}

}
