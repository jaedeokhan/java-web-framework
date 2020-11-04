// 부모 클래스에서 선언한 변수와 메소드를 자식 클래스에서 재정의하면
// 부모 클래스의 변수와 메소드는 은폐된다.

// 오버라이딩의 성립되는 규칙
// 1. 리턴 타입이 같아야 한다.
// 2. 접근 제한자는 동일하거나 더 넓어야 한다. 좁아지면 안된다.
class Super{
	int money = 10;
	void superMethod() {
		System.out.println("super method");
	}
}

class Sub extends Super{
	// 부모 클래스의 superMethod를 Sub라는 자식 클래스에서 재정의를 하게 되면,
	// 부모 클래스의 superMethod는 은폐된다.
	String money = "30원";
	@Override
	void superMethod() {
		System.out.println("overriding method");
	}
}


public class OverridingTest1 {
	
	public static void main(String[] args) {
		// Override => 재정의하는 것
		Sub sub = new Sub();
		sub.superMethod();
		// sub.money = 100; => Super라는 부모 클래스에서 int money로 선언을 했지만,
		// Sub라는 자식 클래스에서 String money로 재정의를 해서 Super의 money의 값은 은폐된다.
		sub.money = "100원";
		
	}

}
