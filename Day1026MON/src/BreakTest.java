import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("1부터 4까지 출력하고 종료");
		for (int i = 1; i <= 10; i++) {
			if(i == 5) {
				break;
			}
			System.out.println("i = " + i);
		}
		
		// 존경하는 교수님을 입력하세요
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("존경하는 교수명을 입력하세요");
			System.out.print("교수명 : ");
			String name = scanner.next();
			if(name.equals("오정원")) {
				System.out.println("참 좋은 교수님");
				break;
			}
			else {
				System.out.println("다시 생각해봐라~~");
			}
		}
	}

}
