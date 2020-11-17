package prepared;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest  {
	Connection con;
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	void connect() {
		try {
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "java", "java");
			System.out.println("Connection Success!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void insertMember(String memberSsn, String memberName, String memberGender, 
			String memberBirthDay, int memberAge) {
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO member_tbl(memberSsn, memberName, memberGender, memberBirthDay, memberRegistDay, memberAge)"
				+ " VALUES(?, ?, ?, ?, sysdate, ?)";
		try {
			connect();
			pstmt =	con.prepareStatement(sql);
			pstmt.setString(1, memberSsn);
			pstmt.setString(2, memberName);
			pstmt.setString(3, memberGender);
			pstmt.setString(4, memberBirthDay);
			pstmt.setInt(5, memberAge);
			int insertCount = pstmt.executeUpdate();
			if(insertCount > 0) {
				System.out.println("데이터 INSERT 성공");
			} 
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이터 INSERT 실패");
		} finally {
			close(con, pstmt);
		}
	}

	void selectAllMember() {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM member_tbl";
		try {
			connect();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			// next()
			// ResultSet이 가리키는 위치를 다음레코드로 이동 시키는 역할
			// 이동할 레코드가 있으면 true반환
			while(rs.next()) {
				// 해당 레코드에서 컬럼값을 가져오는(반환하는) 메소드
				// 1. 
				// Type getType(int columnNumber) == rs.getString(0)
				// 해당 레코드의 첫 번째 컬럼이 이름 컬럼이고 이름 컬럼의 값을 가져오는 방법
				// 2. 
				// Type getType(String columnName)
				// 해당 레코드의 첫 번째 컬럼이 이름 컬럼이고 이름 컬럼의 값을 가져오는 방법
				// getString("columnName")
				// 일반적으로, 직관성때문에 컬럼 이름으로 가져오는 2번째 방법을 사용한다.
				System.out.println(rs.getString(1) + " : " + rs.getString(2) + " : " 
						+ rs.getString(3) + " : " +  rs.getString(4) + " : " + rs.getString(5) + " : " + rs.getString(6));
			}
		} catch (Exception e) {
			System.out.println("존재하는 데이터가 없습니다.");
		} finally {
			close(con, pstmt, rs);
		}
	}

	void selectMemeberByLastName(String lastName) {
		// % : 해당 위치에 어떤 문자가 와도 되고, 아무 문자도 안와도 된다.
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM member_tbl WHERE memberName LIKE ?"; 
		try {
			connect();
			pstmt = con.prepareCall(sql);
			pstmt.setString(1, lastName + "%");
			rs = pstmt.executeQuery();
			while(rs.next()) {

				System.out.println(rs.getString(1) + " : " + rs.getString(2) + " : " 
						+ rs.getString(3) + " : " +  rs.getString(4) + " : " + rs.getString(5) + " : " + rs.getString(6));
			}
		} catch (Exception e) {
			System.out.println("존재하는 데이터가 없습니다.");
		} finally {
			close(con, pstmt, rs);
		}
	}

	void selectMemberByName(String name) {
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM member_tbl WHERE memberName LIKE ?"; 
		try {
			connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, "%" + name + "%");
			rs = pstmt.executeQuery();
			while(rs.next()) {

				System.out.println(rs.getString(1) + " : " + rs.getString(2) + " : " 
						+ rs.getString(3) + " : " +  rs.getString(4) + " : " + rs.getString(5) + " : " + rs.getString(6));
			}
		} catch (Exception e) {
			System.out.println("존재하는 데이터가 없습니다.");
		} finally {
			close(con, pstmt, rs);
		}
	}

	void updateMemeberByMemberSsn(String memberSsn, String memberName, String memberGender, 
			String memberBirthDay, int memberAge) {
		PreparedStatement pstmt = null;
		String sql = "UPDATE member_tbl SET memberName=?, memberGender=?, memberGender=?, "
				+ "memberBirthDay=?, memberRegistDay=sysdate, memberAge=? "
				+ "WHERE memberSsn =?";
		try {
			connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberName);
			pstmt.setString(2, memberGender);
			pstmt.setString(3, memberBirthDay);
			pstmt.setInt(4, memberAge);
			pstmt.setString(5, memberSsn);
			int updateCount = pstmt.executeUpdate();
			if(updateCount > 0) {
				System.out.println("데이터 UPDATE 성공");
			} 
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이터 UPDATE 실패");
		} finally {
			close(con, pstmt);
		}
	}

	void deleteMemberByMemberSsn(String memberSsn) {
		PreparedStatement pstmt = null;
		String sql = "DELETE FROM member_tbl WHERE memberSsn = ?";
		try {
			connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberSsn);
			int deleteCount = pstmt.executeUpdate();
			if(deleteCount > 0) {
				System.out.println("데이터 DELETE 성공");
			} 
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("데이터 DELETE 실패");
		} finally {
			close(con, pstmt);
		}
	}

	void close(Connection con, PreparedStatement pstmt) {
		try {
			if(con != null && !con.isClosed()) {
				con.close();
			}	
			if(pstmt != null && !pstmt.isClosed()) {
				pstmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void close(Connection con, PreparedStatement pstmt, ResultSet rs) {
		try {
			if(con != null && !con.isClosed()) {
				con.close();
			}
			if(pstmt != null && !pstmt.isClosed()) {
				pstmt.close();
			}
			if(rs != null && !rs.isClosed()) {
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}

	public static void main(String[] args) {
		ConnectionTest connectionTest =  new ConnectionTest();

		// C : CREATE
		//		System.out.println("데이터 삽입");
		//		connectionTest.insertMember("123456", "오정원", "M", "20201120" , 40);

		// R : READ
		//		System.out.println("\n모든 데이터 검색");
		//		connectionTest.selectAllMember();
		//		
		//		System.out.println("\n성이 재씨인 데이터 출력");
		//		connectionTest.selectMemeberByLastName("재");

		//		System.out.println("이름에 재 문자가 하나라도 포함되어 있는 레코드를 조회");
		//		connectionTest.selectMemberByName("재");
		//		

		// U : UPDATE
		//		System.out.println("\nmemberSsn이 6666인 정보 변경하기");
		//		connectionTest.updateMember("6666", "한재덕", "M", "20201120", 23);

		// D : DELETE
		System.out.println("\nmemberSsn을 이용해서 memberSsn이 123456인 데이터 삭제하기");
		connectionTest.deleteMemberByMemberSsn("123456");

	}

}
