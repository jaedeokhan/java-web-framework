// 자바에서 자식 클래스 객체의 생성자를 호출하면
// 먼저 부모 클래스의 생성자를 자동으로 호출해서
// 부모 클래스 객체를 만든 후 자식 객체를 생성한다.
class Parent {
	
	int x ;
	
	public Parent(int x) {
		this.x = x;
		System.out.println("parent constructor");
	}
}

class Child extends Parent{
	
	public Child() {
		// super(); 일반적인 super()를 사용하면 에러가 난다.
		// 왜냐하면, Parent를 상속받고 있고, Parent에는 인자를 가지고 있는 생성자가 있기에 해당 생성자를 호출해야한다.
		super(1);
		System.out.println("child constructor");	
		}
}


public class SuperConstructorTest {
	
	public static void main(String[] args) {
		
		Child child = new Child();
		
	}

}
