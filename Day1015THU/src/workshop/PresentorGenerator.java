package workshop;

public class PresentorGenerator {
	public static void main(String[] args) {
		String[] studentArray  =  new String[]{
			"�Ǽ���", "�躴��", "������", "������", "����ȯ",
			"������", "������", "�輺��", "��ȿ��", "�缺��",
			"�����", "����ȭ", "������", "����ȣ", "������",
			"���Ͼᳪ����", "���ö", "������", "�����"
	};
		
		String[] temp = new String[7];
		for (int i = 0; i <= 6; i++) {
			String presentor = studentArray[(int)(Math.random() * 19)];
			temp[i] = presentor;
			for (int j = 0; j <= i - 1; j++) {
				while(temp[i] == temp[j]) {
					presentor = studentArray[(int)(Math.random() * 19)];
				}
			}
			System.out.println( (i+1) + "�� : "+ presentor);
			
		}
	}
}
