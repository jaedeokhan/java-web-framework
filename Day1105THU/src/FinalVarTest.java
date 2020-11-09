class FinalClass{
	final int x;
	// static이 지정되지 않은 상수 => 인스턴스 상수

	public FinalClass(int x) {
		this.x = x;
	}
	
	static final int y = 100;
	// static 상수
	// 클래스 전체에서 공유되는 사웃
	// 따라서, 일반적으로 상수를 정의할 때 바로 값을 할당
	
}


public class FinalVarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalClass finalClass1 = new FinalClass(10);
		FinalClass finalClass2 = new FinalClass(20);
		
		// finalClass1.x = 90; => 이와 같이 상수는 변경할 수 없다.
		System.out.println(finalClass1.y);
		System.out.println(finalClass2.y);
		System.out.println(FinalClass.y); // 클래스의 이름으로 상수값을 바로 접근이 가능하다.
	
	}

}
