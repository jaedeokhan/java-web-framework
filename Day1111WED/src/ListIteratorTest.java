import java.util.ArrayList;
import java.util.ListIterator;

// Iterator의 신버전
// Iterator는 전방향 이동만 가능했다. => next()만 가능했다.
// ListIteraotr는 후방향 이동도 가능
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
