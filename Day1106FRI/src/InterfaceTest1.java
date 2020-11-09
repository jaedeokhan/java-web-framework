
interface Interface1 {
	// �������̽����� �Ϲ� ������ �����ϸ� static final�� �����Ǿ� ��Ÿ��
	int interVar = 1;
	
	// �������̽��� �����ؼ� ����ϱ� ���ؼ� ���Ǻθ� �����Ѵ�.
	void interfaceMethod();
	
	// default �޼ҵ� -> �������̽��� ������ Ŭ�����鿡�� ������ Ư�� ����� �߰����� �� �ִ�.
	public default void defaultMethod() {
		System.out.println("default method");
	}
	
	static void staticMethod() {
		
	}
	
}

class Interface1Impl implements Interface1{

	
	
	@Override
	public void interfaceMethod() {
	}
}

public class InterfaceTest1 {

	public static void main(String[] args) {

//		Interface1 in1 = new Interface1(); => ������ ���� ����� ����
 		
		Interface1Impl interface1Impl = new Interface1Impl();
		interface1Impl.interfaceMethod();
		
		interface1Impl.defaultMethod();
		Interface1.staticMethod();
		
		
	}

}
