
public class CarTest {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		// 객체를 생성하면 각 속성의 값은 해당 데이터타입의 기본값으로 자동 할당됨
		System.out.println("myCar.color = " + myCar.color);
		
		myCar.color = "red";
		System.out.println("myCar.color = \"red\"");
		System.out.println("myCar.color = " + myCar.color);
		
		myCar.run();
		myCar.stop();
		
		
		
		

	}

}
