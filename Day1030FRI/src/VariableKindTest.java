
public class VariableKindTest {
	
	int memberVar;
	// 멤버변수(인스턴스변수)
	// 초기화시점 : new 연산자로 객체를 생성할 때 각 객체메다 할당이 된다.
	
	static int staticVar;
	// static 변수(클래스변수)
	// 초기화시점 : JVM이 클래스를 로딩할 때 바로 클래스영역에 초기화됨
	// 객체를 생성하지 않아도 클래스이름으로 바로 접근(사용)이 가능하다.
	
	void instanceMethod1(int paramVar) {
		// 파라미터 변수
		// 특성은 로컬변수와 같다.
		int x = staticVar;
		staticMethod1();
		instanceMethod2(100);
	}
	void instanceMethod2(int paramVar) {
		
	}
	
	static void staticMethod1() {
		VariableKindTest vt =  new VariableKindTest();
		int x = vt.memberVar;
		x = staticVar;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableKindTest vt1 = new VariableKindTest();
		VariableKindTest vt2 = new VariableKindTest();
		vt1.memberVar = 100;
		vt2.memberVar = 200;
		System.out.println("vt1.memberVar => " + vt1.memberVar);
		System.out.println("vt2.memberVar => " + vt2.memberVar);
		System.out.println("staticVar => " + VariableKindTest.staticVar);
		
		// 지역변수
		// 종료되면 자동으로 소멸됨
		// 변수를 선언할 때 값을 할당하지 않으면 컴파일 오류 발생
		int localVar;
		
		int x = 5;
		int y = 6;
		if(x > y) {
			localVar = 100;
		} else {
			localVar = 200;
		}
		
		System.out.println(localVar);
		
		
	}

}
