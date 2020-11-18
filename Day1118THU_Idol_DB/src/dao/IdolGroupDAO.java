package dao;

import static db.JdbcUtil.close;
import static db.JdbcUtil.getConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import vo.IdolGroupVO;

public class IdolGroupDAO {

	Connection con;

	private static IdolGroupDAO idolGroupDAO;

	private IdolGroupDAO() {

	}

	public static IdolGroupDAO getInstance() {
		if(idolGroupDAO == null) { // 객체가 아직 만들어지지 않았다. => 메소드가 처음 호출이 되었으면
			idolGroupDAO = new IdolGroupDAO();
		}
		return idolGroupDAO;
	}

	public int insertIdolGroup(IdolGroupVO newIdolGroupVO) {

		int insertCount = 0;
		PreparedStatement stmt = null;
		con = getConnection();
		String sql = "INSERT INTO idolGroup VALUES(?, ?, ?, ?, ?, ?, ?)";

		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, newIdolGroupVO.getName());
			stmt.setInt(2, newIdolGroupVO.getAge());
			stmt.setInt(3, newIdolGroupVO.getMemberNumber());
			stmt.setString(4, newIdolGroupVO.getCompany());
			stmt.setString(5, newIdolGroupVO.getGender());
			stmt.setInt(6, newIdolGroupVO.getYear());
			stmt.setString(7, newIdolGroupVO.getAlbum());
			insertCount = stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, stmt);
		}
		return insertCount;
	}

	public ArrayList<IdolGroupVO> selectIdolGroupList() {

		ArrayList<IdolGroupVO> idolGroupList = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		con = getConnection();
		String sql  = "SELECT * FROM idolGroup";

		try {
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			if(rs.next()) {
				idolGroupList = new ArrayList<IdolGroupVO>();
				IdolGroupVO idolGroupVO = null;
				do {
					idolGroupVO = new IdolGroupVO();
					idolGroupVO.setName(rs.getString("name"));
					idolGroupVO.setAge(rs.getInt("age"));
					idolGroupVO.setMemberNumber(rs.getInt("memberNumber"));
					idolGroupVO.setCompany(rs.getString("company"));
					idolGroupVO.setGender(rs.getString("gender"));
					idolGroupVO.setYear(rs.getInt("year"));
					idolGroupVO.setAlbum(rs.getString("album"));
					idolGroupList.add(idolGroupVO);
				} while(rs.next());
			}


		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, stmt, rs);
		}

		return idolGroupList;
	}

	public IdolGroupVO selectIdolGroupByName(String name) {
		
		IdolGroupVO idolGroupVO = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		con = getConnection();
		String sql  = "SELECT * FROM idolGroup WHERE name = ?";

		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, name);
			rs = stmt.executeQuery();
			if(rs.next()) {
				idolGroupVO = new IdolGroupVO();
				idolGroupVO.setName(rs.getString("name"));
				idolGroupVO.setAge(rs.getInt("age"));
				idolGroupVO.setMemberNumber(rs.getInt("memberNumber"));
				idolGroupVO.setCompany(rs.getString("company"));
				idolGroupVO.setGender(rs.getString("gender"));
				idolGroupVO.setYear(rs.getInt("year"));
				idolGroupVO.setAlbum(rs.getString("album"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, stmt, rs);
		}
		
		return idolGroupVO;
	}

	public boolean selectIdolGroupIdExist(String idolGroupName) {
	
		PreparedStatement stmt = null;
		ResultSet rs = null;
		con = getConnection();
		String sql  = "SELECT name FROM idolGroup WHERE name = ?";

		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, idolGroupName);
			rs = stmt.executeQuery();
			if(rs.next()) {
				if(idolGroupName.equals(rs.getString("name"))) {
					return true;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, stmt, rs);
		}
		
		return false;
	}

	public IdolGroupVO selectIdolOldGroupVO(String name) {
		
		IdolGroupVO idolGroupVO = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		con = getConnection();
		String sql  = "SELECT * FROM idolGroup WHERE name = ?";

		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, name);
			rs = stmt.executeQuery();
			if(rs.next()) {
				idolGroupVO = new IdolGroupVO();
				idolGroupVO.setName(rs.getString("name"));
				idolGroupVO.setAge(rs.getInt("age"));
				idolGroupVO.setMemberNumber(rs.getInt("memberNumber"));
				idolGroupVO.setCompany(rs.getString("company"));
				idolGroupVO.setGender(rs.getString("gender"));
				idolGroupVO.setYear(rs.getInt("year"));
				idolGroupVO.setAlbum(rs.getString("album"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, stmt, rs);
		}
		return idolGroupVO;
	}

	public boolean updateIdolGroupVO(IdolGroupVO modifyIdolGroupVO) {
		
		boolean updateSuccess = false;
		int updateCount = 0;
		PreparedStatement stmt = null;
		con = getConnection();
		String sql = "UPDATE idolGroup SET age=?, memberNumber=?, company=?, gender=?, year=?, album=?"
				   + "WHERE name = ?";

		try {
			stmt = con.prepareStatement(sql);
			stmt.setInt(1, modifyIdolGroupVO.getAge());
			stmt.setInt(2, modifyIdolGroupVO.getMemberNumber());
			stmt.setString(3, modifyIdolGroupVO.getCompany());
			stmt.setString(4, modifyIdolGroupVO.getGender());
			stmt.setInt(5, modifyIdolGroupVO.getYear());
			stmt.setString(6, modifyIdolGroupVO.getAlbum());
			stmt.setString(7, modifyIdolGroupVO.getName());
			updateCount = stmt.executeUpdate();
			if(updateCount > 0) {
				updateSuccess = true;
				return updateSuccess;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, stmt);
		}
		return updateSuccess;
	}

	public boolean deleteIdolGroupVO(String name) {
		
		boolean deleteSuccess = false;
		int deleteCount = 0;
		PreparedStatement stmt = null;
		con = getConnection();
		String sql = "DELETE FROM idolGroup WHERE name = ?";

		try {
			stmt = con.prepareStatement(sql);
			stmt.setString(1, name);

			deleteCount = stmt.executeUpdate();
			if(deleteCount > 0) {
				deleteSuccess = true;
				return deleteSuccess;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close(con, stmt);
		}
		return deleteSuccess;
	}

}
