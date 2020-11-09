package polymorphism;

public class ArrayPolyTest {
	public static void main(String[] args) {
		
		Employee[] employeeArray = new Employee[3];
		employeeArray[0] = new Employee();
		
		// 만약, 관련이 있는 여러 다른 타입의 클래스 객체를 
		// 동일한 배열에서 관리할 때는 다형성을 사용하면 된다.
		
		Person[] person = new Person[3];
		
		person[0] = new Employee();
		person[1] = new Student();
		person[2] = new President();
		
		for (int i = 0; i < person.length; i++) {
			person[i].showSleepingStyle();
		}
		
		
	}
}
