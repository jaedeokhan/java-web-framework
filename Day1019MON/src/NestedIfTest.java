// 학점 계산
public class NestedIfTest {

	public static void main(String[] args) {
		
		int score = 99;
		String grade = "B";
	
		if (score >= 90) {
			grade = "A";
			if (score >= 95) {
				grade += "+";
			}
		} else if (score >= 80) {
			grade = "B";
			if (score >= 85) {
				grade += "+";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade += "+";
			}
		}
		
		System.out.println("당신은 학점은 " + grade + " 입니다.");
		
		// 코드를 줄일 수 있는 방법은?
		
		
	}

}
