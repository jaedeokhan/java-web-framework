// �޼ҵ� �տ� final�� �����Ǹ�
// �޼ҵ带 �������� �� ����.
class MethodSuper{
	final void superMethod() {
		System.out.println("super method");
	}
}

class MethodChild extends MethodSuper{
//	@Override
//	void superMethod() { => �θ� Ŭ������ �޼ҵ带 final�� �����ϸ� �����ǰ� �Ұ����ϴ�.
//	}
}

public class FinalMethodTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
