
public class Car {
	// 속성
	String fuelKind;
	String engineKind;
	int weight;
	String color;
	String carName;
	String brand;
	int velocity;
	
	// 메소드
	// 리턴타입 메소드명(파라미터변수) {
	//    실행문;
	// }
	// 메소드를 실행한 후 호출한 쪽으로 되돌려주는 값이 없으면 
	// 리턴타입은 void로 지정하면 됨
	
	void run() {
		System.out.println("달린다.");
	}
	
	void stop() {
		System.out.println("멈춘다.");
	}
	
	void speedUp(int amount) {
		System.out.println("속도를 올린다.");
		velocity += amount;		
	}
	
	void speedDown(int amount) {
		System.out.println("속도를 낮춘다.");
		velocity -= amount;
	}
	
}
