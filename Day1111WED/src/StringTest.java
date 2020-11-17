//String 클래스에서 제공되는 메소드들

public class StringTest {

   public static void main(String[] args) {
      String source1 = "aaabbbcccdddeeefffaaabbbcccdddeeefff";
      String source2 = "AAAbbbcccdddeeefffaaabbbcccdddeeefff";
      
      //1. char charAt(int index)
      //인자로 지정된 인덱스 위치의 문자하나를 반환.
      System.out.println(source1);
      System.out.println("원본 문자열의 0번째 인덱스 값 : " + "source1.charAt(0) : " 
                     + source1.charAt(0));
      
      //2. int indexOf(String searchStr)
      //원본문자열에서 인자로 지정된 문자열이 시작되는 인덱스 번호 반환
      System.out.println("원본 문자열에서 bbb 문자열이 시작되는 인덱스 번호 : " + "source1.indexOf(\"bbb\") : " 
                        + source1.indexOf("bbb"));
      
      //3. int lastIndexOf(String searchStr)
      //원본문자열에서 인자로 지정된 문자열을 뒤에서 부터 찾아서
      //시작되는 인덱스 번호 반환
      System.out.println("원본문자열에서 bbb 문자열을 뒤에서부터 찾아서" + "시작되는 인덱스 번호 : "
                   + "source1.lastIndexOf(\"bbb\") : " + source1.lastIndexOf("bbb"));
      
      //4.String substring(int startIndex)
      //원본문자열에서 인자로 지정된 인덱스 위치 문자부터 마지막 문자까지 반환
      System.out.println("3번 인덱스 문자부터 마지막 문자까지 반환 : source1.substring(3) : " 
                     + source1.substring(3));
      
      //5.String substring(int startIndex, int endIndex)
      //원본문자열에서 startIndex 부터 endIndex - 1번 인덱스 문자까지 반환.
      System.out.println("3번 인덱스 부터 5번인덱스까지 : source1.substring(3,6) : " 
            + source1.substring(3 , 6));
      
      //6.String replace(String oldStr, String newStr)
      //원본문자열에서 oldStr을 newStr으로 전환해줌.
      System.out.println("원본문자열에서 aaa를 ggg로 변경 source1.replace(\"aaa\",\"ggg\") : " + 
                  source1.replace("aaa","ggg"));
      
      //7. boolean endsWith(String endStr)
      //원본문자열이 인자로 지정된 문자열로 끝나는지를 판단
      //주로 확장자를 확인할때 사용됨.
      System.out.println("원본문자열이 fff로 끝나는지를 확인! source1.endsWith(\"fff\"): "
                        + source1.endsWith("fff"));
      
      //8. boolean startsWith(String startStr)
      //원본문자열이 인자로 지정된 문자열로 시작되는지 판단.
      System.out.println("원본문자열이 aaa로 시작하는를 확인! source1.startsWith(\"aaa\"): "
                        + source1.startsWith("aaa"));
      
      //9. boolean contains(String str)
      //원본문자열에 인자로 지정된 문자열이 포함되는지 확인
      System.out.println("원본문자열에 fff문자열이 포함되는지 확인 source1.contains(\"fff\") : "
                        + source1.contains("fff"));
      
      //10. int length()
      //문자열의 크기 반환
      System.out.println("원본문자열의 문자 개수 source1.length() : " + source1.length());
      
      //11. boolean equals() : 대소문자 구분해서 비교 
      
      //12. boolean equalsIgnoreCase(String str)
      //대소문자 구분없이 비교
      System.out.println("equals : " + source1.equals(source2));
      System.out.println("equalsIgnoreCase : " + source1.equalsIgnoreCase(source2));
      
      //13. toUpperCase(), toLowerCase()  대문자로 바꾸기 // 소문자로 바꾸기
      System.out.println("source1.toUpperCase() : " + source1.toUpperCase());
      System.out.println("source2.toLowerCase() : " + source2.toLowerCase());
      
      //14. String[] split(String delims)
      //원본문자열을 인자로 지정된 구분 문자열로 분리
      String source3 = "aaa,bbb,ccc";
      String[] splitStr = source3.split(",");
      System.out.println("원본문자열 : " + source3);
      
      System.out.println("분리된 문자열");
      for(String str : splitStr) {
         System.out.println(str);
      }
      
      //15. String trim()
      //문자열 앞뒤로 공백 제거 
      String source4 = " java ";
      System.out.println("원본문자열 : '" + source4 + "'");
      System.out.println("공백을 제거한 문자열 : '" + source4.trim() + "'");
      
      

   }

}