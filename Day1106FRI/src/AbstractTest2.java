// 추상 클래스(A)가 다른 추상 클래스(B)를 상속받은 경우 
// A클래스를 상속받는 일반 클래스는 B 클래스에서 정의된 추상 메소드도 모두 구현해야한다.
abstract class AbClass1 {
	abstract void abMethod1();
}

abstract class AbClass2 extends AbClass1{
	abstract void abMethod();
}

class GeneralClass extends AbClass2{
	@Override
	void abMethod() {
		// TODO Auto-generated method stub
		
	}@Override
	void abMethod1() {
		// TODO Auto-generated method stub
		
	}
}

public class AbstractTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
