
public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		float average = 0.1f;
		
		int[] score = {100, 99, 90, 89, 98};
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		average = (float)sum / score.length;
		
		System.out.println("ЦђБе : " + average);
		
	}

}
