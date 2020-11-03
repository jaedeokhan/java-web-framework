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
			// �ڹٿ����� �迭�� ������ ����� ������ �ִ�.
			// 1. ���� �迭�� ���
			// 2. ���� �迭���� ũ�Ⱑ 1��ŭ �迭 ��ü�� �����.
			// 3. ���� �迭�� ���� ���ο� �迭�� ����
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
		// �׷� ���� ������ ������ ���
		return true;
	}



	
	
	
}
