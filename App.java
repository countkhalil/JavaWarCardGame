package javaFinal_WarGame;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Deck deck = new Deck();
	System.out.println("Use These Cards Wisely");
	
	
	deck.describe();
System.out.println("And After A Few Shuffles");
		
	deck.shuffleCards();	
	System.out.println("The Deck is Now Prepared");	
		System.out.println("~~~~~~~~~~");
		deck.describe();
		
		
		Player player1= new Player();
		Player player2 = new Player();
		
		player1.setName("Challenger #1");
		player2.setName("Challenger #2");
		
		for (int i=0; i<52; i++) {
			if (i%2 == 0) {
				player1.draw(deck);
			}else {
				player2.draw(deck);
			}
		}
		
		System.out.println("\n"+ player1.getName() +", Here Is Your Hand:");
		System.out.println("\n"+ player2.getName() +", Here Is Your Hand:");
		
		System.out.println("\n And Let The Battle Begin");
		int round = 1;
		for (int i =0; i<26; i++) {
			System.out.println("\n Round " + round+ " of the ultimate Battle" );
			round ++;
			Card cardOne = player1.flipCard();
			cardOne.describe();
			Card cardTwo = player2.flipCard();
			cardTwo.describe();
			System.out.println(player1.getName() + " plays a ");
			cardOne.describe();
			System.out.println(player2.getName() + " plays a ");
			cardTwo.describe();
			
			if (cardOne.getValue()> cardTwo.getValue()) {
				player1.addPoints();
				System.out.println("\n" + player1.getName() + " Has Claimed Victory This Round");
			}else if (cardTwo.getValue() > cardOne.getValue()) {
				player2.addPoints();
				System.out.println("\n" + player2.getName() + " Has Claimed Victory This Round");
			
			}else {
				System.out.println("It's a Draw! Still Anybody's Battle");
			}
			System.out.println("The score is: " + player1.getName() + "- " + player1.getScore() + " points to "+ player2.getName() +" " + player2.getScore() + " points");
			
			}
		int player1Score = player1.getScore();
		int player2Score = player2.getScore();
		
		System.out.println("~~~~~~~~~");
		System.out.println(player1.getName()+ " ends with " + player1Score);
		System.out.println(player2.getName()+ " ends with " + player2Score);
		
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println(player1.getName() + " is Victorious");
		}else if (player2.getScore() > player1.getScore()) {
			System.out.println(player2.getName() + " is Victorious");
		}else {
			System.out.println("We Go until there's a Winner! Restart the Battle!");
		}
		
		
		
		
		
		
		
		
		
		
		
}}
