package workshop02;

public class EqualsArray {

	public static void main(String[] args) {
		// 배열 항목을 하나씩 가져와서 출력하는 예제
		// array 항목중에 index가 2인 three가 되면 while문을 빠져나간다.
		// stop 플래그 변수를 이용해서 코드를 작성
		
		String[] array = {"one", "two", "three", "four"};
		boolean stop = false;
		int index = 0;
		while(!stop) {
			String item = array[index];
			if(item.equals("three")) {
				System.out.println("현재 값은 : " + array[index] +  "입니다.");
				stop = true;
			} else {
				System.out.println(item);
				index++;
			}
		}
	}

}
