// ���� ���� Ÿ��
public class VarArgsTest {

	void printInfo(String...info) { // ���� ���� 
		// ���� ���̷� ���ڸ� ���޹޴� �Ķ���� ������ �迭 ��޵�
		
		for (int i = 0; i < info.length; i++) {
			System.out.println(info[i]);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		VarArgsTest vt = new VarArgsTest();
		
		String test1 = "tes1";
		String test2 = "tes2";
		String test3 = "tes3";
		
		vt.printInfo();
		vt.printInfo(test1);
		vt.printInfo(test1, test2);
		vt.printInfo(test1, test2, test3);
		
		
	}

}
