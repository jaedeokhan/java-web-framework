
abstract class AbstractClass {
	// 변수 선언 
	int age;
	
	// 구현된 메소드
	void generalMethod() {
		System.out.println("일반 메소드");
	}
	
	// 추상 메소드 -> 정의부만 있고 구현부가 없는 메소드
//	void abstractMethod();
	
	abstract void abstractMethod();
	
}

// 추상 클래스에서 정의한 추상 메소드들을 재정의해야지 에러가 사라진다.
class AbstractChild extends AbstractClass {
	@Override
	void abstractMethod() {
		// TODO Auto-generated method stub
		
	}
}

public class AbstractTest1 {
	public static void main(String[] args) {
		
//		AbstractClass ab = new AbstractClass(); 추상 클래스는 객체 생성을 하지 못한다.
		
		
		
	}
}
