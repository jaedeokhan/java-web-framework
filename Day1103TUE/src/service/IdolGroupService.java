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
	
	// 내가 한 코드
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
	
	public boolean getIsExistName(String idolGroupVOName) {
		for (int i = 0; i < idolGroupVOArray.length; i++) {
			if(idolGroupVOName.equals(idolGroupVOArray[i].getName())) {
				return true;
			}
		}
		return false;
	}
	

	public IdolGroupVO getOldIdolGroupVO(String name) {
		
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
				idolGroupVOArray[i] = modifyIdolGroupVO;
				return true;
			}
		}
		return false;
		
	}

	public boolean removeIdolGroupVO(String name) {
		
		// 1. 기존 배열 객체를 임시 배열 참조 변수에 저장
		// 2. 기존 배열에서 제거하려는 idolGroupVO객체를 참조하는 배열의 인덱스 번호를 구한다.
		// 3. 기존 배열보다 크기가 -1인 배열 객체를 생성
		// 4. 만약 idolGroupVOArray[1]의 값을 삭제하려고 한다면
		IdolGroupVO[] tempArray = idolGroupVOArray;
		int index = -1; // 제거할 index
		boolean removeSuccess = false;
		
		for (int i = 0; i < tempArray.length; i++) {
			if(name.equals(tempArray[i].getName())) {
				index = i;
				break;
			} 
		}
		
		if(index != -1) { // -1이 아닐때는 삭제해야한다.
			idolGroupVOArray  = new IdolGroupVO[tempArray.length - 1];
			for (int i = 0; i < tempArray.length; i++) {
				if(i < index) { // i 가 index보다 작을때는 그대로 번호로 복사
					idolGroupVOArray[i] = tempArray[i];
				} else if(i > index) { // 뒤에 인덱스는 -1의 값을 넣어라.
					idolGroupVOArray[i-1] = tempArray[i];
				}
			}
			removeSuccess = true;
		}
		
		return removeSuccess;
		
	}	
//	public boolean removeIdolGroupVO(String name) {
//			// TODO Auto-generated method stub
//			boolean removeSuccess = false;
//			IdolGroupVO[] tempArray = idolGroupVOArray;
//			int index = -1;
//			for (int i = 0; i < tempArray.length; i++) {
//				if(name.equals(tempArray[i].getName())) {
//					index = i;
//					break;
//				}
//			}
//			if(index != -1) {
//				idolGroupVOArray = new IdolGroupVO[tempArray.length -1];
//				for (int i = 0; i < tempArray.length; i++) {
//					if(i < index) {
//						idolGroupVOArray[i] = tempArray[i];
//					}
//					else if(i > index) {
//						idolGroupVOArray[i-1] = tempArray[i];
//					}
//				}
//				
//				removeSuccess = true;
//			}
//			return removeSuccess;
//	}

}
