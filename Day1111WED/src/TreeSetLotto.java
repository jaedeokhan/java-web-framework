
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      Set<Integer> set = new TreeSet<Integer>();
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
	      
	      // TreeSet�� �ڵ������� �������ش�.
	      System.out.println(set);
	}

}
