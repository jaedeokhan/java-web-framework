package workshop02;

public class RandomFootTeam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �켱, �� ���� ����ȣ, ������, ������ �л��� �������� ��ġ�Ѵ�.
		// ������ �л����� ������ �� �ο����� ��ġ�Ͽ� �� 3���� �����ϰ� �����Ͽ� ����Ѵ�.
		// ���������� 3���� �迭�� �� �л����� �����ǰ� ó���Ѵ�.
		
		// 1. 0~4���� �ε����� �л����� �������� ��´�.
		// 2. 
			
		String[][] team = new String[5][6];
		String[] player = {"����", "�����", "���ؽ�", "��˰�", "�ڹ���",
						   "a", "b", "c", "d", "e",
						   "f", "g", "h", "i", "j", 
						   "k", "l", "m", "n", "o",
						   "p", "q", "r", "s", "t", 
						   "u", "v", "w", "x", "z"};
		int leaderCount = 0;
		int memberCount = 0;
		// 1. ���� ������ ���� ��ġ�Ѵ�.
		// 2. �� ���� ������ �����ϴ��� �ߺ� üũ�� �Ѵ�.
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
			System.out.println(i + 1 + "��");
			System.out.println("���� : " + team[i][0]);
			System.out.print("���� : ");
			for (int j = 1; j < team[i].length; j++) {
				System.out.print(team[i][j] + " ");
			}
			System.out.println("\n");
		}
		System.out.println("������ ���� count : " + leaderCount);
		System.out.println("������ ���� count : " + memberCount);
		
	}
}
