
public class CarTest {

	public static void main(String[] args) {
		
		Car myCar = new Car();
		// ��ü�� �����ϸ� �� �Ӽ��� ���� �ش� ������Ÿ���� �⺻������ �ڵ� �Ҵ��
		System.out.println("myCar.color = " + myCar.color);
		
		myCar.color = "red";
		System.out.println("myCar.color = \"red\"");
		System.out.println("myCar.color = " + myCar.color);
		
		myCar.run();
		myCar.stop();
		
		
		
		

	}

}
