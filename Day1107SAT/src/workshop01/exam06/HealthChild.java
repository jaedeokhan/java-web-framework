package workshop01.exam06;

public class HealthChild extends HealthSuper {
	
	private double s_weight;
	private double fat;
	private String result;

	void calculate() { // �񸸵� ���
		s_weight = (gender == 'M') ? (tall - 100) * 0.9 : (tall - 100 ) * 0.85;
		fat = weight / s_weight * 100;
		
		if (fat <= 90) {
			result = "��ü��";
		} else if(fat >= 91 && fat <= 110) {
			result = "����(ǥ��ü��)";
		} else if(fat >= 111 && fat <= 120) {
			result = "��ü��";
		} else if(fat >= 121 && fat <= 130) {
			result = "�浵��";
		} else if(fat >= 131 && fat <= 150) {
			result = "�ߵ���";
		} else {
			result = "����";
		}
		
	}
	
	void output2() { // ���
		System.out.printf("\n����� �񸸵��� %.2f�̰�, %s �Դϴ�.", fat, result);
	}
	
	public static void main(String[] args) {
		
		HealthChild healthChild = new HealthChild();
		healthChild.input();
		healthChild.output1();
		healthChild.calculate();
		healthChild.output2();
		
	}
	
}
