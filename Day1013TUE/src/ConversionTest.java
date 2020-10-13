// 형변환
public class ConversionTest {
	public static void main(String[] args) {
		// 1. 변수에 값을 할당할 때의 형변환 규칙
		// 1-1. 좌측의 변수의 데이터 타입보다 작은 데이터 타입의 값을 변수에 할당하는 경우
		// 변수에 할당하는 경우
		// 우측의 값의 데이터타입이 자동으로 좌측 변수의 데이터 타입으로 형변환되어 할당됨
		byte soju125 = 127;
		int beer500 = soju125;
		long beer1000 = beer500;
		
		// 1-2. 좌측의 변수의 데이터 타입보다 큰 데이터타입의 값을 변수에 할당하는 경우
		// 변수에 할당하는 경우
		// 컴파일 에러 발생
		// 강제(캐스팅) 연산자를 사용해서 명시적으로 좌측 변수의 데이터 타입으로 형변환해야함
		// 형변환해야함
		long beer1 = 300;
		int soju1 = (int)beer1;
		System.out.println("soju1 : " + soju1);
		
		// 단, 값 손실의 우려가 없을때만 형변환해야 한다.
		int beer2 = 300;
		byte soju2 = (byte)beer2;
		System.out.println("soju2 : " + soju2);
		
		// 데이터 타입의 크기에 상관없이 실수 타입의 데이터는 정수 타입에 할당할 수 없다.
		// long l6 = 1000000000000000000000000000000000000000; => error
		double d5 = 10000000000000000000000000000000000000d;
		
		long l6 = (long)2.4f;
		
		float f6 = l6;
		
	}
}
