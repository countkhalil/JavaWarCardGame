package javaFinal_WarGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private int score;
	
	private String name;
	
	private List<Card> hand = new ArrayList<Card>();
	
	
	public Player () {}
	
	
	public Player (String name, List<Card> hand, int score) {
		this.setName(name);
		this.hand=hand;
		this.setScore(0);
	}

	public void draw (Deck deck) {
		hand.add(deck.drawCard());
	}
public Card flipCard () {
	return hand.remove(0);
}
	
//addPoints instead of increment score
public void addPoints() {
	setScore(getScore() + 1);
}


public int getScore() {
	return score;
}


public void setScore(int score) {
	this.score = score;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}
	


















}
