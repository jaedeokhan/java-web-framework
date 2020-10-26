
public class WhileNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("===== while로 중첩 for문을 두 번 사용 =====");
		int i = 1;
		while(i <= 5) {
			int j = 1;1
			while(j <= i) {
				System.out.print("#");
				j++;
			}
			System.out.println();
			i++;
		}
		
		int i2 = 1;
		while(i2 <= 5) { // 1. 조건 (1 <= 5), (2 <= 5) 
			int j2 = 1;  // j2 = 1
			while(j2 <= 6 - i2) { // 2. 조건 (1 <= 5), (2 <= 5), (3 <= 5)...(6 <= 5)
				System.out.print("#"); 
				j2++;
			}
			System.out.println();
			i2++;
		}
		
		System.out.println("===== 중첩 for문에서 if-else 분기처리 =====");
		int i3 = 1;
		while(i3 <= 10) {
			int j3 = 1;
			if(i3 <= 5) {
				while(j3 <= i3) {
					System.out.print("#");
					j3++;
				}
				System.out.println();
			} else {
				while(j3 <= 11 - i3) {
					System.out.print("#");
					j3++;
				}
				System.out.println();
			}
			i3++;
		}
		
		
		
	}

}
