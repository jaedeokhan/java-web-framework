// 초기화 블록
public class BlockTest {
	static {
		// static 초기화 블록
		// 클래스가 로딩될 때 단 한 번만 실행되는 영역
		System.out.println("static{ }");
	}
	{
		// 인스턴스 초기화 블록
		// 객체가 생성될때 마다 생성자보다 먼저 실행되는 영역
		// 따라서, 객체가 생성될때마다 반복적으로 수행해야 하는 작업을 정의함
		System.out.println("{ }");
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("BlockTest blockTest01 = new BlockTest()");
		BlockTest blockTest01 = new BlockTest();
		
		System.out.println("BlockTest blockTest02 = new BlockTest()");
		BlockTest blockTest02 = new BlockTest();
	}

}
