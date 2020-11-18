package service;

import java.util.ArrayList;

import dao.IdolGroupDAO;
import vo.IdolGroupVO;

public class IdolGroupService {
	
	// 기존의 배열을 사용하는 방식을 ArrayList로 사용
	ArrayList<IdolGroupVO> idolGroupList = new ArrayList<IdolGroupVO>();
	
	public IdolGroupService() {
		idolGroupList = new ArrayList<IdolGroupVO>();
	}
	
    // C : Craete
	public boolean registNewIdolGroupVO(IdolGroupVO newIdolGroupVO) {
		
		boolean registSuccess = true;
		
		// DAO(Data Access Object)
		IdolGroupDAO idolGroupDAO = IdolGroupDAO.getInstance();
		int insertCount = idolGroupDAO.insertIdolGroup(newIdolGroupVO);
		if(insertCount == 0) {
			registSuccess = false;
		} 
		
		return registSuccess;
	}

	public ArrayList<IdolGroupVO> getIdolGroupList() {
		
		// DAO
		IdolGroupDAO idolGroupDAO = IdolGroupDAO.getInstance();
		idolGroupList = idolGroupDAO.selectIdolGroupList();
		
		return idolGroupList;
	}
	
	// R : Read 
	public IdolGroupVO readIdolGroupVO(String name) {
	
		IdolGroupDAO idolGroupDAO = IdolGroupDAO.getInstance();
		IdolGroupVO idolGroupVO  = idolGroupDAO.selectIdolGroupByName(name);
	
		return idolGroupVO;
	}
	
	public boolean getIsExistName(String idolGroupName) {
		
		boolean overlapId = false;
		
		IdolGroupDAO idolGroupDAO  = IdolGroupDAO.getInstance();
		overlapId = idolGroupDAO.selectIdolGroupIdExist(idolGroupName);
		
		return overlapId;
	}
	

	public IdolGroupVO getOldIdolGroupVO(String name) {
		
		IdolGroupVO idolGroupVO = null; 
		
		IdolGroupDAO idolGroupDAO = IdolGroupDAO.getInstance();
		idolGroupVO = idolGroupDAO.selectIdolOldGroupVO(name);
		
		
		return idolGroupVO;
	}
	
	// U : Update
	public boolean modifyIdolGroupVO(IdolGroupVO modifyIdolGroupVO) {
		
		boolean modifySuccess = true;
		
		IdolGroupDAO idolGroupDAO = IdolGroupDAO.getInstance();
		modifySuccess = idolGroupDAO.updateIdolGroupVO(modifyIdolGroupVO);
		
		return modifySuccess;
		
	}

	// D : Delete 
	public boolean removeIdolGroupVO(String name) {
		
		boolean removeSuccess = false;

		IdolGroupDAO idolGroupDAO = IdolGroupDAO.getInstance();
		removeSuccess = idolGroupDAO.deleteIdolGroupVO(name);
		
		return removeSuccess;
		
	}	

}
