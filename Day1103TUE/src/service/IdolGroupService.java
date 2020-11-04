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
	
	// ���� �� �ڵ�
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
		
		// 1. ���� �迭 ��ü�� �ӽ� �迭 ���� ������ ����
		// 2. ���� �迭���� �����Ϸ��� idolGroupVO��ü�� �����ϴ� �迭�� �ε��� ��ȣ�� ���Ѵ�.
		// 3. ���� �迭���� ũ�Ⱑ -1�� �迭 ��ü�� ����
		// 4. ���� idolGroupVOArray[1]�� ���� �����Ϸ��� �Ѵٸ�
		IdolGroupVO[] tempArray = idolGroupVOArray;
		int index = -1; // ������ index
		boolean removeSuccess = false;
		
		for (int i = 0; i < tempArray.length; i++) {
			if(name.equals(tempArray[i].getName())) {
				index = i;
				break;
			} 
		}
		
		if(index != -1) { // -1�� �ƴҶ��� �����ؾ��Ѵ�.
			idolGroupVOArray  = new IdolGroupVO[tempArray.length - 1];
			for (int i = 0; i < tempArray.length; i++) {
				if(i < index) { // i �� index���� �������� �״�� ��ȣ�� ����
					idolGroupVOArray[i] = tempArray[i];
				} else if(i > index) { // �ڿ� �ε����� -1�� ���� �־��.
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
