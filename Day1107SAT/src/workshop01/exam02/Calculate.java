package workshop01.exam02;

public class Calculate {
	
	public int getFactorial(int num) {
		
		int factorial = 1;
		
		for (int i = num; i >= 1; i--) {
			factorial *=  i; 
		}
		
		return factorial;
	}
	
	public int getPower(int num) {
		
		int power = 0;
		
		for (int i = 1; i <= num; i++) {
			power  +=  i * i;
		}
		
		return power;
	}
	
}
