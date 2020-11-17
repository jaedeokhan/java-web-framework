import java.util.Enumeration;
import java.util.Properties;

// Properties
// HashTable을 상속받음
// 키와 값을 모두 String 형태로 다룬다.
// 속성을 관리할 때 주로 사용한다.
public class PropertiesTest {

	public static void main(String[] args) {

		Properties prop = new Properties();
		
		// C : Create
		prop.setProperty("id", "java");
		prop.setProperty("password", "java");
		prop.setProperty("driver", "oracle.jdbc.driver.OracleDriver");
		
		// R : Read
		String id = prop.getProperty("id");
		String password = prop.getProperty("password");
		String driver = prop.getProperty("driver");
		
		System.out.println("아이디 : " + id);
		System.out.println("비밀번호 : " + password);
		System.out.println("드라이버 : " + driver);
		
		System.out.println("==속성 이름을 한 번에 가져와서 출력하기 ==");
		Enumeration propertyNames = prop.propertyNames();
		
		while(propertyNames.hasMoreElements()) {
			// hasMoreElements() : Enumeration에 남은 요소가 있는지 판단
			String propertyName = (String) propertyNames.nextElement();
			System.out.println(prop.getProperty(propertyName));
		}
	
	}

}
