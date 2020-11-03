package service;

import vo.IdolGroupVO;

public class IdolGroupService {
	
	IdolGroupVO[] idolGroupVOArray = null;
	
	public IdolGroupService() {
		idolGroupVOArray = new IdolGroupVO[0];
	}

	public boolean registNewIdolGroupVO(IdolGroupVO newIdolGroupVO) {
		
		boolean registSuccess = true;
		
		for (int i = 0; i < idolGroupVOArray.length; i++) {
			if(newIdolGroupVO.getName().equals(idolGroupVOArray[i].getName())) {
				registSuccess = false;
			} 
		}
		
		if (registSuccess) {
			// 자바에서는 배열은 기존에 사이즈가 정해져 있다.
			// 1. 기존 배열을 백업
			// 2. 기존 배열보다 크기가 1만큼 배열 객체를 만든다.
			// 3. 기존 배열의 값을 새로운 배열에 복사
			IdolGroupVO[] tempArray = idolGroupVOArray;
			idolGroupVOArray = new IdolGroupVO[tempArray.length + 1];
			for (int i = 0; i < tempArray.length; i++) {
				idolGroupVOArray[i] = tempArray[i];
			}
			idolGroupVOArray[idolGroupVOArray.length - 1] = newIdolGroupVO;
		}
		
		return registSuccess;
	}

	public IdolGroupVO[] getIdolGroupVOList() {
		
		IdolGroupVO[] IdolGroupVOList = idolGroupVOArray;
		return IdolGroupVOList;
	}
	
	
	public IdolGroupVO readIdolGroupVO(String name) {
	
		IdolGroupVO readIdolGroupVO = new IdolGroupVO();
		
		for (int i = 0; i < idolGroupVOArray.length; i++) {
			if(name.equals(idolGroupVOArray[i].getName())) {
				readIdolGroupVO = idolGroupVOArray[i];
				return readIdolGroupVO;
			}
		}
		return null;
	}
	
	public boolean modifyIdolGroupVO(IdolGroupVO modifyIdolGroupVO) {
		
		for (int i = 0; i < idolGroupVOArray.length; i++) {
			if(modifyIdolGroupVO.getName().equals(idolGroupVOArray[i].getName())) {
				return false;
			}
		}
		// 그룹 정보 수정이 가능한 경우
		return true;
	}



	
	
	
}
