// �ʱ�ȭ ���
public class BlockTest {
	static {
		// static �ʱ�ȭ ���
		// Ŭ������ �ε��� �� �� �� ���� ����Ǵ� ����
		System.out.println("static{ }");
	}
	{
		// �ν��Ͻ� �ʱ�ȭ ���
		// ��ü�� �����ɶ� ���� �����ں��� ���� ����Ǵ� ����
		// ����, ��ü�� �����ɶ����� �ݺ������� �����ؾ� �ϴ� �۾��� ������
		System.out.println("{ }");
	}
	
	public BlockTest() {
		System.out.println("������");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("BlockTest blockTest01 = new BlockTest()");
		BlockTest blockTest01 = new BlockTest();
		
		System.out.println("BlockTest blockTest02 = new BlockTest()");
		BlockTest blockTest02 = new BlockTest();
	}

}
