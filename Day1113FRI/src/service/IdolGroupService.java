package service;

import java.util.ArrayList;

import vo.IdolGroupVO;

public class IdolGroupService {
	
	// 기존의 배열을 사용하는 방식을 ArrayList로 사용
	ArrayList<IdolGroupVO> idolGroupList = new ArrayList<IdolGroupVO>();
	
	public IdolGroupService() {
		idolGroupList = new ArrayList<IdolGroupVO>();
	}
	
	// C : Create 
	// 기존 배열을 이용해서 새로운 아이돌을 생성할려고 하면 
	// 기존 배열의 사이즈를 미리 백업받고, 사이즈를 +1하고 기존의 데이터 뒤에 넣어줘야한다.
	// ArrayList를 사용하면 훨씬 편해진다.
	public boolean registNewIdolGroupVO(IdolGroupVO newIdolGroupVO) {
		
		boolean registSuccess = true;
		
		for (int i = 0; i < idolGroupList.size(); i++) {
			if(newIdolGroupVO.getName().equals(idolGroupList.get(i).getName())) {
				registSuccess = false;
				break;
			}
		}
		
		if (registSuccess) {
			idolGroupList.add(newIdolGroupVO);
		}
		
		return registSuccess;
	}

	public ArrayList<IdolGroupVO> getIdolGroupList() {
		
		return idolGroupList;
	}
	
	// R : Read 
	// 한 명의 데이터를 읽는 작업은 배열과 ArrayList는 거의 동일하다.
	public IdolGroupVO readIdolGroupVO(String name) {
	
		IdolGroupVO readIdolGroupVO = new IdolGroupVO();
		
		for (int i = 0; i < idolGroupList.size(); i++) {
			if(name.equals(idolGroupList.get(i).getName())) {
				readIdolGroupVO = idolGroupList.get(i);
				return readIdolGroupVO;
			}
		}
		return null;
	}
	
	public boolean getIsExistName(String idolGroupVOName) {
		
		for (int i = 0; i < idolGroupList.size(); i++) {
			if(idolGroupVOName.equals(idolGroupList.get(i).getName())) {
				return true;
			}
		}
		return false;
		
	}
	

	public IdolGroupVO getOldIdolGroupVO(String name) {
		
		IdolGroupVO idolGroupVO = new IdolGroupVO();
		
		for (int i = 0; i < idolGroupList.size(); i++) {
			if(name.equals(idolGroupList.get(i).getName())) {
				idolGroupVO = idolGroupList.get(i);
				break;
			}
		}
		
		return idolGroupVO;
	}
	
	// U : Update
	// 아이돌 그룹 수정 작업은 
	public boolean modifyIdolGroupVO(IdolGroupVO modifyIdolGroupVO) {
		
		for (int i = 0; i < idolGroupList.size(); i++) {
			if(idolGroupList.get(i).getName().equals(modifyIdolGroupVO.getName())) {
				// ArrayList는 데이터를 저장할 때는 set을 사용해야한다.
				idolGroupList.set(i, modifyIdolGroupVO);
				return true;
			}
		}
		return false;
		
	}

	// D : Delete 
	public boolean removeIdolGroupVO(String name) {
		
		int index = -1; // 제거할 index
		boolean removeSuccess = false;
		
		for (int i = 0; i < idolGroupList.size(); i++) {
			if(name.equals(idolGroupList.get(i).getName())) {
				idolGroupList.remove(i);
				removeSuccess = true;
				break;
			}
		}
		
		return removeSuccess;
		
	}	

}
