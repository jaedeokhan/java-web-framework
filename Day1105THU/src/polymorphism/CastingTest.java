package polymorphism;

public class CastingTest {

	public static void main(String[] args) {
		
		// 다형성을 사용하지 않는 경우
		President president = new President();
		
		// Casting이 발생하는 경우
		// 1. 부모 클래스 타입의 래퍼런스 변수가 자식 클래스 타입의 레퍼런스 값을 참조하는 경우
		// 즉, 부모 클래스가 자식 클래스 타입의 레퍼런스 변수 값을 할당받는 경우
		// 할당되는 레퍼런스 값의 데이터 타입이 자동으로 부모 클래스 타입으로 캐스팅되어(Upcasting) 되어 할당이 된다.
		// 자식을 부모에 넣으면 자동으로 Upcasting이 된다.
		Person person = president;
		
		
//		President president2 = person; => 다음과 같이 컴파일 오류가 발생해서 명시적으로 다운 캐스팅한다.
		President president2 = (President) person;
	
//		Student student = (Student)(new Employee()); => 형제 클래스들끼리는 아무 관계가 없기에 캐스팅을 못한다.
		
		// 자바에서는 부모 클래스 레퍼런스 변수가 자식 클래스 객체를 참조할수는 있어도, 
		// 자식 클래스 타입의 레퍼런스 변수가 부모 객체를 참조할 수 없다.
		Person person3 = new Person();
		if(person3 instanceof President) {
			President president3  = (President)person3; 
		} else {
			System.out.println("다운 캐스팅 불가");
			System.out.println("여기");
		}
		
		// instanceof 연산자를 이용해서 다운 캐스팅을 할 수 있는 객체인지 판단해서 진행한다.
		if(person instanceof President) {
			President president4 = (President) person; // 여기서는 가능하다. person은 이밎 15행에서 president를 참조하고 있기 때문이다.
		} else {
			System.out.println("다운 캐스팅 불가");
		}
		
		// 부모 클래스에서 정의된 메소드를 자식 클래스에서 재정의했고, 
		// 부모 클래스 타입의 레퍼런스 변수로 
		// 재정의된 메소드에 접근하면 항상 재정의된 메소드가 호출된다.
		// 즉, 자바에서 호출되는 메소드는 런타임시 결정된다.
		// 즉, 메소드의 다형성이 지원된다.
		Person person4 = new Student();
		person4.showSleepingStyle(); 
		person4 = new Employee();
		person4.showSleepingStyle();
		person4 = new President();
		person4.showSleepingStyle();
	
		// 부모 클래스에서 정의된 변수는 자식 클래스에서 재정의했고, 
		// 부모 클래스 타입의 레퍼런스 변수로 
		// 재정의된 변수에 접근하면 레퍼런스변수 타입에 따라서 호출되는 변수가 결정된다.
		// 즉, 자바에서 호출되는 변수는 컴파일 타임에 결정된다.
		// 즉, 변수의 다형성이 지원이 되지 않는다.
		
		Person person5 = new Employee();
		System.out.println(person5.x);
		
		Employee employee1 = (Employee) person5;
		System.out.println(employee1.x);
		
		// 다운 캐스팅을 해야하는 이유는?
		Person person6 = new Student();
        // person6.study(); => 사용해야할 메소드가 부모에는 존재하지 않고, 
		// 자식 객체에만 존재한다면 다운 캐스팅을 해줘야 한다.
		
		Student student = (Student)person6;
		student.study();
		
	
	}

}
