package polymorphism;

public class PersonInfo {
	// 다형성을 사용해서 메소드 정의
	
	void printSleepingStyle(Person person) {
		if(person instanceof Student) { 
			// 기존 요구사항이 그냥 잠자는 스타일을 체크하는 것이 였다면,
			// 이후 요구사항에서 학생들이 넘어오면 .study()메소드를 찍어줘야 한다면
			// 현재 넘어오는 값이 Student의 객체인지 판단후에 다운 캐스팅을 해서 메소드를 실행한다.
			Student student = (Student)person;
			student.study();
		}
		person.showSleepingStyle();
	}
	
	public static void main(String[] args) {
		
		PersonInfo personInfo = new PersonInfo();
		
		personInfo.printSleepingStyle(new President());
		personInfo.printSleepingStyle(new Student());
		personInfo.printSleepingStyle(new Employee());
		
	}

}
