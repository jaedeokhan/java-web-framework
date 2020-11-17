import java.util.ArrayList;
import java.util.Iterator;

// 반복자
// Enumeration의 신버전
public class IteratorTest {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("aaa");
		arrayList.add("bbb");
		arrayList.add("ccc");
		arrayList.add("ddd");
		
		// Map에서는 당연히 상속구조가 다르기에 사용하지 못한다.
		Iterator<String> it = arrayList.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
