
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Set<Integer> set = new TreeSet<Integer>();
	      //배열은 기본타입과 객체타입을 모두 저장할수 있지만
	      //컬렉션은 객체 타입만 저장할 수 있다.
	      
	      for (int i = 0; set.size() < 6; i++) {
	         //size() : Collection 인터페이스에서 제공
	         //요소의 개수 반환 
	         
	         int num = (int)(Math.random() * 45) + 1;
	         set.add(num);
	         //autoBoxing  
	         //자바에서 기본타입의 데이터를 객체타입에 할당하면 
	         //자동으로 객체타입으로 변환되는 기능
	      }
	      
	      // TreeSet은 자동정렬을 지원해준다.
	      System.out.println(set);
	}

}
