// �����ڴ� �ַ� ����������� �ʱ�ȭ��Ű�� �뵵�� ����Ѵ�.
public class ConstructorTest {
	int value;
	
	public ConstructorTest(int value) {
		this.value = value;
	}
	
	public ConstructorTest() {
		
	}
	
	public static void main(String[] args) {

		
		// 1. �⺻ ������ �̿ܿ� ���Ǹ� ���� ������, �ڵ����� �⺻ �����ڰ� ������ �ȴ�.
		int value = 0;
		ConstructorTest constructorTest01 = new ConstructorTest();
		ConstructorTest constructorTest02 = new ConstructorTest(value);

		
	}

}
