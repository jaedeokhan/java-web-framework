import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		String[] sportsArray = {"�ٳѱ�", "�౸", "��", "�豸", "�ڵ庼"};
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		// C : create
		for (int i = 0; i < sportsArray.length; i++) {
			// key = index, value = sports
			hashMap.put(i, sportsArray[i]);
		}
		
		// R :read => ���� Ű���鸸 ��������
		Set<Integer> keySet = hashMap.keySet();
		
		for(Integer key : keySet) {
			System.out.println(key + " : " + hashMap.get(key));
		}
	}

}
