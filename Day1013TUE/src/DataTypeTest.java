
public class DataTypeTest {
	public static void main(String[] args) {
		
		// 정수형
		// 2의 7승 == 128 - 1
		byte byte1 = 127;
		short byte2 = 128;
		
		// 진법
		// 8진수 : 숫자 앞에 '0'을 붙여준다.
		// 16진수 : 숫자 앞에 '0X'을 붙여준다.
		int Deci = 10;     // 10진수
		int Oct = 010;     // 8진수
		int Oct1 = 011;		
		int Oct2 = 021; 
		int HeX = 0X11;    // 16진수
		int Hex2 = 0X12;  
		int Hex0 = 0X01; 
		int Bina = 0B0011; // 2진수
		
		System.out.println("Deci : " + Deci);
		System.out.println("Oct : " + Oct);
		System.out.println("Oct1 : " + Oct1);
		System.out.println("Oct2 : " + Oct2);
		System.out.println("HeX : " + HeX);
		System.out.println("Hex2 : " + Hex2);
		System.out.println("Hex0 : " + Hex0);
		System.out.println("Bina : " + Bina);
		
		// 자릿수 별로 값 지정해서 할당하기
		// 1.7 이상
		long longNumber = 123_123_123_123l;
		System.out.println("longNumber = " + longNumber);
		
		int binaryLiteral = 0B1111_0000_1010_0000;
		System.out.println("binaryLiteral = " + binaryLiteral);
		
		// 동시에 여러개의 변수 선언
		int x, y, z;
		
		long l2 = 10000;
		
		// L 접미사는 해당 숫자가 long 타입입을 임의적으로 지정할 때 사용
		long l3 = 100000 * 100000;
		long l4 = 100000 * 100000L;
		System.out.println("l3 = " + l3);
		System.out.println("l4 = " + l4);
		
		// 문자타입(char)
		char han = '한';
		System.out.println("han = " + han);
		
		// char 타입의 변수에 숫자를 할당하면 문자코드로 인식됨
		char english = 0X0041; // 16 x 4 + 1 == 65
		System.out.println("english = " + english);
		System.out.println("english = " + (int)english);
		
		// 일본어
		char japaness = 0X3055;
		System.out.println("japaness = " + japaness);
		System.out.println("japaness = " + (int)japaness);
		
		// 논리값 (Boolean)
		// true, false
		boolean boo1 = false;
		System.out.println("boo1 : " + boo1);
		
		// 실수형
		// 실수형의 기본 타입은 double이다.
		float f1 = 3.14F;
		float f2 = (float)3.14;
		System.out.println("f1 : " + f1);
		System.out.println("f2 : " + f2);
		
	}
}
