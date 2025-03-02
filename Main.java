//Main.java
//Anusri Kadam
//23070126016
//AIML A1
import java.util.*;
class Main{
	public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Print Deck");
            System.out.println("2. Shuffle Deck");
            System.out.println("3. Deal 5 Random Cards");
            System.out.println("4. Find Card");
            System.out.println("5. Print Cards of Same Suit");
            System.out.println("6. Print Cards of Same Rank");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            
            switch (choice) {
                case 1:
                    deck.displayDeck();
                    break;
                case 2:
                    deck.shuffleDeck();
                    System.out.println("Deck shuffled.");
                    break;
                case 3:
                    deck.randomCards();
                    break;
                case 4:
                    System.out.print("Enter rank: ");
                    String rank = scanner.nextLine();
                    System.out.print("Enter suit: ");
                    String suit = scanner.nextLine();
                    deck.findCard(rank, suit);
                    break;
                case 5:
                    System.out.print("Enter suit: ");
                    String sameSuit = scanner.nextLine();
                    deck.sameCard(sameSuit);
                    break;
                case 6:
                    System.out.print("Enter rank: ");
                    String sameRank = scanner.nextLine();
                    deck.compareCard(sameRank);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, try again.");
            }
        } while (choice != 7);
        scanner.close();
    }
}
