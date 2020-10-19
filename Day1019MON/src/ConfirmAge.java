import java.util.Scanner;

// 나이대를 판단 
public class ConfirmAge {

	public static void main(String[] args) {
		
		// 1. 프로그램이 시작되면 아래와 같이 나이를 입력 받는다
		// 나이 : 35
		// 2. 시스템은 나이대를 판단하여 아래와 같이 나이대를 출력한다.
		// 당신은 30대입니다.
		// 단, 나이가 음수이면 아래와 같이 출력하고 프로그램을 종료한다.
		// 나이가 올바르지 않습니다.
		// 당신은 어린이입니다.
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이를 입력해주세요 : ");
		int age = scanner.nextInt();
		
		// 연산
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
			isAge = "어린이";
		}
		
		// 출력
		if (isMinus) {
			System.out.println(isAge);			
		} else {
			System.out.println("연산자가 올바르지 않습니다.");
		}
		
		
		// 연산
		int IsintAge = age / 10 * 10;
		String IsintDone = (IsintAge >= 90) ?
				"90대 이상" : (IsintAge < 10 ) ?
				"어린이" : IsintAge  + "대";
		
		boolean rightAge = (age < 0) ? false : true;
		
		// 출력
		if (rightAge) {
			System.out.println(IsintDone);
		} else {
			System.out.println("연산자가 올바르지 않습니다.");
		}
		
		// 나머지로 연산
		int intDivisionIsAge = age - (age % 10);
		String intDivisionIsDone = (intDivisionIsAge >= 90) ?
				"90대 이상" : (intDivisionIsAge < 10  && intDivisionIsAge > 0) ?
				"어린이" : intDivisionIsAge  + "대";
		
		boolean DivisionrightAge = (intDivisionIsAge < 0) ? false : true;
		
		// 나머지로 출력
		if (DivisionrightAge) {
			System.out.println(intDivisionIsDone);
		} else {
			System.out.println("연산자가 올바르지 않습니다.");
		}
		
		
		
		
	}

}
