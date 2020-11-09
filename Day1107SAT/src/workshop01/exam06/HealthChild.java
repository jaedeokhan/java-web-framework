package workshop01.exam06;

public class HealthChild extends HealthSuper {
	
	private double s_weight;
	private double fat;
	private String result;

	void calculate() { // 비만도 계산
		s_weight = (gender == 'M') ? (tall - 100) * 0.9 : (tall - 100 ) * 0.85;
		fat = weight / s_weight * 100;
		
		if (fat <= 90) {
			result = "저체중";
		} else if(fat >= 91 && fat <= 110) {
			result = "정상(표준체중)";
		} else if(fat >= 111 && fat <= 120) {
			result = "과체중";
		} else if(fat >= 121 && fat <= 130) {
			result = "경도비만";
		} else if(fat >= 131 && fat <= 150) {
			result = "중도비만";
		} else {
			result = "고도비만";
		}
		
	}
	
	void output2() { // 출력
		System.out.printf("\n당신은 비만도가 %.2f이고, %s 입니다.", fat, result);
	}
	
	public static void main(String[] args) {
		
		HealthChild healthChild = new HealthChild();
		healthChild.input();
		healthChild.output1();
		healthChild.calculate();
		healthChild.output2();
		
	}
	
}
