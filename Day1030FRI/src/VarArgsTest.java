// 가변 인자 타입
public class VarArgsTest {

	void printInfo(String...info) { // 가변 인자 
		// 가변 길이로 인자를 전달받는 파라미터 변수는 배열 취급됨
		
		for (int i = 0; i < info.length; i++) {
			System.out.println(info[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		VarArgsTest vt = new VarArgsTest();
		
		String test1 = "tes1";
		String test2 = "tes2";
		String test3 = "tes3";
		
		vt.printInfo();
		vt.printInfo(test1);
		vt.printInfo(test1, test2);
		vt.printInfo(test1, test2, test3);
		
		
	}

}
