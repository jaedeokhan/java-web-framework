package service;

import java.util.ArrayList;

import vo.IdolGroupVO;

public class IdolGroupService {
	
	// ������ �迭�� ����ϴ� ����� ArrayList�� ���
	ArrayList<IdolGroupVO> idolGroupList = new ArrayList<IdolGroupVO>();
	
	public IdolGroupService() {
		idolGroupList = new ArrayList<IdolGroupVO>();
	}
	
	// C : Create 
	// ���� �迭�� �̿��ؼ� ���ο� ���̵��� �����ҷ��� �ϸ� 
	// ���� �迭�� ����� �̸� ����ް�, ����� +1�ϰ� ������ ������ �ڿ� �־�����Ѵ�.
	// ArrayList�� ����ϸ� �ξ� ��������.
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
	// �� ���� �����͸� �д� �۾��� �迭�� ArrayList�� ���� �����ϴ�.
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
	// ���̵� �׷� ���� �۾��� 
	public boolean modifyIdolGroupVO(IdolGroupVO modifyIdolGroupVO) {
		
		for (int i = 0; i < idolGroupList.size(); i++) {
			if(idolGroupList.get(i).getName().equals(modifyIdolGroupVO.getName())) {
				// ArrayList�� �����͸� ������ ���� set�� ����ؾ��Ѵ�.
				idolGroupList.set(i, modifyIdolGroupVO);
				return true;
			}
		}
		return false;
		
	}

	// D : Delete 
	public boolean removeIdolGroupVO(String name) {
		
		int index = -1; // ������ index
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
