package tech;

public class exam03 {
	public static void main(String[] args) {
		
		int money = 1000;
		String[] ex = {};
		String[] ac = {};
		int result = money;
		int batting = 100;
	
		
		
		for (int i = 0; i < ex.length; i++) {
			if(ex[i].equals(ac[i])) { // 동전 앞뒤 성공
				// 
				
				
				result += batting;
				batting = 100;
				
			} else { // 실패
				
				result -= batting;
				
				
			}
			
			
			if(result == 0) {
				break;
			}
			
			
			
		}
		
		
	}
}
