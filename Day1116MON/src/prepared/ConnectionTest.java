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
				System.out.println("������ INSERT ����");
			} 
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("������ INSERT ����");
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
			// ResultSet�� ����Ű�� ��ġ�� �������ڵ�� �̵� ��Ű�� ����
			// �̵��� ���ڵ尡 ������ true��ȯ
			while(rs.next()) {
				// �ش� ���ڵ忡�� �÷����� ��������(��ȯ�ϴ�) �޼ҵ�
				// 1. 
				// Type getType(int columnNumber) == rs.getString(0)
				// �ش� ���ڵ��� ù ��° �÷��� �̸� �÷��̰� �̸� �÷��� ���� �������� ���
				// 2. 
				// Type getType(String columnName)
				// �ش� ���ڵ��� ù ��° �÷��� �̸� �÷��̰� �̸� �÷��� ���� �������� ���
				// getString("columnName")
				// �Ϲ�������, ������������ �÷� �̸����� �������� 2��° ����� ����Ѵ�.
				System.out.println(rs.getString(1) + " : " + rs.getString(2) + " : " 
						+ rs.getString(3) + " : " +  rs.getString(4) + " : " + rs.getString(5) + " : " + rs.getString(6));
			}
		} catch (Exception e) {
			System.out.println("�����ϴ� �����Ͱ� �����ϴ�.");
		} finally {
			close(con, pstmt, rs);
		}
	}

	void selectMemeberByLastName(String lastName) {
		// % : �ش� ��ġ�� � ���ڰ� �͵� �ǰ�, �ƹ� ���ڵ� �ȿ͵� �ȴ�.
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
			System.out.println("�����ϴ� �����Ͱ� �����ϴ�.");
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
			System.out.println("�����ϴ� �����Ͱ� �����ϴ�.");
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
				System.out.println("������ UPDATE ����");
			} 
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("������ UPDATE ����");
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
				System.out.println("������ DELETE ����");
			} 
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("������ DELETE ����");
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
		//		System.out.println("������ ����");
		//		connectionTest.insertMember("123456", "������", "M", "20201120" , 40);

		// R : READ
		//		System.out.println("\n��� ������ �˻�");
		//		connectionTest.selectAllMember();
		//		
		//		System.out.println("\n���� �羾�� ������ ���");
		//		connectionTest.selectMemeberByLastName("��");

		//		System.out.println("�̸��� �� ���ڰ� �ϳ��� ���ԵǾ� �ִ� ���ڵ带 ��ȸ");
		//		connectionTest.selectMemberByName("��");
		//		

		// U : UPDATE
		//		System.out.println("\nmemberSsn�� 6666�� ���� �����ϱ�");
		//		connectionTest.updateMember("6666", "�����", "M", "20201120", 23);

		// D : DELETE
		System.out.println("\nmemberSsn�� �̿��ؼ� memberSsn�� 123456�� ������ �����ϱ�");
		connectionTest.deleteMemberByMemberSsn("123456");

	}

}
