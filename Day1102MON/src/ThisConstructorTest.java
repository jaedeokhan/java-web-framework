// this()

// 요구사항
// 음료수를 정의하는 클래스를 정의하라
// 속성 : 이름, 가격
// 조건 : 이름이 초기화되지 않았았으면 물로 정의하라
// 		  가격이 초기화되지 않으면 800원으로 정의하라
class Drink {
	String drink;
	int price;
	
	public Drink(String drink) {
		this(drink, 800);
	}
	
	public Drink(int price) {
		this("물", price);
	}
	
	public Drink(String drink, int price) {
		this.drink = drink;
		this.price = price;
	}

	public Drink() {
//		System.out.println("이렇게 this() 생성자 위에서는 사용하지 못한다.");
		this("물", 800);
	}
}

public class ThisConstructorTest {
	
	public static void main(String[] args) {
		
		
		
		
	}

}
