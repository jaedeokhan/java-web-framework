// �߻� Ŭ����(A)�� �ٸ� �߻� Ŭ����(B)�� ��ӹ��� ��� 
// AŬ������ ��ӹ޴� �Ϲ� Ŭ������ B Ŭ�������� ���ǵ� �߻� �޼ҵ嵵 ��� �����ؾ��Ѵ�.
abstract class AbClass1 {
	abstract void abMethod1();
}

abstract class AbClass2 extends AbClass1{
	abstract void abMethod();
}

class GeneralClass extends AbClass2{
	@Override
	void abMethod() {
		// TODO Auto-generated method stub
		
	}@Override
	void abMethod1() {
		// TODO Auto-generated method stub
		
	}
}

public class AbstractTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
