class Data{
	int x;
	int y;
	static void day() {
	}
	
	void addPriv(int x, int y) {
		x += 100;
		y += 100;
	}
	
	void addObj(Data data) {
		data.x += 100;
		data.y += 100;
	}
	
	void addRef(Data data) {
		data = null;
		//레퍼런스 변수에 유일하게 할당할 수 있는 상수값은 null
		
	}
}

public class ArgsTest {
	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Data data = new Data();
		data.x = 40;
		data.y = 30;
		
		data.addPriv(data.x, data.y);
		System.out.println("addPriv method =>");
		System.out.println("data.x = " + data.x);
		System.out.println("data.x = " + data.y);
		
		data.addObj(data);
		System.out.println("addObj method =>");
		System.out.println("data.x = " + data.x);
		System.out.println("data.x = " + data.y);
		
		data.addRef(data);
		System.out.println("addRef method =>");
		System.out.println("data.x = " + data.x);
		System.out.println("data.x = " + data.y);
		
	}

}
