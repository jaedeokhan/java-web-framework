package workshop;

public class IsOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1 - 2 + 3- 4 + 5 - 6 == 100이상이면 나가고 i의 값 구하기
		// 홀수는 더하고
		// 짝수는 빼기
		int i = 1, ans = 0;
		while(ans <= 100) {
			ans = (i % 2 == 1) ? ans + i : ans - i;
			i += 1;
		}
		System.out.println(i);

	}

}
