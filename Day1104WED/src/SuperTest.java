class Employee {
	String name;
	String department;
	int salary;
	
	String printInfo() {		
		return "name = " + name + "\ndepartment = " + department + "\nsalary = " + salary;
	}
}

class Sales extends Employee {
	int commission; // �����δ� Ư���ϰ� ������ �ִ�.
	@Override
	String printInfo() {
		return super.printInfo() + "\ncommission : " + commission;
	}
}

public class SuperTest {

	public static void main(String[] args) {
		
		Sales sales = new Sales();
		String message = sales.printInfo();
		System.out.println(message);
	}

}
