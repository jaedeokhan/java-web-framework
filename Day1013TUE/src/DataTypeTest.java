
public class DataTypeTest {
	public static void main(String[] args) {
		
		// ������
		// 2�� 7�� == 128 - 1
		byte byte1 = 127;
		short byte2 = 128;
		
		// ����
		// 8���� : ���� �տ� '0'�� �ٿ��ش�.
		// 16���� : ���� �տ� '0X'�� �ٿ��ش�.
		int Deci = 10;     // 10����
		int Oct = 010;     // 8����
		int Oct1 = 011;		
		int Oct2 = 021; 
		int HeX = 0X11;    // 16����
		int Hex2 = 0X12;  
		int Hex0 = 0X01; 
		int Bina = 0B0011; // 2����
		
		System.out.println("Deci : " + Deci);
		System.out.println("Oct : " + Oct);
		System.out.println("Oct1 : " + Oct1);
		System.out.println("Oct2 : " + Oct2);
		System.out.println("HeX : " + HeX);
		System.out.println("Hex2 : " + Hex2);
		System.out.println("Hex0 : " + Hex0);
		System.out.println("Bina : " + Bina);
		
		// �ڸ��� ���� �� �����ؼ� �Ҵ��ϱ�
		// 1.7 �̻�
		long longNumber = 123_123_123_123l;
		System.out.println("longNumber = " + longNumber);
		
		int binaryLiteral = 0B1111_0000_1010_0000;
		System.out.println("binaryLiteral = " + binaryLiteral);
		
		// ���ÿ� �������� ���� ����
		int x, y, z;
		
		long l2 = 10000;
		
		// L ���̻�� �ش� ���ڰ� long Ÿ������ ���������� ������ �� ���
		long l3 = 100000 * 100000;
		long l4 = 100000 * 100000L;
		System.out.println("l3 = " + l3);
		System.out.println("l4 = " + l4);
		
		// ����Ÿ��(char)
		char han = '��';
		System.out.println("han = " + han);
		
		// char Ÿ���� ������ ���ڸ� �Ҵ��ϸ� �����ڵ�� �νĵ�
		char english = 0X0041; // 16 x 4 + 1 == 65
		System.out.println("english = " + english);
		System.out.println("english = " + (int)english);
		
		// �Ϻ���
		char japaness = 0X3055;
		System.out.println("japaness = " + japaness);
		System.out.println("japaness = " + (int)japaness);
		
		// ���� (Boolean)
		// true, false
		boolean boo1 = false;
		System.out.println("boo1 : " + boo1);
		
		// �Ǽ���
		// �Ǽ����� �⺻ Ÿ���� double�̴�.
		float f1 = 3.14F;
		float f2 = (float)3.14;
		System.out.println("f1 : " + f1);
		System.out.println("f2 : " + f2);
		
	}
}
