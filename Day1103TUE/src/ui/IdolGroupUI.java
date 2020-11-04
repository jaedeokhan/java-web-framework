package ui;

import java.util.Scanner;

import service.IdolGroupService;
import util.ConsoleUtil;
import vo.IdolGroupVO;

public class IdolGroupUI {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter(System.getProperty("line.separator"));
		boolean stop = false;
		ConsoleUtil consoleUtil = new ConsoleUtil(); 
		IdolGroupService idolGroupService = new IdolGroupService();
		
		do {
			System.out.println("=====���̵� �׷� ����=====");
			System.out.println("1. ���̵� �׷� �߰�");
			System.out.println("2. ���̵� �׷� ��Ϻ���");
			System.out.println("3. ���̵� �׷� ��������");
			System.out.println("4. ���̵� �׷� ����");
			System.out.println("5. ���̵� �׷� ����");
			System.out.println("6. ���α׷� ����");
			System.out.print("�޴� ��ȣ �Է�>");
			String name = null;
			int menuNumber = scanner.nextInt();
			
			switch (menuNumber) {
			case 1: // ���̵� �׷� �߰�
				IdolGroupVO newIdolGroupVO = consoleUtil.getNewIdolGroupVO(scanner);
				boolean registSuccess = idolGroupService.registNewIdolGroupVO(newIdolGroupVO);
				if(registSuccess) {
					consoleUtil.printRegistSuccessMessage(newIdolGroupVO.getName());
				} else {
					consoleUtil.printRegistFailMessage(newIdolGroupVO.getName());
				}
				break;
			case 2: // ���̵� �׷� ��Ϻ���
				IdolGroupVO[] idolGroupVOList = idolGroupService.getIdolGroupVOList();
				consoleUtil.printIdolGroupVOList(idolGroupVOList);
				break;
			case 3: // ���̵� �׷� ��������
				// �޼ҵ�� ���� getReadIdolGroupVO => getName���� ����
				name = consoleUtil.getName(scanner);
				IdolGroupVO readidolGroupVO = idolGroupService.readIdolGroupVO(name);
				if(readidolGroupVO != null) {
					consoleUtil.printReadSuccessMessage(readidolGroupVO);
				} else {
					consoleUtil.printFailMessage("���̵� �׷� ���� ���⸦");
				};
				break;
			case 4: // ���̵� �׷� ��������
				name = consoleUtil.getName(scanner);
				boolean isExistName = idolGroupService.getIsExistName(name);
				if(isExistName) { // ���̵� �����ϴ� ���
					IdolGroupVO oldIdolGroupVO = idolGroupService.getOldIdolGroupVO(name);
					IdolGroupVO modifyIdolGroupVO =  consoleUtil.getModifyIdolGroupVO(oldIdolGroupVO, scanner);
					boolean modifySuccess = idolGroupService.modifyIdolGroupVO(modifyIdolGroupVO);
					if(modifySuccess) {
						consoleUtil.printModifySuccessMessage(modifyIdolGroupVO);
					} else {
						consoleUtil.printFailMessage("���̵� �׷� ���� ������");
					}
				} else { // ���̵� �������� �ʴ� ��� 
					consoleUtil.printisNotExistNamelMessage(name);
				}
				break;
		case 5: // ���̵� �׷� ����
			name = consoleUtil.getName(scanner);
			isExistName = idolGroupService.getIsExistName(name);
			if(isExistName) { // ���̵� �����ϴ� ���
				boolean removeSuccess = idolGroupService.removeIdolGroupVO(name);
				if(removeSuccess) {
					consoleUtil.printDeleteSuccessMessage(name);
				} else {
					consoleUtil.printFailMessage("���̵� �׷� ���� ������");
				}
			} else {
				consoleUtil.printisNotExistNamelMessage(name);
			}
			
			break;
case 6: // ���α׷� ����
	consoleUtil.printExitMessage();
	stop = true;
	break;
	
default: // �ٸ� ��ȣ�϶� ����ó��
	consoleUtil.printCheckMessage();
	break;
}
			
			
			
			
		} while(!stop);

	}

}
