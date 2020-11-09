package polymorphism;

public class ArrayPolyTest {
	public static void main(String[] args) {
		
		Employee[] employeeArray = new Employee[3];
		employeeArray[0] = new Employee();
		
		// ����, ������ �ִ� ���� �ٸ� Ÿ���� Ŭ���� ��ü�� 
		// ������ �迭���� ������ ���� �������� ����ϸ� �ȴ�.
		
		Person[] person = new Person[3];
		
		person[0] = new Employee();
		person[1] = new Student();
		person[2] = new President();
		
		for (int i = 0; i < person.length; i++) {
			person[i].showSleepingStyle();
		}
		
		
	}
}
