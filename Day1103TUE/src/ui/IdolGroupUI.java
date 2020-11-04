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
			System.out.println("=====아이돌 그룹 관리=====");
			System.out.println("1. 아이돌 그룹 추가");
			System.out.println("2. 아이돌 그룹 목록보기");
			System.out.println("3. 아이돌 그룹 정보보기");
			System.out.println("4. 아이돌 그룹 수정");
			System.out.println("5. 아이돌 그룹 삭제");
			System.out.println("6. 프로그램 종료");
			System.out.print("메뉴 번호 입력>");
			String name = null;
			int menuNumber = scanner.nextInt();
			
			switch (menuNumber) {
			case 1: // 아이돌 그룹 추가
				IdolGroupVO newIdolGroupVO = consoleUtil.getNewIdolGroupVO(scanner);
				boolean registSuccess = idolGroupService.registNewIdolGroupVO(newIdolGroupVO);
				if(registSuccess) {
					consoleUtil.printRegistSuccessMessage(newIdolGroupVO.getName());
				} else {
					consoleUtil.printRegistFailMessage(newIdolGroupVO.getName());
				}
				break;
			case 2: // 아이돌 그룹 목록보기
				IdolGroupVO[] idolGroupVOList = idolGroupService.getIdolGroupVOList();
				consoleUtil.printIdolGroupVOList(idolGroupVOList);
				break;
			case 3: // 아이돌 그룹 정보보기
				// 메소드명 기존 getReadIdolGroupVO => getName으로 변경
				name = consoleUtil.getName(scanner);
				IdolGroupVO readidolGroupVO = idolGroupService.readIdolGroupVO(name);
				if(readidolGroupVO != null) {
					consoleUtil.printReadSuccessMessage(readidolGroupVO);
				} else {
					consoleUtil.printFailMessage("아이돌 그룹 정보 보기를");
				};
				break;
			case 4: // 아이돌 그룹 정보수정
				name = consoleUtil.getName(scanner);
				boolean isExistName = idolGroupService.getIsExistName(name);
				if(isExistName) { // 아이디가 존재하는 경우
					IdolGroupVO oldIdolGroupVO = idolGroupService.getOldIdolGroupVO(name);
					IdolGroupVO modifyIdolGroupVO =  consoleUtil.getModifyIdolGroupVO(oldIdolGroupVO, scanner);
					boolean modifySuccess = idolGroupService.modifyIdolGroupVO(modifyIdolGroupVO);
					if(modifySuccess) {
						consoleUtil.printModifySuccessMessage(modifyIdolGroupVO);
					} else {
						consoleUtil.printFailMessage("아이돌 그룹 정보 수정을");
					}
				} else { // 아이디가 존재하지 않는 경우 
					consoleUtil.printisNotExistNamelMessage(name);
				}
				break;
		case 5: // 아이돌 그룹 삭제
			name = consoleUtil.getName(scanner);
			isExistName = idolGroupService.getIsExistName(name);
			if(isExistName) { // 아이디가 존재하는 경우
				boolean removeSuccess = idolGroupService.removeIdolGroupVO(name);
				if(removeSuccess) {
					consoleUtil.printDeleteSuccessMessage(name);
				} else {
					consoleUtil.printFailMessage("아이돌 그룹 정보 삭제를");
				}
			} else {
				consoleUtil.printisNotExistNamelMessage(name);
			}
			
			break;
case 6: // 프로그램 종료
	consoleUtil.printExitMessage();
	stop = true;
	break;
	
default: // 다른 번호일때 예외처리
	consoleUtil.printCheckMessage();
	break;
}
			
			
			
			
		} while(!stop);

	}

}
