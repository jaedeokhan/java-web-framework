// 모든 학생들의 국어, 영어, 수학 과목별 총점
// 각 학생들의 총점과 평균을 구하는 예제
public abstract class CalculateStudentScore {

	public static void main(String[] args) {
		
		int scores[][] = new int[5][3];
		
		for (int i = 0; i < scores.length; i++) {
			for (int j = 0; j < scores[i].length; j++) {
				scores[i][j] = (int)(Math.random() * 20) + 80;
				System.out.print(scores[i][j] + " ");
			}
			System.out.println();
		}
		
		int koreanTotal = 0;
		int englistTotal = 0;
		int mathTotal = 0;
		int sum = 0;
		
		System.out.println("번호 국어 영어 수학 총점 평균");
		System.out.println("=============================");

		for (int i = 0; i < scores.length; i++) {
			koreanTotal += scores[i][0];
			englistTotal += scores[i][1];
			mathTotal += scores[i][2];
			
			System.out.print(" " + (i + 1) + " ");
			for (int j = 0; j < scores[i].length; j++) {
				sum += scores[i][j];
				System.out.print(scores[i][j] + " ");
			}
			System.out.println(sum + " " + sum / (float)scores[i].length);
		}
		
/*
		  for (int i = 0; i < scores.length; i++) { 
			  for (int j = 0; j < scores[i].length; j++) { 
				  if(j == 0) { 
					  koreanTotal += scores[i][j]; 
				  } else if(j == 1) { 
					  englistTotal += scores[i][j]; 
				  } else if(j == 2) {
					  mathTotal += scores[i][j]; 
				  }
			 }
		}
*/	 
		
		System.out.println("==================================");
		System.out.println("국어 총점 : " + koreanTotal);
		System.out.println("영어 총점 : " + englistTotal);
		System.out.println("수학 총점 : " + mathTotal);
		
		
		
		

	}

}
