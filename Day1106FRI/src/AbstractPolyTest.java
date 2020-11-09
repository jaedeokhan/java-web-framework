
abstract class Vehicle{
	abstract void transfer();
}

class Car extends Vehicle{
	@Override
	void transfer() {
		System.out.println("������ ������.");
	}
}

class Ship extends Vehicle{
	@Override
	void transfer() {
		System.out.println("���η� ������.");
	}
}
class Plane extends Vehicle{
	@Override
	void transfer() {
		System.out.println("������ ������.");
	}
}

class VehicleInfo{
	
	void showTransferStyle(Vehicle vehicle) {
		vehicle.transfer();
	}
	
}

public class AbstractPolyTest {

	public static void main(String[] args) {
		
		VehicleInfo vehicleInfo = new VehicleInfo();
		vehicleInfo.showTransferStyle(new Car());
		vehicleInfo.showTransferStyle(new Ship());
		vehicleInfo.showTransferStyle(new Plane());

	}

}
