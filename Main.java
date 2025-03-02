//Main.java
//Anusri Kadam
//23070126016
//AIML A1
import java.util.*;
class Main{
	public static void main(String args[]){
		Deck deck = new Deck();
		System.out.println("*********Creating Deck*********");
		deck.createDeck();
		System.out.println("*********Printing Deck*********");
		deck.displayDeck();
		System.out.println("*********Shuffling Deck********");
		deck.shuffleDeck();
		deck.displayDeck();
		System.out.println("****2 Random Cards from Deck****");
		deck.randomCards();
		System.out.println("*****Distribute cards to 3 players*****");
		deck.players();
	}
	
}	 
