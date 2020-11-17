import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		
		String[] houseArray = new String[] {
			"����", "��Ʈ�Ͽ콺", "����", "����Ʈ", "���ǽ���"
		};
		
		Stack<String> stack = new Stack<String>();
		for (String house : houseArray) {
			stack.push(house);
		}
		
		// ���
		while (!stack.isEmpty()) {
			// isEmpty()�� Collection �������̽����� ����
			// �÷��ǿ� ��Ұ� �ϳ��� ������ true ��ȯ
			System.out.println(stack.pop());
		}
		
	}
}
