package polymorphism;

public class Employee extends Person {
	int salary;
	int x = 100;
	
	@Override
	void showSleepingStyle() {
		System.out.println("�������� ���� ��� �ڴ°�");
	}
	
	void work() {
		System.out.println("���ϴ� ���̴�.");
	}
	
}
