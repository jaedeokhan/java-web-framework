// �ڹٿ��� �ڽ� Ŭ���� ��ü�� �����ڸ� ȣ���ϸ�
// ���� �θ� Ŭ������ �����ڸ� �ڵ����� ȣ���ؼ�
// �θ� Ŭ���� ��ü�� ���� �� �ڽ� ��ü�� �����Ѵ�.
class Parent {
	
	int x ;
	
	public Parent(int x) {
		this.x = x;
		System.out.println("parent constructor");
	}
}

class Child extends Parent{
	
	public Child() {
		// super(); �Ϲ����� super()�� ����ϸ� ������ ����.
		// �ֳ��ϸ�, Parent�� ��ӹް� �ְ�, Parent���� ���ڸ� ������ �ִ� �����ڰ� �ֱ⿡ �ش� �����ڸ� ȣ���ؾ��Ѵ�.
		super(1);
		System.out.println("child constructor");	
		}
}


public class SuperConstructorTest {
	
	public static void main(String[] args) {
		
		Child child = new Child();
		
	}

}
