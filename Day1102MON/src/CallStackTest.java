
public class CallStackTest {

	
	public static void main(String[] args) {
		
		System.out.println("���� �޼ҵ� ����");
		firstMethod();
		System.out.println("���� �޼ҵ� ����");
	}

	private static void firstMethod() {
		
		System.out.println("firstMethod �޼ҵ� ����");
		secondMethod();
		System.out.println("firstMethod �޼ҵ� ����");
		
	}

	private static void secondMethod() {
		
		System.out.println("secondMethod �޼ҵ� ����");
		System.out.println("secondMethod �޼ҵ� ����");
	}

}
