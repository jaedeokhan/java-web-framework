package workshop;

public class PresentorGenerator {
	public static void main(String[] args) {
		String[] studentArray  =  new String[]{
			"권성현", "김병학", "김은주", "김지연", "김태환",
			"남동주", "김지은", "배성민", "안효재", "양성웅",
			"이재우", "이정화", "이지수", "이지호", "이진일",
			"이하얀나래봄", "장근철", "정우준", "한재덕"
	};
		
		String[] temp = new String[7];
		for (int i = 0; i <= 6; i++) {
			String presentor = studentArray[(int)(Math.random() * 19)];
			temp[i] = presentor;
			for (int j = 0; j <= i - 1; j++) {
				while(temp[i] == temp[j]) {
					presentor = studentArray[(int)(Math.random() * 19)];
				}
			}
			System.out.println( (i+1) + "번 : "+ presentor);
			
		}
	}
}
