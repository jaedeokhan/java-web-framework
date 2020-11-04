
class Parent{ // 부모
	int parentVar;
	void parentMethod() {
		System.out.println("parent method");
	}
	
}

class Child extends Parent{ // 자손
	int childVar;
	void childMethod() {
		System.out.println("child method");
	}
}

class ChildChild extends Child { // 자손의 자손
	int childChildVar;
	void childChildMethod() {
		System.out.println("childChild method");
	}
}

public class ExtendsTest1 {

	public static void main(String[] args) {
		
		// 자손 개체 Child에서는 Parent를 상속받았기에 Parent의 변수와 메소드를 사용할 수 있다.
		Child child = new Child();
		System.out.println(child.parentVar);
		child.parentMethod();
		
		// 자손의 자손 개체에서는 Child를 상속받고 있기에 Child, Parent의 변수와 메소드를 사용할 수 있다.
		ChildChild childChild = new ChildChild();
		System.out.println(childChild.parentVar);
		childChild.parentMethod();
		System.out.println(childChild.childVar);
		childChild.childMethod();
		
	}

}

