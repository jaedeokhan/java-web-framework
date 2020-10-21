import java.util.Scanner;

public class BreakTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연도 : ");
		int year = scanner.nextInt();
		
		System.out.print("달 : ");
		int month = scanner.nextInt();
		
		// 연산 
		// 30, 31일, 2월 구분
		int totalDay = 0;
		boolean isRightMonth = true;
		
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			totalDay = 31;
			break;
		case 4, 6, 9, 11:
			totalDay = 30;
			break;
		case 2:
			// 2월에 적용이 되었을 때 구하는게 효율적이다.
			// 변수도 역시 여기서만 사용하므로 if문 연산에서 처리를 해준다.
			if ((year % 4 == 0 && year % 400 != 0 || year % 100 == 0 )) {
				totalDay = 29;
			} else {
				totalDay = 28;
			}
		default:
			isRightMonth = false;
			break;
		}
		
		// 출력
		if(isRightMonth) {
			System.out.println(year + "년 " + month + "월은 총 " + totalDay + "일까지 존재합니다.");
		} else {
			System.out.println("달 값을 1~12를 입력해주세요.");
		}
		
		
		
		
	}

}
