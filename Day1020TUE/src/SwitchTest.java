import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("====회원관리====");
		System.out.println("====1. 회원등록====");
		System.out.println("====2. 회원목록보기====");
		System.out.println("====3, 회원정보수정====");
		System.out.println("====4. 회원정보삭제====");
		
		int menuNumber = 1;
		
		while(menuNumber != 0) {
			System.out.print("메뉴 입력 : ");
			menuNumber = scanner.nextInt();
			switch(menuNumber) {
				case 1:
					System.out.println("회원등록처리");
					break;
				case 2:
					System.out.println("회원목록보기");
					break;
				case 3:
					System.out.println("회원정보수정");
					break;
				case 4:
					System.out.println("회원정보삭제");
					break;
			}
		}
		
	}

}
