import java.io.IOException;

public class InputStreamTest {
	public static void main(String[] args) {
		
		int var_byte = -1;
		System.out.println("���� �ϳ��� �Է��ϼ���.");
		
		do {
			try {
				var_byte = System.in.read();
			} catch (IOException io) {
				io.printStackTrace();
			}
			if (var_byte == 10 || var_byte == 13) continue;
			if (var_byte == -1 ) break;
			System.out.println("������  : " + (char)var_byte);
		} while(true);
		
	}
}
