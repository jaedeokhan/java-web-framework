import java.util.Enumeration;
import java.util.Properties;

// Properties
// HashTable�� ��ӹ���
// Ű�� ���� ��� String ���·� �ٷ��.
// �Ӽ��� ������ �� �ַ� ����Ѵ�.
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
		
		System.out.println("���̵� : " + id);
		System.out.println("��й�ȣ : " + password);
		System.out.println("����̹� : " + driver);
		
		System.out.println("==�Ӽ� �̸��� �� ���� �����ͼ� ����ϱ� ==");
		Enumeration propertyNames = prop.propertyNames();
		
		while(propertyNames.hasMoreElements()) {
			// hasMoreElements() : Enumeration�� ���� ��Ұ� �ִ��� �Ǵ�
			String propertyName = (String) propertyNames.nextElement();
			System.out.println(prop.getProperty(propertyName));
		}
	
	}

}
