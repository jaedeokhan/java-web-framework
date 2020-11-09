package polymorphism;

public class Employee extends Person {
	int salary;
	int x = 100;
	
	@Override
	void showSleepingStyle() {
		System.out.println("직원들은 잠을 어떻게 자는가");
	}
	
	void work() {
		System.out.println("일하는 중이다.");
	}
	
}
