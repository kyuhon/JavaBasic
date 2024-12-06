package kr.co.kh.card;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CardMain {

	public static void main(String[] args) {
		//52개 카드를 만들었습니다
		Deck deck = new Deck();
		
		//배열을 ArrayList로 바꿀수 있다
		List<String> list = Arrays.asList(deck.getCardDeck());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(i+" " +list.get(i));
		}
		
		
		Collections.shuffle(list);
		
		for(int i=0; i<list.size(); i++) {
			String cardDeck = deck.getCardDeck()[i];
			System.out.println(i+" "+cardDeck);
		}
		
		
	}

}
