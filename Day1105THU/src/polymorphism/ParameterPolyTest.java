package polymorphism;

class HomeAppliance{
	int price;
}

class Tv extends HomeAppliance{
	@Override
	public String toString() {
		// ���ڿ��� ��ȯ
		return "TV";
	}
	// �ڹٿ��� ��ü�� print �޼ҵ��� ���ڷ� �����ǰų�
	// + ������ �Ǹ� �ڵ����� �ش� ��ü�� toString() �޼ҵ尡 ȣ��ȴ�.
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
		orderListArray[index++] = homeAppliance; // index++ ��ġ�� ���
		System.out.println(homeAppliance + "�� �ֹ��߽��ϴ�."); 
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
		
		// �迭�� �������� �̿��ؼ� �ֹ� ������ Ȯ��
		buyer.showOrderList();
		
	}

}
