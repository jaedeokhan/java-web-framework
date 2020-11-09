package workshop01.exam03;

public class SutdaDeck {
	
	// ����ī�� 20���� �����ϴ� ����ī�� �� ���� Ŭ������ ������ ���̴�.
	// ����ī�� 20���� ��� StudaCard�� �迭�� �ʱ�ȭ����
	// ��, ����ī��� 1���� 10������ ���ڰ� ���� ī�尡 �� �־� �ְ�, 
	// ���ڰ� 1,3,8�� ��쿡�� �� ���� ������ ���̾�� �Ѵ�.
	// ��, StudaCard�� �ν��Ͻ����� isKwang�� ���� true�̾�� �Ѵ�.
	
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		// 1 : �迭 StduaCard�� ������ �ʱ�ȭ�ض�.
		for (int i = 0; i < cards.length; i++) {
			
			// 1. 20���� �־��.
			// 2. 1~10�� ���ڰ� 2��
			// 3. 1,3,8�� �� �߿� �� ���ڴ� ���̾�� �Ѵ�.
			int num = i % 10 + 1;
			boolean isKwang = (((i >= 10) && (num < 10)) && (num == 1 || num == 3 || num == 8)) ?
					true : false;
			cards[i] = new SutdaCard(num, isKwang);
			
		}
	}
	void shuffle() { // ī���� ��ġ�� ���´�.
		int index = -1;
		for (int i = 0; i < cards.length; i++) {
			index = (int)(Math.random() * 20);
			SutdaCard temp = cards[i];
			cards[i] = cards[index];
			cards[index] = temp;
		}
	}
	
	SutdaCard pick(int index) { // ������ ��ġ�� StudaCard�� ��ȯ�Ѵ�.
		return cards[index];
	}
	
	SutdaCard pick() { // ������ ��ġ�� StudaCard�� ��ȯ 
		int index = (int)(Math.random() * 20);
		return cards[index];
	}
	
}

class SutdaCard {
	int num;
	boolean isKwang;
	SutdaCard() {
		this(1, true);	
	}

	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info() ��� Object Ŭ������ toString()�� �������̵��ؼ� ���
	@Override
	public String toString() {
		return num + ( isKwang ? "K" : "");
	}
	
	
}

