import java.util.ArrayList;
import java.util.ListIterator;

// Iterator�� �Ź���
// Iterator�� ������ �̵��� �����ߴ�. => next()�� �����ߴ�.
// ListIteraotr�� �Ĺ��� �̵��� ����
public class ListIteratorTest {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("aaa");
		arrayList.add("bbb");
		arrayList.add("ccc");
		arrayList.add("ddd");
		
		ListIterator<String> listIterator = arrayList.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());

		}
		System.out.println("================================");
		
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		
		
		

	}

}
