//�ζ� ��ȣ!
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetLotto {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      Set<Integer> set = new HashSet<Integer>();
      //�迭�� �⺻Ÿ�԰� ��üŸ���� ��� �����Ҽ� ������
      //�÷����� ��ü Ÿ�Ը� ������ �� �ִ�.
      
      for (int i = 0; set.size() < 6; i++) {
         //size() : Collection �������̽����� ����
         //����� ���� ��ȯ 
         
         int num = (int)(Math.random() * 45) + 1;
         set.add(num);
         //autoBoxing  
         //�ڹٿ��� �⺻Ÿ���� �����͸� ��üŸ�Կ� �Ҵ��ϸ� 
         //�ڵ����� ��üŸ������ ��ȯ�Ǵ� ���
      }
      
      // SET�� �ڵ������� ���������� �ʾƼ� Link �÷����� �̿��ؼ� ������ �Ѵ�.
      System.out.println(set);
      List<Integer> list = new LinkedList<Integer>(set);
      // LinkedList(Collection c)
      
      Collections.sort(list);
      
      System.out.println(list);
      
   }

}