// �θ� Ŭ�������� ������ ������ �޼ҵ带 �ڽ� Ŭ�������� �������ϸ�
// �θ� Ŭ������ ������ �޼ҵ�� ����ȴ�.

// �������̵��� �����Ǵ� ��Ģ
// 1. ���� Ÿ���� ���ƾ� �Ѵ�.
// 2. ���� �����ڴ� �����ϰų� �� �о�� �Ѵ�. �������� �ȵȴ�.
class Super{
	int money = 10;
	void superMethod() {
		System.out.println("super method");
	}
}

class Sub extends Super{
	// �θ� Ŭ������ superMethod�� Sub��� �ڽ� Ŭ�������� �����Ǹ� �ϰ� �Ǹ�,
	// �θ� Ŭ������ superMethod�� ����ȴ�.
	String money = "30��";
	@Override
	void superMethod() {
		System.out.println("overriding method");
	}
}


public class OverridingTest1 {
	
	public static void main(String[] args) {
		// Override => �������ϴ� ��
		Sub sub = new Sub();
		sub.superMethod();
		// sub.money = 100; => Super��� �θ� Ŭ�������� int money�� ������ ������,
		// Sub��� �ڽ� Ŭ�������� String money�� �����Ǹ� �ؼ� Super�� money�� ���� ����ȴ�.
		sub.money = "100��";
		
	}

}
