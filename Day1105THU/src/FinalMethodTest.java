// 메소드 앞에 final이 지정되면
// 메소드를 재정의할 수 없다.
class MethodSuper{
	final void superMethod() {
		System.out.println("super method");
	}
}

class MethodChild extends MethodSuper{
//	@Override
//	void superMethod() { => 부모 클래스의 메소드를 final로 선언하면 재정의가 불가능하다.
//	}
}

public class FinalMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
