
interface Interface1 {
	// 인터페이스에는 일반 변수를 선언하면 static final이 생략되어 나타남
	int interVar = 1;
	
	// 인터페이스를 구현해서 사용하기 위해서 정의부만 정의한다.
	void interfaceMethod();
	
	// default 메소드 -> 인터페이스를 구현할 클래스들에게 일제히 특정 기능을 추가해줄 수 있다.
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

//		Interface1 in1 = new Interface1(); => 다음과 같이 사용을 못한
 		
		Interface1Impl interface1Impl = new Interface1Impl();
		interface1Impl.interfaceMethod();
		
		interface1Impl.defaultMethod();
		Interface1.staticMethod();
		
		
	}

}
