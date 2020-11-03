// 생성자는 주로 멤버변수값을 초기화시키는 용도로 사용한다.
public class ConstructorTest {
	int value;
	
	public ConstructorTest(int value) {
		this.value = value;
	}
	
	public ConstructorTest() {
		
	}
	
	public static void main(String[] args) {

		
		// 1. 기본 생성자 이외에 정의를 하지 않으면, 자동으로 기본 생성자가 생성이 된다.
		int value = 0;
		ConstructorTest constructorTest01 = new ConstructorTest();
		ConstructorTest constructorTest02 = new ConstructorTest(value);

		
	}

}
