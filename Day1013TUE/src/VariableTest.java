// ���� : �ڹٿ��� �ʿ��� ���� ������ �� �ִ� ����
// ������ �����ϸ� JVM�� Stack������ �ش� ���� ������ �����
// �ش� ���� ������ ���� �Ҵ��ϰ� �ʿ��� �� ������ ����� �� �ִ�.
public class VariableTest {
	public static void main(String[] args) {
		// ���� ������
		// ������Ÿ�� �����̸� = ��;
		int kor = 90;
		int math = 1;
		int eng = 90;
		
		System.out.println("kor = " + kor);
		System.out.println("math = " + math);
		System.out.println("eng = " + eng);
		
		// ����
		int total = kor + math + eng;
		System.out.println("total = " + total);
		
		// ���
		int avg = total / 3;
		System.out.println("avg = " + avg);
		
	}
}
