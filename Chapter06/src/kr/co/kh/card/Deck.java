package kr.co.kh.card;

public class Deck extends Card {

	// private String[] cardDeck; 원래는 이렇게 써야하지만 상속받았기 때문에 []생략
	private String[] cardDeck;

	
	
	public String[] getCardDeck() {
		return cardDeck;
	}



	public void setCardDeck(String[] cardDeck) {
		this.cardDeck = cardDeck;
	}



	public Deck() {
		super();
		cardDeck = new String[52];
		int count = 0;
		
		for(int i=0;i<getType().length;i++) {
			for(int j=0;j<getNum().length;j++) {
				String[] type = getType();
				//String [] num = getNum(); => 추가해주면 밑에 getNum()[j]이 Num[j]로 바꿀 수 있음
				cardDeck[count] = type[i] + " " + getNum()[j];
				System.out.println(cardDeck[count]+",");
				count++;
			}
		}
	}
	
	
}
