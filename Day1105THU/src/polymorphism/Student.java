package polymorphism;

public class Student extends Person {
	String grade;
	
	@Override
	void showSleepingStyle() {
		 System.out.println("학생들의 수면 스타일은 규칙적이다.");
	}
	 
	 // 부모 클래스에 정의되지 않은 메소드를 하나 더 정의
	 void study() {
		 System.out.println("학생들은 공부한다.");
	 }
	 
	 public static void main(String[] args) {
		 Person person = new Person();
		 person.showSleepingStyle();
		 
		 person = new Student();
		 
		 
	 }
	
}
