package polymorphism;

public class Student extends Person {
	String grade;
	
	@Override
	void showSleepingStyle() {
		 System.out.println("�л����� ���� ��Ÿ���� ��Ģ���̴�.");
	}
	 
	 // �θ� Ŭ������ ���ǵ��� ���� �޼ҵ带 �ϳ� �� ����
	 void study() {
		 System.out.println("�л����� �����Ѵ�.");
	 }
	 
	 public static void main(String[] args) {
		 Person person = new Person();
		 person.showSleepingStyle();
		 
		 person = new Student();
		 
		 
	 }
	
}
