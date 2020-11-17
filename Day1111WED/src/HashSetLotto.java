//로또 번호!
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Set<Integer> set = new HashSet<Integer>();
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
      
      // SET은 자동정렬을 지원해주지 않아서 Link 컬렉션을 이용해서 정렬을 한다.
      System.out.println(set);
      List<Integer> list = new LinkedList<Integer>(set);
      // LinkedList(Collection c)
      
      Collections.sort(list);
      
      System.out.println(list);
      
   }

}