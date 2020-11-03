// this 
// 일반적으로 쓸일이 없다.
// 클래스안에서 자원을 사용할 때는 자동으로 this가 들어가 있다.
// 단, 파라미터 변수명과 멤버 변수명이 동일할 때는
// 파라미터 변수가 우선 인식되기 때문에
// 멤버변수임을 지정하려면 this를 붙여야 한다.
public class ThisTest {

	int x;
	
	public ThisTest(int x) {
		this.x = x;
	}
	
	void printInfo() {
		int y = x;
	}
	
	void pringInfo1() {
//		this.pringInfo1();
		printInfo();
	}
	
	public static void main(String[] args) {
		 
		ThisTest thisTest = new ThisTest(10);
		System.out.println(thisTest.x);
		
	}

}
