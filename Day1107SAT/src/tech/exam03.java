package tech;

public class exam03 {
	public static void main(String[] args) {
		
		int money = 1000;
		String[] ex = {};
		String[] ac = {};
		int result = money;
		int batting = 100;
	
		
		
		for (int i = 0; i < ex.length; i++) {
			if(ex[i].equals(ac[i])) { // ���� �յ� ����
				// 
				
				
				result += batting;
				batting = 100;
				
			} else { // ����
				
				result -= batting;
				
				
			}
			
			
			if(result == 0) {
				break;
			}
			
			
			
		}
		
		
	}
}
