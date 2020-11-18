package util;

import java.util.ArrayList;
import java.util.Scanner;

import vo.IdolGroupVO;

// 콘솔 작업을 하는 클래스
public class ConsoleUtil {

	public IdolGroupVO getNewIdolGroupVO(Scanner scanner) {
		
		// 1
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
		System.out.println("아이돌 그룹 " + name + " 등록을 성공했습니다.");
	}

	public void printRegistFailMessage(String name) {
		System.out.println("아이돌 그룹 " + name + " 등록을 실패했습니다.");		
	}
	
	// 2
	public void printIdolGroupVOList(ArrayList<IdolGroupVO> idolGroupVOList) {
		if(idolGroupVOList.size() == 0) {
			System.out.println("등록된 아이돌 그룹이 없습니다.\n");
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
		System.out.println("===== 아이돌 그룹명 입력하기 =====");
		System.out.print("아이돌 그룹명 입력 : ");
		String name = scanner.next();
		return name;
	}


	public void printReadSuccessMessage(IdolGroupVO readidolGroupVO) {
		System.out.println("검색한 내용 : " + readidolGroupVO.toString() + "\n");
	}
	
	// 4
	public IdolGroupVO getModifyIdolGroupVO(IdolGroupVO oldIdolGroupVO, Scanner scanner) {
		
		System.out.println("===== 아이돌 그룹 정보 수정 ======");
		
		System.out.println("이전 아이돌 그룹 성별 : " + oldIdolGroupVO.getGender());
		System.out.print("수정할 아이돌 그룹 성별 : ");
		String gender = scanner.next();
		
		System.out.println("이전 아이돌 그룹 데뷔연도 : " + oldIdolGroupVO.getYear());
		System.out.print("수정할 아이돌 그룹 데뷔연도 : ");
		int year = scanner.nextInt();
		
		System.out.println("이전 아이돌 그룹 데뷔 나이 : " + oldIdolGroupVO.getAge());
		System.out.print("수정할 아이돌 그룹 데뷔 나이  : ");
		int age = scanner.nextInt();
		
		System.out.println("이전 아이돌 그룹 멤버수 : " + oldIdolGroupVO.getMemberNumber());
		System.out.print("수정할 아이돌 그룹 멤버수 : ");
		int memberNumber = scanner.nextInt();
		
		System.out.println("이전 아이돌 그룹 앨범 : " + oldIdolGroupVO.getAlbum());
		System.out.print("수정할 아이돌 그룹 앨범 : ");
		String album = scanner.next();

		System.out.println("이전 아이돌 그룹 소속사 : " + oldIdolGroupVO.getCompany());
		System.out.print("수정할 아이돌 그룹 소속사 : ");
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
		System.out.println(name + "아이디는 존재하지 않습니다.\n");
		
	}
	
	public void printModifySuccessMessage(IdolGroupVO modifyIdolGroupVO) {
		System.out.println(modifyIdolGroupVO.getName() + "의 그룹의 정보가 정상적으로 수정이 되었습니다.");
		System.out.println(modifyIdolGroupVO.toString());
	}
	
	
	public void printFailMessage(String message) {
		System.out.println(message + " 실패했습니다.");
	}
	
	// 5
public void printDeleteSuccessMessage(String name) {
	System.out.println(name + "의 삭제를 성공했습니다.");
}



public void printExitMessage() {
	System.out.println("이용해주셔서 감사합니다.\n");
}


public void printCheckMessage() {
	System.out.println("1~6번을 입력해주세요.\n");
}


}
