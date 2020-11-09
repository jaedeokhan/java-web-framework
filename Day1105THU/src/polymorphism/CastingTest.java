package polymorphism;

public class CastingTest {

	public static void main(String[] args) {
		
		// �������� ������� �ʴ� ���
		President president = new President();
		
		// Casting�� �߻��ϴ� ���
		// 1. �θ� Ŭ���� Ÿ���� ���۷��� ������ �ڽ� Ŭ���� Ÿ���� ���۷��� ���� �����ϴ� ���
		// ��, �θ� Ŭ������ �ڽ� Ŭ���� Ÿ���� ���۷��� ���� ���� �Ҵ�޴� ���
		// �Ҵ�Ǵ� ���۷��� ���� ������ Ÿ���� �ڵ����� �θ� Ŭ���� Ÿ������ ĳ���õǾ�(Upcasting) �Ǿ� �Ҵ��� �ȴ�.
		// �ڽ��� �θ� ������ �ڵ����� Upcasting�� �ȴ�.
		Person person = president;
		
		
//		President president2 = person; => ������ ���� ������ ������ �߻��ؼ� ��������� �ٿ� ĳ�����Ѵ�.
		President president2 = (President) person;
	
//		Student student = (Student)(new Employee()); => ���� Ŭ�����鳢���� �ƹ� ���谡 ���⿡ ĳ������ ���Ѵ�.
		
		// �ڹٿ����� �θ� Ŭ���� ���۷��� ������ �ڽ� Ŭ���� ��ü�� �����Ҽ��� �־, 
		// �ڽ� Ŭ���� Ÿ���� ���۷��� ������ �θ� ��ü�� ������ �� ����.
		Person person3 = new Person();
		if(person3 instanceof President) {
			President president3  = (President)person3; 
		} else {
			System.out.println("�ٿ� ĳ���� �Ұ�");
			System.out.println("����");
		}
		
		// instanceof �����ڸ� �̿��ؼ� �ٿ� ĳ������ �� �� �ִ� ��ü���� �Ǵ��ؼ� �����Ѵ�.
		if(person instanceof President) {
			President president4 = (President) person; // ���⼭�� �����ϴ�. person�� �̓G 15�࿡�� president�� �����ϰ� �ֱ� �����̴�.
		} else {
			System.out.println("�ٿ� ĳ���� �Ұ�");
		}
		
		// �θ� Ŭ�������� ���ǵ� �޼ҵ带 �ڽ� Ŭ�������� �������߰�, 
		// �θ� Ŭ���� Ÿ���� ���۷��� ������ 
		// �����ǵ� �޼ҵ忡 �����ϸ� �׻� �����ǵ� �޼ҵ尡 ȣ��ȴ�.
		// ��, �ڹٿ��� ȣ��Ǵ� �޼ҵ�� ��Ÿ�ӽ� �����ȴ�.
		// ��, �޼ҵ��� �������� �����ȴ�.
		Person person4 = new Student();
		person4.showSleepingStyle(); 
		person4 = new Employee();
		person4.showSleepingStyle();
		person4 = new President();
		person4.showSleepingStyle();
	
		// �θ� Ŭ�������� ���ǵ� ������ �ڽ� Ŭ�������� �������߰�, 
		// �θ� Ŭ���� Ÿ���� ���۷��� ������ 
		// �����ǵ� ������ �����ϸ� ���۷������� Ÿ�Կ� ���� ȣ��Ǵ� ������ �����ȴ�.
		// ��, �ڹٿ��� ȣ��Ǵ� ������ ������ Ÿ�ӿ� �����ȴ�.
		// ��, ������ �������� ������ ���� �ʴ´�.
		
		Person person5 = new Employee();
		System.out.println(person5.x);
		
		Employee employee1 = (Employee) person5;
		System.out.println(employee1.x);
		
		// �ٿ� ĳ������ �ؾ��ϴ� ������?
		Person person6 = new Student();
        // person6.study(); => ����ؾ��� �޼ҵ尡 �θ𿡴� �������� �ʰ�, 
		// �ڽ� ��ü���� �����Ѵٸ� �ٿ� ĳ������ ����� �Ѵ�.
		
		Student student = (Student)person6;
		student.study();
		
	
	}

}
