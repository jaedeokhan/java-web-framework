// 인터페이스끼리는 다중 상속이 가능하다.
interface In1 {
	int x = 10;
	void in1Method();
	
}
interface In2 {
	int x = 20;
	void in1Method();
	void in2Method();
}
interface In3 extends In1, In2 {
}

class In3Impl implements In3 {
	@Override
	public void in1Method() {
		// TODO Auto-generated method stub
		
	}@Override
	public void in2Method() {
		// TODO Auto-generated method stub
		
	}
}




public class InterfaceTest2 {
	
	public static void main(String[] args) {
			
		In3Impl in3Impl = new In3Impl();
		in3Impl.in1Method();
		in3Impl.in2Method();
		
	}
}
