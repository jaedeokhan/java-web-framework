import java.util.ArrayList;
import java.util.Iterator;

// �ݺ���
// Enumeration�� �Ź���
public class IteratorTest {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("aaa");
		arrayList.add("bbb");
		arrayList.add("ccc");
		arrayList.add("ddd");
		
		// Map������ �翬�� ��ӱ����� �ٸ��⿡ ������� ���Ѵ�.
		Iterator<String> it = arrayList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
