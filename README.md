# 🃏 Card Deck - Java Program

## 📌 Introduction
This Java program simulates a deck of 52 playing cards. It allows users to perform various operations such as shuffling, dealing random cards, finding specific cards, and more through a **menu-driven approach**.

## ⚙️ Features
- **Create a Deck** of 52 cards.
- **Display the Entire Deck** in a structured format.
- **Shuffle the Deck** to randomize card order.
- **Deal 5 Random Cards** from the deck.
- **Find a Specific Card** by rank and suit.
- **Print Cards of the Same Suit** (e.g., all Hearts).
- **Print Cards of the Same Rank** (e.g., all Kings).
- **Distribute Cards Among Players** (optional feature).

---
## 📜 Class & Method Descriptions
1️⃣ Card.java (Represents a Single Card)
- Card(String rank, String suit): Constructor to initialize a card with rank and suit.
- toString(): Returns a string representation of the card (e.g., "Ace of Hearts").

---

## 2️⃣ Deck.java (Deck Management)
- Deck(): Constructor that initializes an empty deck.
- createDeck(): Fills the deck with 52 cards (4 suits × 13 ranks).
- displayDeck(): Prints all cards in the deck.
- shuffleDeck(): Randomizes the order of the cards.
- randomCards(): Prints 5 random cards from the deck.
- players(): Distributes 5 cards each to 3 players.
- sameCard(String suit): Prints all cards of the same suit.
- compareCard(String rank): Prints all cards of the same rank.
- findCard(String rank, String suit): Searches for a specific card and prints if found.

---
## 3️⃣ Main.java (Menu-Driven Interface)
- Contains the main() method.
- Displays a menu for users to select different operations.
- Uses Scanner for input handling.
