//code by Khalil M
package javaFinal_WarGame;

public class Card {

	int value;
	String name;
	public Card (int value, String suit) {
		this.value = value;
		
//Create the values of the card per suit		
		switch (value) {
		case 2:
			name = "Two of "; break;
		case 3:
			name = "Three of "; break;
		case 4:
			name = "Four of "; break;
		case 5:
			name = "Five of "; break;
		case 6:
			name = "Six of "; break;
		case 7:
			name = "Seven of "; break;
		case 8:
			name = "Eight of "; break;
		case 9:
			name = "Nine of "; break;
		case 10:
			name = "Ten of "; break;
		case 11:
			name = "Jack of "; break;
		case 12:
			name = "Queen of "; break;
		case 13:
			name = "King of "; break;
		case 14:
			name = "Ace of "; break;
		}
		
		name += suit;
		
		
	}
	public void describe () {
		System.out.println(name);
	}
	public int getValue() {
		return value;
	}
	public void setValue (int value) {
		this.value=value;
	}
	
	
	
	
	
	
	
	
	
}
