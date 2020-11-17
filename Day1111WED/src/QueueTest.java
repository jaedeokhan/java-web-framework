import java.util.LinkedList;

public class QueueTest {

	public static void main(String[] args) {
		
		String[] flowerArray = {"개나리", "장미", "국화", "나팔꽃", "무궁화꽃"};
		LinkedList<String> queue = new LinkedList<String>();
		
		for(String flower : flowerArray) {
			queue.offer(flower);
		}
		System.out.println("queue 크기 : " + queue.size());
		
		String data = "";
		while((data = queue.poll()) != null) {
			System.out.println(data + " 삭제"); // poll은 데이터를 가져와서 삭제하는 것이다.
		}
		
		System.out.println("queue 크기 : " + queue.size());
		
	}

}
