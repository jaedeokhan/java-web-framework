// this 
// �Ϲ������� ������ ����.
// Ŭ�����ȿ��� �ڿ��� ����� ���� �ڵ����� this�� �� �ִ�.
// ��, �Ķ���� ������� ��� �������� ������ ����
// �Ķ���� ������ �켱 �νĵǱ� ������
// ����������� �����Ϸ��� this�� �ٿ��� �Ѵ�.
public class ThisTest {

	int x;
	
	public ThisTest(int x) {
		this.x = x;
	}
	
	void printInfo() {
		int y = x;
	}
	
	void pringInfo1() {
//		this.pringInfo1();
		printInfo();
	}
	
	public static void main(String[] args) {
		 
		ThisTest thisTest = new ThisTest(10);
		System.out.println(thisTest.x);
		
	}

}
