// ����ȯ
public class ConversionTest {
	public static void main(String[] args) {
		// 1. ������ ���� �Ҵ��� ���� ����ȯ ��Ģ
		// 1-1. ������ ������ ������ Ÿ�Ժ��� ���� ������ Ÿ���� ���� ������ �Ҵ��ϴ� ���
		// ������ �Ҵ��ϴ� ���
		// ������ ���� ������Ÿ���� �ڵ����� ���� ������ ������ Ÿ������ ����ȯ�Ǿ� �Ҵ��
		byte soju125 = 127;
		int beer500 = soju125;
		long beer1000 = beer500;
		
		// 1-2. ������ ������ ������ Ÿ�Ժ��� ū ������Ÿ���� ���� ������ �Ҵ��ϴ� ���
		// ������ �Ҵ��ϴ� ���
		// ������ ���� �߻�
		// ����(ĳ����) �����ڸ� ����ؼ� ��������� ���� ������ ������ Ÿ������ ����ȯ�ؾ���
		// ����ȯ�ؾ���
		long beer1 = 300;
		int soju1 = (int)beer1;
		System.out.println("soju1 : " + soju1);
		
		// ��, �� �ս��� ����� �������� ����ȯ�ؾ� �Ѵ�.
		int beer2 = 300;
		byte soju2 = (byte)beer2;
		System.out.println("soju2 : " + soju2);
		
		// ������ Ÿ���� ũ�⿡ ������� �Ǽ� Ÿ���� �����ʹ� ���� Ÿ�Կ� �Ҵ��� �� ����.
		// long l6 = 1000000000000000000000000000000000000000; => error
		double d5 = 10000000000000000000000000000000000000d;
		
		long l6 = (long)2.4f;
		
		float f6 = l6;
		
		// 2. ����� ����ȯ  ��Ģ
		System.out.println("======================= ����� ����ȯ =========================");
		
		// 2-1. �ǿ����� �� �� ū ������ Ÿ������ ����ȯ�Ǿ� ����ȴ�.
		int soju3 = 20;
		long beer3 = 100;
		// int result_tong1 = soju3 + beer3; // ������ �ؼ� 
		int result_tong2 = (int)(soju3 + beer3);
		System.out.println("result_tong : " + result_tong2);
		
		// 2-2. �Ǽ� Ÿ�԰� ���� Ÿ���� ����Ǹ� ������ Ÿ���� ũ��� �����ϰ� ������ �Ǽ� Ÿ������ ����ȯ��
		long l8 = 1000;
		float f8 = 4.1f;
		float result_l8_f8 = l8 + f8;
		System.out.println("result_l8_f8 : " + result_l8_f8);
		
		// 2-3. int������ ���� ���� Ÿ���� ������ Ÿ��
		// byte, short, char�� �����ϸ� ������ int������ ��ȯ�Ǿ� �����
		byte b4 = 8;
		short s4 = 10;
		// short result_b4_s4 = b4 + s4; // byte�� short�� ������ int���� �Ǳ⿡ short���� ���� ���Ѵ�.
		int result_b4_s4 = b4 + s4;
		System.out.println("result_b4_s4 : " + result_b4_s4);
		
		char c1 = 'A';
		int i7 = c1 + 1;
		System.out.println("c1 + 1 = " + i7);
		
		
		
	}
}
