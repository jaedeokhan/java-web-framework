package polymorphism;

public class President extends Person {
	String nation; // 나라
	
	@Override
	void showSleepingStyle() {
		System.out.println("대통령은 과중한 업무로 수면이 부족하다.");
	}
	
	void confirm() {
		
	}
	
}	
