package workshop;

public class PresentorGenerator {
	public static void main(String[] args) {
		String[] studentArray  =  new String[]{
			"�Ǽ���", "�躴��", "������", "������", "����ȯ",
			"������", "������", "�輺��", "��ȿ��", "�缺��",
			"�����", "����ȭ", "������", "����ȣ", "������",
			"���Ͼᳪ����", "���ö", "������", "�����"
	};
		
		String[] temp = {};
		for (int i = 0; i <= 6; i++) {
			String presentor = studentArray[(int)(Math.random() * 19)];
			temp[i] = presentor;
			System.out.println(temp[i]);
		}
		
		/*
		 * System.out.println(studentArray[(int)(Math.random() * 19)]);
		 * System.out.println((int)(Math.random() * 19));
		 * System.out.println((int)Math.random());
		 */
		
	}
}
