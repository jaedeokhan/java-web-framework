package jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	Statement stmt = null;
	String sql = "INSERT INTO member_tbl(memberSsn, memberName, memberGender, memberBirthDay, memberRegistDay, memberAge)"
			+ " VALUES(" + "'" + memberSsn  +   "','" 
							   + memberName +   "','" 
			                   + memberGender + "','" 
			                   + memberBirthDay + 
			                   "',sysdate," 
			                   + memberAge +  ")";
	try {
		connect();
		stmt = con.createStatement();
		int insertCount = stmt.executeUpdate(sql);
		if(insertCount > 0) {
			System.out.println("������ INSERT ����");
		} 
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println("������ INSERT ����");
	} finally {
		close(con, stmt);
	}
}

void selectAllMember() {
	Statement stmt = null;
	ResultSet rs = null;
	String sql = "SELECT * FROM member_tbl";
	try {
		connect();
		stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
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
		close(con, stmt, rs);
	}
}
	
	void selectMemeberByLastName(String lastName) {
		// % : �ش� ��ġ�� � ���ڰ� �͵� �ǰ�, �ƹ� ���ڵ� �ȿ͵� �ȴ�.
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM member_tbl WHERE memberName LIKE '" + lastName + "%'"; 
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {

				System.out.println(rs.getString(1) + " : " + rs.getString(2) + " : " 
						+ rs.getString(3) + " : " +  rs.getString(4) + " : " + rs.getString(5) + " : " + rs.getString(6));
			}
		} catch (Exception e) {
			System.out.println("�����ϴ� �����Ͱ� �����ϴ�.");
		} finally {
			close(con, stmt, rs);
		}
	}
	
	void selectMemberByName(String name) {
		Statement stmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM member_tbl WHERE memberName LIKE '%" + name + "%'"; 
		try {
			connect();
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {

				System.out.println(rs.getString(1) + " : " + rs.getString(2) + " : " 
						+ rs.getString(3) + " : " +  rs.getString(4) + " : " + rs.getString(5) + " : " + rs.getString(6));
			}
		} catch (Exception e) {
			System.out.println("�����ϴ� �����Ͱ� �����ϴ�.");
		} finally {
			close(con, stmt, rs);
		}
	}
	
	void updateMemeberByMemberSsn(String memberSsn, String memberName, String memberGender, 
			String memberBirthDay, int memberAge) {
		Statement stmt = null;
		String sql = "UPDATE member_tbl SET memberName = '" + memberName  + "', "
										 + "memberGender='" + memberGender + "',"
										 + "memberBirthDay = '" + memberBirthDay + "'," 
										 + "memberRegistDay =sysdate," 
										 + "memberAge=" + memberAge 
										 + " WHERE memberSsn = " + memberSsn;
		try {
			connect();
			stmt = con.createStatement();
			int updateCount = stmt.executeUpdate(sql);
			if(updateCount > 0) {
				System.out.println("������ UPDATE ����");
			} 
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("������ UPDATE ����");
		} finally {
			close(con, stmt);
		}
	}
	
	void deleteMemberByMemberSsn(String memberSsn) {
		Statement stmt = null;
		String sql = "DELETE FROM member_tbl WHERE memberSsn = '" + memberSsn + "'";
		try {
			connect();
			stmt = con.createStatement();
			int deleteCount = stmt.executeUpdate(sql);
			if(deleteCount > 0) {
				System.out.println("������ DELETE ����");
			} 
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("������ DELETE ����");
		} finally {
			close(con, stmt);
		}
	}
	
	void close(Connection con, Statement stmt) {
		try {
			if(con != null && !con.isClosed()) {
				con.close();
			}	
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	void close(Connection con, Statement stmt, ResultSet rs) {
		try {
			if(con != null && !con.isClosed()) {
				con.close();
			}
			if(stmt != null && !stmt.isClosed()) {
				stmt.close();
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
//		System.out.println("\nmemberSsn�� �̿��ؼ� memberSsn�� 123456�� ������ �����ϱ�");
//		connectionTest.deleteMemberByMemberSsn("123456");
		
	}

}
