
public class Car {
	// �Ӽ�
	String fuelKind;
	String engineKind;
	int weight;
	String color;
	String carName;
	String brand;
	int velocity;
	
	// �޼ҵ�
	// ����Ÿ�� �޼ҵ��(�Ķ���ͺ���) {
	//    ���๮;
	// }
	// �޼ҵ带 ������ �� ȣ���� ������ �ǵ����ִ� ���� ������ 
	// ����Ÿ���� void�� �����ϸ� ��
	
	void run() {
		System.out.println("�޸���.");
	}
	
	void stop() {
		System.out.println("�����.");
	}
	
	void speedUp(int amount) {
		System.out.println("�ӵ��� �ø���.");
		velocity += amount;		
	}
	
	void speedDown(int amount) {
		System.out.println("�ӵ��� �����.");
		velocity -= amount;
	}
	
}
