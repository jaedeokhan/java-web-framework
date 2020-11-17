//String Ŭ�������� �����Ǵ� �޼ҵ��

public class StringTest {

   public static void main(String[] args) {
      String source1 = "aaabbbcccdddeeefffaaabbbcccdddeeefff";
      String source2 = "AAAbbbcccdddeeefffaaabbbcccdddeeefff";
      
      //1. char charAt(int index)
      //���ڷ� ������ �ε��� ��ġ�� �����ϳ��� ��ȯ.
      System.out.println(source1);
      System.out.println("���� ���ڿ��� 0��° �ε��� �� : " + "source1.charAt(0) : " 
                     + source1.charAt(0));
      
      //2. int indexOf(String searchStr)
      //�������ڿ����� ���ڷ� ������ ���ڿ��� ���۵Ǵ� �ε��� ��ȣ ��ȯ
      System.out.println("���� ���ڿ����� bbb ���ڿ��� ���۵Ǵ� �ε��� ��ȣ : " + "source1.indexOf(\"bbb\") : " 
                        + source1.indexOf("bbb"));
      
      //3. int lastIndexOf(String searchStr)
      //�������ڿ����� ���ڷ� ������ ���ڿ��� �ڿ��� ���� ã�Ƽ�
      //���۵Ǵ� �ε��� ��ȣ ��ȯ
      System.out.println("�������ڿ����� bbb ���ڿ��� �ڿ������� ã�Ƽ�" + "���۵Ǵ� �ε��� ��ȣ : "
                   + "source1.lastIndexOf(\"bbb\") : " + source1.lastIndexOf("bbb"));
      
      //4.String substring(int startIndex)
      //�������ڿ����� ���ڷ� ������ �ε��� ��ġ ���ں��� ������ ���ڱ��� ��ȯ
      System.out.println("3�� �ε��� ���ں��� ������ ���ڱ��� ��ȯ : source1.substring(3) : " 
                     + source1.substring(3));
      
      //5.String substring(int startIndex, int endIndex)
      //�������ڿ����� startIndex ���� endIndex - 1�� �ε��� ���ڱ��� ��ȯ.
      System.out.println("3�� �ε��� ���� 5���ε������� : source1.substring(3,6) : " 
            + source1.substring(3 , 6));
      
      //6.String replace(String oldStr, String newStr)
      //�������ڿ����� oldStr�� newStr���� ��ȯ����.
      System.out.println("�������ڿ����� aaa�� ggg�� ���� source1.replace(\"aaa\",\"ggg\") : " + 
                  source1.replace("aaa","ggg"));
      
      //7. boolean endsWith(String endStr)
      //�������ڿ��� ���ڷ� ������ ���ڿ��� ���������� �Ǵ�
      //�ַ� Ȯ���ڸ� Ȯ���Ҷ� ����.
      System.out.println("�������ڿ��� fff�� ���������� Ȯ��! source1.endsWith(\"fff\"): "
                        + source1.endsWith("fff"));
      
      //8. boolean startsWith(String startStr)
      //�������ڿ��� ���ڷ� ������ ���ڿ��� ���۵Ǵ��� �Ǵ�.
      System.out.println("�������ڿ��� aaa�� �����ϴ¸� Ȯ��! source1.startsWith(\"aaa\"): "
                        + source1.startsWith("aaa"));
      
      //9. boolean contains(String str)
      //�������ڿ��� ���ڷ� ������ ���ڿ��� ���ԵǴ��� Ȯ��
      System.out.println("�������ڿ��� fff���ڿ��� ���ԵǴ��� Ȯ�� source1.contains(\"fff\") : "
                        + source1.contains("fff"));
      
      //10. int length()
      //���ڿ��� ũ�� ��ȯ
      System.out.println("�������ڿ��� ���� ���� source1.length() : " + source1.length());
      
      //11. boolean equals() : ��ҹ��� �����ؼ� �� 
      
      //12. boolean equalsIgnoreCase(String str)
      //��ҹ��� ���о��� ��
      System.out.println("equals : " + source1.equals(source2));
      System.out.println("equalsIgnoreCase : " + source1.equalsIgnoreCase(source2));
      
      //13. toUpperCase(), toLowerCase()  �빮�ڷ� �ٲٱ� // �ҹ��ڷ� �ٲٱ�
      System.out.println("source1.toUpperCase() : " + source1.toUpperCase());
      System.out.println("source2.toLowerCase() : " + source2.toLowerCase());
      
      //14. String[] split(String delims)
      //�������ڿ��� ���ڷ� ������ ���� ���ڿ��� �и�
      String source3 = "aaa,bbb,ccc";
      String[] splitStr = source3.split(",");
      System.out.println("�������ڿ� : " + source3);
      
      System.out.println("�и��� ���ڿ�");
      for(String str : splitStr) {
         System.out.println(str);
      }
      
      //15. String trim()
      //���ڿ� �յڷ� ���� ���� 
      String source4 = " java ";
      System.out.println("�������ڿ� : '" + source4 + "'");
      System.out.println("������ ������ ���ڿ� : '" + source4.trim() + "'");
      
      

   }

}