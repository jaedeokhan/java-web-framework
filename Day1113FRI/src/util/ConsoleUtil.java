package util;

import java.util.ArrayList;
import java.util.Scanner;

import vo.IdolGroupVO;

// �ܼ� �۾��� �ϴ� Ŭ����
public class ConsoleUtil {

	public IdolGroupVO getNewIdolGroupVO(Scanner scanner) {
		
		// 1
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
		System.out.println("���̵� �׷� " + name + " ����� �����߽��ϴ�.");
	}

	public void printRegistFailMessage(String name) {
		System.out.println("���̵� �׷� " + name + " ����� �����߽��ϴ�.");		
	}
	
	// 2
	public void printIdolGroupVOList(ArrayList<IdolGroupVO> idolGroupVOList) {
		if(idolGroupVOList.size() == 0) {
			System.out.println("��ϵ� ���̵� �׷��� �����ϴ�.\n");
		}
		else {
			for (int i = 0; i < idolGroupVOList.size(); i++) {
				System.out.println(idolGroupVOList.get(i).toString());
			}
			System.out.println();
		}
	}

	// 3
	public String getName(Scanner scanner) {
		System.out.println("===== ���̵� �׷�� �Է��ϱ� =====");
		System.out.print("���̵� �׷�� �Է� : ");
		String name = scanner.next();
		return name;
	}


	public void printReadSuccessMessage(IdolGroupVO readidolGroupVO) {
		System.out.println("�˻��� ���� : " + readidolGroupVO.toString() + "\n");
	}
	
	// 4
	public IdolGroupVO getModifyIdolGroupVO(IdolGroupVO oldIdolGroupVO, Scanner scanner) {
		
		System.out.println("===== ���̵� �׷� ���� ���� ======");
		
		System.out.println("���� ���̵� �׷� ���� : " + oldIdolGroupVO.getGender());
		System.out.print("������ ���̵� �׷� ���� : ");
		String gender = scanner.next();
		
		System.out.println("���� ���̵� �׷� ���߿��� : " + oldIdolGroupVO.getYear());
		System.out.print("������ ���̵� �׷� ���߿��� : ");
		int year = scanner.nextInt();
		
		System.out.println("���� ���̵� �׷� ���� ���� : " + oldIdolGroupVO.getAge());
		System.out.print("������ ���̵� �׷� ���� ����  : ");
		int age = scanner.nextInt();
		
		System.out.println("���� ���̵� �׷� ����� : " + oldIdolGroupVO.getMemberNumber());
		System.out.print("������ ���̵� �׷� ����� : ");
		int memberNumber = scanner.nextInt();
		
		System.out.println("���� ���̵� �׷� �ٹ� : " + oldIdolGroupVO.getAlbum());
		System.out.print("������ ���̵� �׷� �ٹ� : ");
		String album = scanner.next();

		System.out.println("���� ���̵� �׷� �Ҽӻ� : " + oldIdolGroupVO.getCompany());
		System.out.print("������ ���̵� �׷� �Ҽӻ� : ");
		String company = scanner.next();
		
		IdolGroupVO modifyIdolGroupVO = new IdolGroupVO();
		modifyIdolGroupVO.setName(oldIdolGroupVO.getName());
		modifyIdolGroupVO.setGender(gender);
		modifyIdolGroupVO.setYear(year);
		modifyIdolGroupVO.setAge(age);
		modifyIdolGroupVO.setMemberNumber(memberNumber);
		modifyIdolGroupVO.setAlbum(album);
		modifyIdolGroupVO.setCompany(company);
			
		return modifyIdolGroupVO;
	}
	
	public void printisNotExistNamelMessage(String name) {
		System.out.println(name + "���̵�� �������� �ʽ��ϴ�.\n");
		
	}
	
	public void printModifySuccessMessage(IdolGroupVO modifyIdolGroupVO) {
		System.out.println(modifyIdolGroupVO.getName() + "�� �׷��� ������ ���������� ������ �Ǿ����ϴ�.");
		System.out.println(modifyIdolGroupVO.toString());
	}
	
	
	public void printFailMessage(String message) {
		System.out.println(message + " �����߽��ϴ�.");
	}
	
	// 5
public void printDeleteSuccessMessage(String name) {
	System.out.println(name + "�� ������ �����߽��ϴ�.");
}



public void printExitMessage() {
	System.out.println("�̿����ּż� �����մϴ�.\n");
}


public void printCheckMessage() {
	System.out.println("1~6���� �Է����ּ���.\n");
}


}
