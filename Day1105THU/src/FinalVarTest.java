class FinalClass{
	final int x;
	// static�� �������� ���� ��� => �ν��Ͻ� ���

	public FinalClass(int x) {
		this.x = x;
	}
	
	static final int y = 100;
	// static ���
	// Ŭ���� ��ü���� �����Ǵ� ���
	// ����, �Ϲ������� ����� ������ �� �ٷ� ���� �Ҵ�
	
}


public class FinalVarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalClass finalClass1 = new FinalClass(10);
		FinalClass finalClass2 = new FinalClass(20);
		
		// finalClass1.x = 90; => �̿� ���� ����� ������ �� ����.
		System.out.println(finalClass1.y);
		System.out.println(finalClass2.y);
		System.out.println(FinalClass.y); // Ŭ������ �̸����� ������� �ٷ� ������ �����ϴ�.
	
	}

}
