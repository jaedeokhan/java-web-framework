
public class ConvertBinaryToHex {

	public static void main(String[] args) {
		// 16진수 값을 2진수의 값으로 변경하는 예제
		char[] hex = {'C' , 'A', 'F', 'E'};
		
		// C : 12, A : 10, F : 15, E : 14
		String[] binary = {
			"0000", "0001", "0010", "0011", 
			"0100", "0101", "0110", "0111",
			"1000", "1001", "1010", "1011",
			"1100", "1101", "1110", "1111"
		};
		
		// hex 배열에 저장된 문자들을 2진수로 변경한 최종 문자열을 저장할 변수 선언
		String result = "";
		for (int i = 0; i < hex.length; i++) {
			if(hex[i] >= '0' && hex[i] <= '9') {
				result += hex[i] +  " : " + binary[hex[i] - '0'] +  " ";
			} else {
				result += hex[i] +  " : " + binary[hex[i] - 'A' + 10] + " ";
			} 
			
		}
		
		System.out.println(result);
		
	}

}
