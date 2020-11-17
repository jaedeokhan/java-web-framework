import java.util.LinkedList;

public class QueueTest {

	public static void main(String[] args) {
		
		String[] flowerArray = {"������", "���", "��ȭ", "���Ȳ�", "����ȭ��"};
		LinkedList<String> queue = new LinkedList<String>();
		
		for(String flower : flowerArray) {
			queue.offer(flower);
		}
		System.out.println("queue ũ�� : " + queue.size());
		
		String data = "";
		while((data = queue.poll()) != null) {
			System.out.println(data + " ����"); // poll�� �����͸� �����ͼ� �����ϴ� ���̴�.
		}
		
		System.out.println("queue ũ�� : " + queue.size());
		
	}

}
