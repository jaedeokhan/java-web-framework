package util;

import java.util.Scanner;
import vo.IdolGroupVO;

// 콘솔 작업을 하는 클래스
public class ConsoleUtil {

	public IdolGroupVO getNewIdolGroupVO(Scanner scanner) {
	
		System.out.println("===== 아이돌 그룹 정보 등록 ======");
		System.out.print("아이돌 그룹 이름 : ");
		String name = scanner.next();
		
		System.out.print("아이돌 그룹 성별 : ");
		String gender = scanner.next();
		
		System.out.print("아이돌 그룹 데뷔연도 : ");
		int year = scanner.nextInt();
		
		System.out.print("아이돌 그룹 데뷔 나이  : ");
		int age = scanner.nextInt();
		
		System.out.print("아이돌 그룹 멤버수 : ");
		int memberNumber = scanner.nextInt();
		
		System.out.print("아이돌 그룹 앨범 : ");
		String album = scanner.next();

		System.out.print("아이돌 그룹 소속사 : ");
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
		System.out.println("아이돌 그룹 " + name + "의 추가가 성공했습니다.");
	}

	public void printRegistFailMessage(String name) {
		System.out.println("아이돌 그룹 " + name + "의 추가가 실패했습니다.");		
	}

	public void printIdolGroupVOList(IdolGroupVO[] idolGroupVOList) {
		if(idolGroupVOList.length == 0) {
			System.out.println("등록된 아이돌 그룹이 없습니다.\n");
		}
		
		for (int i = 0; i < idolGroupVOList.length; i++) {
			System.out.println(idolGroupVOList[i].toString());
		}
		
	}

	public String getReadIdolGroupVO(Scanner scanner) {
		
		System.out.println("===== 아이돌 그룹명 검색 =====");
		System.out.print("검색할 아이돌 그룹명 : ");
		String name = scanner.next();
		return name;
	}
	
	public IdolGroupVO getModifyIdolGroupVO(Scanner scanner) {
		
		System.out.println("===== 수정할 아이돌 그룹 정보 입력 ======");
		System.out.print("수정할 아이돌 그룹 이름 : ");
		String name = scanner.next();
		IdolGroupVO modifyIdolGroupVO = new IdolGroupVO();
		modifyIdolGroupVO.setName(name);
		
		return modifyIdolGroupVO;
	}

	public void printReadSuccessMessage(IdolGroupVO readidolGroupVO) {
		System.out.println("검색한 내용 : " + readidolGroupVO.toString() + "\n");
	}

	public void printReadFailMessage() {
		System.out.println("검색한 아이디는 존재하지 않습니다.\n");
	}

	public void printExitMessage() {
		System.out.println("이용해주셔서 감사합니다.\n");
	}

	public void printCheckMessage() {
		System.out.println("1~6번을 입력해주세요.\n");
	}


	
	
	

}
