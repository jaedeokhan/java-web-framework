
class Parent{ // �θ�
	int parentVar;
	void parentMethod() {
		System.out.println("parent method");
	}
	
}

class Child extends Parent{ // �ڼ�
	int childVar;
	void childMethod() {
		System.out.println("child method");
	}
}

class ChildChild extends Child { // �ڼ��� �ڼ�
	int childChildVar;
	void childChildMethod() {
		System.out.println("childChild method");
	}
}

public class ExtendsTest1 {

	public static void main(String[] args) {
		
		// �ڼ� ��ü Child������ Parent�� ��ӹ޾ұ⿡ Parent�� ������ �޼ҵ带 ����� �� �ִ�.
		Child child = new Child();
		System.out.println(child.parentVar);
		child.parentMethod();
		
		// �ڼ��� �ڼ� ��ü������ Child�� ��ӹް� �ֱ⿡ Child, Parent�� ������ �޼ҵ带 ����� �� �ִ�.
		ChildChild childChild = new ChildChild();
		System.out.println(childChild.parentVar);
		childChild.parentMethod();
		System.out.println(childChild.childVar);
		childChild.childMethod();
		
	}

}

