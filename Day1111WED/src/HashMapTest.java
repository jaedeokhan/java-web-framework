import java.util.HashMap;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		String[] sportsArray = {"줄넘기", "축구", "농구", "배구", "핸드볼"};
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		
		// C : create
		for (int i = 0; i < sportsArray.length; i++) {
			// key = index, value = sports
			hashMap.put(i, sportsArray[i]);
		}
		
		// R :read => 맵의 키값들만 가져오기
		Set<Integer> keySet = hashMap.keySet();
		
		for(Integer key : keySet) {
			System.out.println(key + " : " + hashMap.get(key));
		}
	}

}
