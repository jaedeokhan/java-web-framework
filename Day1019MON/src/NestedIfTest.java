// ���� ���
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
		
		System.out.println("����� ������ " + grade + " �Դϴ�.");
		
		// �ڵ带 ���� �� �ִ� �����?
		
		
	}

}
