// this()

// �䱸����
// ������� �����ϴ� Ŭ������ �����϶�
// �Ӽ� : �̸�, ����
// ���� : �̸��� �ʱ�ȭ���� �ʾҾ����� ���� �����϶�
// 		  ������ �ʱ�ȭ���� ������ 800������ �����϶�
class Drink {
	String drink;
	int price;
	
	public Drink(String drink) {
		this(drink, 800);
	}
	
	public Drink(int price) {
		this("��", price);
	}
	
	public Drink(String drink, int price) {
		this.drink = drink;
		this.price = price;
	}

	public Drink() {
//		System.out.println("�̷��� this() ������ �������� ������� ���Ѵ�.");
		this("��", 800);
	}
}

public class ThisConstructorTest {
	
	public static void main(String[] args) {
		
		
		
		
	}

}
