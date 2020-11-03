package ui;

import java.util.Scanner;

import service.IdolGroupService;
import util.ConsoleUtil;
import vo.IdolGroupVO;

public class IdolGroupUI {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
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
				String name = consoleUtil.getReadIdolGroupVO(scanner);
				IdolGroupVO readidolGroupVO = idolGroupService.readIdolGroupVO(name);
				if(readidolGroupVO != null) {
					consoleUtil.printReadSuccessMessage(readidolGroupVO);
				} else {
					consoleUtil.printReadFailMessage();
				}
				break;
			case 4: // ���̵� �׷� ��������
				IdolGroupVO modifyIdolGroupVO = consoleUtil.getModifyIdolGroupVO(scanner);
				boolean isModifyGroupName = idolGroupService.modifyIdolGroupVO(modifyIdolGroupVO);
				if(isModifyGroupName) {
					
				} else {
					
				}
				
				break;
			case 5: // ���̵� �׷� ����
				
				
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
