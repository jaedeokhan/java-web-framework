package workshop02;

public class RandomFootTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 우선, 각 팀에 최진호, 박인재, 이재혁 학생을 조장으로 배치한다.
		// 나머지 학생들을 나머지 팀 인원으로 배치하여 총 3팀을 랜덤하게 구성하여 출력한다.
		// 최종적으로 3개의 배열에 각 학생들의 참조되게 처리한다.
		
		// 1. 0~4번의 인덱스의 학생들을 랜덤으로 담는다.
		// 2. 
			
		String[][] team = new String[5][6];
		String[] player = {"고상록", "배재언", "김준식", "김똥개", "박뭐시",
						   "a", "b", "c", "d", "e",
						   "f", "g", "h", "i", "j", 
						   "k", "l", "m", "n", "o",
						   "p", "q", "r", "s", "t", 
						   "u", "v", "w", "x", "z"};
		int leaderCount = 0;
		int memberCount = 0;
		// 1. 팀의 조장을 각각 배치한다.
		// 2. 각 팀에 조장이 존재하는지 중복 체크를 한다.
		//   
		for (int i = 0; i < team.length; i++) {
			int leader  = (int)(Math.random() * 5);
			if(player[leader] == null) {
				leaderCount++;
			} else {
				team[i][0] = player[leader];
				player[leader] = null;
				
			}
			leaderCount++;
			
		}
		
		for (int i = 0; i < team.length; i++) {
			for (int j = 1; j < team[i].length; j++) {
				int member  = (int)(Math.random() * 25 + 5);
				if(player[member] == null) {
					j--;
				} else {
					team[i][j] = player[member];
					player[member] = null;
				}
				memberCount++;
			}
		}
		
		
		for (int i = 0; i < team.length; i++) {
			System.out.println(i + 1 + "팀");
			System.out.println("조장 : " + team[i][0]);
			System.out.print("팀원 : ");
			for (int j = 1; j < team[i].length; j++) {
				System.out.print(team[i][j] + " ");
			}
			System.out.println("\n");
		}
		System.out.println("팀장을 구한 count : " + leaderCount);
		System.out.println("팀원을 구한 count : " + memberCount);
		
	}
}
