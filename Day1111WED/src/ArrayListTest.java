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
		
		System.out.println("\n�÷����� �߰��ϱ�");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		
		arrayList.addAll(2, insertArrayList);
		
		System.out.println("\n2�� �ε����� �÷����� �����ϱ�");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));			
		}
		
		// U : Update
		System.out.println("\n1�� �ε����� '����' ���ڿ� �ְ� ����ϱ�");
		arrayList.set(1, "����");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));			
		}
		
		// D : Delete
		arrayList.remove(0);
		System.out.println("\n0�� �ε����� �ִ� 'aaa'�� �����Ǵ��� Ȯ���ϱ�");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));			
		}
		
		arrayList.remove("����");
		System.out.println("\n'����'�̶�� ���� �ִ� �ε����� �����ϱ�");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));			
		}
		
		arrayList.removeAll(arrayList);
		System.out.println("\narrayList �÷��� ��ü�� �����ϱ�");
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));			
		}
		System.out.println("�翬�� arrayList ��ü�� ���������� ������ �ʴ´�.");

	}
}
