
public class CallStackTest {

	
	public static void main(String[] args) {
		
		System.out.println("메인 메소드 시작");
		firstMethod();
		System.out.println("메인 메소드 종료");
	}

	private static void firstMethod() {
		
		System.out.println("firstMethod 메소드 시작");
		secondMethod();
		System.out.println("firstMethod 메소드 종료");
		
	}

	private static void secondMethod() {
		
		System.out.println("secondMethod 메소드 시작");
		System.out.println("secondMethod 메소드 종료");
	}

}
