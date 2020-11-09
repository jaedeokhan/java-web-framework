package polymorphism;

public class PersonInfo {
	// �������� ����ؼ� �޼ҵ� ����
	
	void printSleepingStyle(Person person) {
		if(person instanceof Student) { 
			// ���� �䱸������ �׳� ���ڴ� ��Ÿ���� üũ�ϴ� ���� ���ٸ�,
			// ���� �䱸���׿��� �л����� �Ѿ���� .study()�޼ҵ带 ������ �Ѵٸ�
			// ���� �Ѿ���� ���� Student�� ��ü���� �Ǵ��Ŀ� �ٿ� ĳ������ �ؼ� �޼ҵ带 �����Ѵ�.
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
