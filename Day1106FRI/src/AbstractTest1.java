
abstract class AbstractClass {
	// ���� ���� 
	int age;
	
	// ������ �޼ҵ�
	void generalMethod() {
		System.out.println("�Ϲ� �޼ҵ�");
	}
	
	// �߻� �޼ҵ� -> ���Ǻθ� �ְ� �����ΰ� ���� �޼ҵ�
//	void abstractMethod();
	
	abstract void abstractMethod();
	
}

// �߻� Ŭ�������� ������ �߻� �޼ҵ���� �������ؾ��� ������ �������.
class AbstractChild extends AbstractClass {
	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
		
	}
}

public class AbstractTest1 {
	public static void main(String[] args) {
		
//		AbstractClass ab = new AbstractClass(); �߻� Ŭ������ ��ü ������ ���� ���Ѵ�.
		
		
		
	}
}
