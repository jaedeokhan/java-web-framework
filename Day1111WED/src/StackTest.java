import java.util.Stack;

public class StackTest {
	public static void main(String[] args) {
		
		String[] houseArray = new String[] {
			"원룸", "팬트하우스", "투룸", "아파트", "오피스텔"
		};
		
		Stack<String> stack = new Stack<String>();
		for (String house : houseArray) {
			stack.push(house);
		}
		
		// 출력
		while (!stack.isEmpty()) {
			// isEmpty()는 Collection 인터페이스에서 제공
			// 컬렉션에 요소가 하나도 없으면 true 반환
			System.out.println(stack.pop());
		}
		
	}
}
