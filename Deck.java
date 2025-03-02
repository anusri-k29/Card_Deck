//Deck.java
import java.util.*;

class Deck{
	ArrayList<Card> deck;	//object of card.java, will take rank and suit
	public Deck(){
		this.deck = new ArrayList<>();
		createDeck(); 
	}
	
	// method to create a deck
	public void createDeck(){
		//string array of ranks and suits
		String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[] suits = {"Clubs","Spades","Diamonds","Hearts"};
		
		for (String rank : ranks){
			for (String suit:suits){
				deck.add(new Card(rank,suit));
			}
		}
	}
	//print deck
	public void displayDeck(){
		for(Card card : deck){
			System.out.println(card);
		}
	
	}
	//shuffle deck
	public void shuffleDeck() {
		Collections.shuffle(deck);
		
	}
	
	//select 5 random cards from deck
	public void randomCards() {
        shuffleDeck(); // Shuffle the deck before picking
	        System.out.println(deck.get(0)); //first random card
	        System.out.println(deck.get(1)); //second random card
		System.out.println(deck.get(2));//third random card
		System.out.println(deck.get(3));//fourth random card
		System.out.println(deck.get(4));//fifth random card
		}
	//distribute cards between 5 players 
	public void players() {
        shuffleDeck(); // Shuffle before distributing

        // Creating lists for each player
        ArrayList<Card> player1 = new ArrayList<>();
        ArrayList<Card> player2 = new ArrayList<>();
        ArrayList<Card> player3 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            player1.add(deck.remove(0));
            player2.add(deck.remove(0));
            player3.add(deck.remove(0));
        }

        System.out.println("Player 1's cards: " + player1);
        System.out.println("Player 2's cards: " + player2);
        System.out.println("Player 3's cards: " + player3);
    }
	
	//sameCard()
	public void sameCard(String suit) {
        System.out.println("Cards with suit " + suit + ":");
        for (Card card : deck) {
            if (card.suit.equalsIgnoreCase(suit)) {
                System.out.println(card);
            }
        }
    }
	//compareCard()
  	public void compareCard(String rank) {
        System.out.println("Cards with rank " + rank + ":");
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank)) {
                System.out.println(card);
            }
        }
    }
	//find card()
	//find card()
	public void findCard(String rank, String suit) {
        for (Card card : deck) {
            if (card.rank.equalsIgnoreCase(rank) && card.suit.equalsIgnoreCase(suit)) {
                System.out.println("Card found: " + card);
                return;
            }
        }
        System.out.println("Card not found");
    }	
}
