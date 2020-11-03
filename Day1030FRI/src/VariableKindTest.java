
public class VariableKindTest {
	
	int memberVar;
	// �������(�ν��Ͻ�����)
	// �ʱ�ȭ���� : new �����ڷ� ��ü�� ������ �� �� ��ü�޴� �Ҵ��� �ȴ�.
	
	static int staticVar;
	// static ����(Ŭ��������)
	// �ʱ�ȭ���� : JVM�� Ŭ������ �ε��� �� �ٷ� Ŭ���������� �ʱ�ȭ��
	// ��ü�� �������� �ʾƵ� Ŭ�����̸����� �ٷ� ����(���)�� �����ϴ�.
	
	void instanceMethod1(int paramVar) {
		// �Ķ���� ����
		// Ư���� ���ú����� ����.
		int x = staticVar;
		staticMethod1();
		instanceMethod2(100);
	}
	void instanceMethod2(int paramVar) {
		
	}
	
	static void staticMethod1() {
		VariableKindTest vt =  new VariableKindTest();
		int x = vt.memberVar;
		x = staticVar;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableKindTest vt1 = new VariableKindTest();
		VariableKindTest vt2 = new VariableKindTest();
		vt1.memberVar = 100;
		vt2.memberVar = 200;
		System.out.println("vt1.memberVar => " + vt1.memberVar);
		System.out.println("vt2.memberVar => " + vt2.memberVar);
		System.out.println("staticVar => " + VariableKindTest.staticVar);
		
		// ��������
		// ����Ǹ� �ڵ����� �Ҹ��
		// ������ ������ �� ���� �Ҵ����� ������ ������ ���� �߻�
		int localVar;
		
		int x = 5;
		int y = 6;
		if(x > y) {
			localVar = 100;
		} else {
			localVar = 200;
		}
		
		System.out.println(localVar);
		
		
	}

}
