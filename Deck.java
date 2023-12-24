package javaFinal_WarGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

List <Card> cards = new ArrayList<Card>();
String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};

	Deck ()
	{
		int [] nums = {2,3,4,5,6,7,8,9,10,11,12,13,14};
		
		for (String suit: suits) {
			int count = 2;
			for (Integer num: nums) {
			cards.add(new Card (num, suit));
			count ++;
			}	
		}
		
		
	}
	public void describe () {
		for (Card card : this.cards) {
			card.describe();
		}
		}
	public void shuffleCards() {
		Collections.shuffle(cards);
	}
	public Card drawCard () {
		Card card = cards.remove(0);
		return card;
	}
}
