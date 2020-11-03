package util;

import java.util.Scanner;
import vo.IdolGroupVO;

// �ܼ� �۾��� �ϴ� Ŭ����
public class ConsoleUtil {

	public IdolGroupVO getNewIdolGroupVO(Scanner scanner) {
	
		System.out.println("===== ���̵� �׷� ���� ��� ======");
		System.out.print("���̵� �׷� �̸� : ");
		String name = scanner.next();
		
		System.out.print("���̵� �׷� ���� : ");
		String gender = scanner.next();
		
		System.out.print("���̵� �׷� ���߿��� : ");
		int year = scanner.nextInt();
		
		System.out.print("���̵� �׷� ���� ����  : ");
		int age = scanner.nextInt();
		
		System.out.print("���̵� �׷� ����� : ");
		int memberNumber = scanner.nextInt();
		
		System.out.print("���̵� �׷� �ٹ� : ");
		String album = scanner.next();

		System.out.print("���̵� �׷� �Ҽӻ� : ");
		String company = scanner.next();
		
		IdolGroupVO idolGroupVO = new IdolGroupVO();
		idolGroupVO.setName(name);
		idolGroupVO.setGender(gender);
		idolGroupVO.setYear(year);
		idolGroupVO.setAge(age);
		idolGroupVO.setMemberNumber(memberNumber);
		idolGroupVO.setAlbum(album);
		idolGroupVO.setCompany(company);
			
		return idolGroupVO;
	}

	public void printRegistSuccessMessage(String name) {
		System.out.println("���̵� �׷� " + name + "�� �߰��� �����߽��ϴ�.");
	}

	public void printRegistFailMessage(String name) {
		System.out.println("���̵� �׷� " + name + "�� �߰��� �����߽��ϴ�.");		
	}

	public void printIdolGroupVOList(IdolGroupVO[] idolGroupVOList) {
		if(idolGroupVOList.length == 0) {
			System.out.println("��ϵ� ���̵� �׷��� �����ϴ�.\n");
		}
		
		for (int i = 0; i < idolGroupVOList.length; i++) {
			System.out.println(idolGroupVOList[i].toString());
		}
		
	}

	public String getReadIdolGroupVO(Scanner scanner) {
		
		System.out.println("===== ���̵� �׷�� �˻� =====");
		System.out.print("�˻��� ���̵� �׷�� : ");
		String name = scanner.next();
		return name;
	}
	
	public IdolGroupVO getModifyIdolGroupVO(Scanner scanner) {
		
		System.out.println("===== ������ ���̵� �׷� ���� �Է� ======");
		System.out.print("������ ���̵� �׷� �̸� : ");
		String name = scanner.next();
		IdolGroupVO modifyIdolGroupVO = new IdolGroupVO();
		modifyIdolGroupVO.setName(name);
		
		return modifyIdolGroupVO;
	}

	public void printReadSuccessMessage(IdolGroupVO readidolGroupVO) {
		System.out.println("�˻��� ���� : " + readidolGroupVO.toString() + "\n");
	}

	public void printReadFailMessage() {
		System.out.println("�˻��� ���̵�� �������� �ʽ��ϴ�.\n");
	}

	public void printExitMessage() {
		System.out.println("�̿����ּż� �����մϴ�.\n");
	}

	public void printCheckMessage() {
		System.out.println("1~6���� �Է����ּ���.\n");
	}


	
	
	

}
