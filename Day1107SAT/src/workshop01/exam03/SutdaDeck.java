package workshop01.exam03;

public class SutdaDeck {
	
	// 섯다카드 20장을 포함하는 섯다카드 한 벌을 클래스를 정의한 것이다.
	// 섯다카드 20장을 담는 StudaCard의 배열의 초기화래라
	// 단, 섯다카드는 1부터 10까지의 숫자가 적힌 카드가 한 쌍씩 있고, 
	// 숫자가 1,3,8인 경우에는 둘 중의 한장은 광이어야 한다.
	// 즉, StudaCard의 인스턴스변수 isKwang의 값이 true이어야 한다.
	
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	SutdaDeck() {
		// 1 : 배열 StduaCard를 적절히 초기화해라.
		for (int i = 0; i < cards.length; i++) {
			
			// 1. 20장을 넣어라.
			// 2. 1~10의 숫자가 2쌍
			// 3. 1,3,8은 둘 중에 한 숫자는 광이어야 한다.
			int num = i % 10 + 1;
			boolean isKwang = (((i >= 10) && (num < 10)) && (num == 1 || num == 3 || num == 8)) ?
					true : false;
			cards[i] = new SutdaCard(num, isKwang);
			
		}
	}
	void shuffle() { // 카드의 위치를 섞는다.
		int index = -1;
		for (int i = 0; i < cards.length; i++) {
			index = (int)(Math.random() * 20);
			SutdaCard temp = cards[i];
			cards[i] = cards[index];
			cards[index] = temp;
		}
	}
	
	SutdaCard pick(int index) { // 지정된 위치의 StudaCard를 반환한다.
		return cards[index];
	}
	
	SutdaCard pick() { // 임의의 위치의 StudaCard를 반환 
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
	
	// info() 대신 Object 클래스의 toString()을 오버라이딩해서 출력
	@Override
	public String toString() {
		return num + ( isKwang ? "K" : "");
	}
	
	
}

