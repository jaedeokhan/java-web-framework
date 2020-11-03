
public class ConvertBinaryToHex {

	public static void main(String[] args) {
		// 16���� ���� 2������ ������ �����ϴ� ����
		char[] hex = {'C' , 'A', 'F', 'E'};
		
		// C : 12, A : 10, F : 15, E : 14
		String[] binary = {
			"0000", "0001", "0010", "0011", 
			"0100", "0101", "0110", "0111",
			"1000", "1001", "1010", "1011",
			"1100", "1101", "1110", "1111"
		};
		
		// hex �迭�� ����� ���ڵ��� 2������ ������ ���� ���ڿ��� ������ ���� ����
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
