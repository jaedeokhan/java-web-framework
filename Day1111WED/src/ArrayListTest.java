import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		// C : Create
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("aaa");
		arrayList.add("bbb");
		arrayList.add("ccc");
		arrayList.add("aaa");
		arrayList.add(1, "111");
		
		// R : Read
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		ArrayList<String> insertArrayList = new ArrayList<String>();
		insertArrayList.add("444");
		insertArrayList.add("555");
		insertArrayList.add("666");
		arrayList.addAll(insertArrayList);
		
		System.out.println("\n컬렉션을 추가하기");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		arrayList.addAll(2, insertArrayList);
		
		System.out.println("\n2번 인덱스에 컬렉션을 삽입하기");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));			
		}
		
		// U : Update
		System.out.println("\n1번 인덱스에 '수정' 문자열 넣고 출력하기");
		arrayList.set(1, "수정");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));			
		}
		
		// D : Delete
		arrayList.remove(0);
		System.out.println("\n0번 인덱스에 있는 'aaa'가 삭제되는지 확인하기");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));			
		}
		
		arrayList.remove("수정");
		System.out.println("\n'수정'이라는 값이 있는 인덱스를 삭제하기");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));			
		}
		
		arrayList.removeAll(arrayList);
		System.out.println("\narrayList 컬렉션 객체를 삭제하기");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));			
		}
		System.out.println("당연히 arrayList 객체를 삭제했으니 나오지 않는다.");

	}
}
