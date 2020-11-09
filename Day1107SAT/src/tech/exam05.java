package tech;

public class exam05 {
	public static void main(String[] args) {
		
		// result
		// 10 00 (00) (01) 00 (10) 00 (11) 11
		 
		// 조건1> penter 는 data 앞에
		// 조건2> pescape는 data 뒤에
		// 조건3> penter, pexit, pescape가 데이터와 동일하다면 data 앞에 pescape를 붙인다.
		
		 String penter = "10";
		 String pexit = "11";
		 String pescape = "00";
		 String data = "00011011";
		 String answer = "";
		 // 1100 1001 1100 1100 1001 1100 1001 1100 1100 0010 0010 0010 0010 0010 0010
		 // 1100 1101 1001 1001 1001 0010 1111 0011 1001 1100 0000 001
		 
		 
			
		// penter  10
		// pexit   11
		// pescape 00
		
		// data 
		// 00 01 10 11
		 
		 // 00 10 (00) (10) 00 (10) 11 (11) 11 => 내가 한 것
		 // 10 00 (00) 00 00 (01) 00 (10) 00 (11) 11
		 // 10 00 (00) (01) 00 (10) 00 (11) 11 => 정답
		 String[] temp = data.split("");
		 String[] theTemp = new String[data.length()/ penter.length()];
		 int index = 0;
		 
		for (int i = 0; i < data.length(); i++) {
			if(i % penter.length() == 0) {
				theTemp[index++] = data.substring(i, i + penter.length());
			}
		}
	
		for (int i = 0; i < theTemp.length; i++) {
			
			if(theTemp[i].equals(penter)) {
				answer += pescape + theTemp[i];
				System.out.println("penter : " + answer);
			} else if(theTemp[i].equals(pescape)) {
				answer += pescape + theTemp[i];
				System.out.println("psecape : " + answer);
			} else if(theTemp[i].equals(pexit)) {
				answer += pescape + theTemp[i];
				System.out.println("pexit : " + answer);
			} else {
				answer += theTemp[i]; // 시발!!
			}
			
		}
		
		
		answer = penter + answer;
		answer = answer + pexit;
		
		System.out.println(answer);
		 
		 
		
		
	}
}
