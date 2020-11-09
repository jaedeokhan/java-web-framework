package polymorphism;

class HomeAppliance{
	int price;
}

class Tv extends HomeAppliance{
	@Override
	public String toString() {
		// 문자열로 반환
		return "TV";
	}
	// 자바에서 객체가 print 메소드의 인자로 지정되거나
	// + 연산이 되면 자동으로 해당 객체의 toString() 메소드가 호출된다.
}

class Washer extends HomeAppliance {
	@Override
	public String toString() {
		return "Washer";
	}
}

class AirConditioner extends HomeAppliance{
	@Override
	public String toString() {
		return "AirConditioner";	
		}
}

class Buyer {
	HomeAppliance[] orderListArray = new HomeAppliance[3];
	int index = 0;
	void order(HomeAppliance homeAppliance) {
		orderListArray[index++] = homeAppliance; // index++ 후치를 사용
		System.out.println(homeAppliance + "을 주문했습니다."); 
	}
	
	void showOrderList() {
		String orderList = "";
		for (int i = 0; i < orderListArray.length; i++) {
			orderList += (i == 0) ? orderListArray[i] : "," + orderListArray[i]; 
		}
		System.out.println(orderList);
	}
	
}


public class ParameterPolyTest {

	public static void main(String[] args) {

		Buyer buyer = new Buyer();
		buyer.order(new Tv());
		buyer.order(new Washer());
		buyer.order(new AirConditioner());
		
		// 배열의 다형성을 이용해서 주문 내역을 확인
		buyer.showOrderList();
		
	}

}
