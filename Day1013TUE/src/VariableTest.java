// 변수 : 자바에서 필요한 값을 저장할 수 있는 단위
// 변수를 선언하면 JVM의 Stack영역에 해당 변수 영역이 생긴다
// 해당 변수 영역에 값을 할당하고 필요할 때 가져다 사용할 수 있다.
public class VariableTest {
	public static void main(String[] args) {
		// 변수 선언방법
		// 데이터타입 변수이름 = 값;
		int kor = 90;
		int math = 1;
		int eng = 90;
		
		System.out.println("kor = " + kor);
		System.out.println("math = " + math);
		System.out.println("eng = " + eng);
		
		// 총점
		int total = kor + math + eng;
		System.out.println("total = " + total);
		
		// 평균
		int avg = total / 3;
		System.out.println("avg = " + avg);
		
	}
}
