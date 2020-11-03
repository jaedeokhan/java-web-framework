package workshop01;
import java.util.Scanner;

public class Banking {

	public static void main(String[] args) {
		// 1. 프로그램이 시작되면 아래와 같이 메뉴를 출력한다.
		//	  1. 입금
		//	  2. 출금
		//    3. 잔액조회
		//    4. 프로그램 종료
		// 2. 1번 메뉴나 2번 메뉴를 선택했으면 입출금할 금액을 물어본후 입출금 처리를 한다.
		// 3. 3번 메뉴를 선택했으면 현재 잔액을 보여준다.
		// 4. 4번을 누르면 종료된다.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1.입금 ||  2.출금 ||  3.잔액조회 || 4.종료");
		
		boolean isFinish = false;
		int money  = 0;
		
		while(!isFinish) { // isFinish == true
			System.out.print("이용할 서비스를 선택해주세요 : ");
			int choice = scanner.nextInt();
	
			switch (choice) {
			case 1: // 입금
				System.out.print("입금할 금액을 입력해주세요 : ");
				money = scanner.nextInt();
				break;
				
			case 2: // 출금
				System.out.print("출금할 금액을 입력해주세요 : ");
				money = scanner.nextInt();				
				break;
				
			case 3: // 잔액조회
				System.out.println("잔고 : " + money);			
				break;
				
			case 4: // 프로그램 종료
				System.out.println("이용해 주셔서 감사합니다.");
				isFinish = true;
				break;
				
			default: 
				System.out.println("1~4에 해당하는 숫자를 입력해주세요.");
				break;
			}
		}
	}

}
