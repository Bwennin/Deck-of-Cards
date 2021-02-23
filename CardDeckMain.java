public class CardDeckMain {
  public static void main(String[] args) {
    CardDeck deck = new CardDeck();
    
    // Prints the deck (full) and hand (empty).
    System.out.println("Initialized deck:");
    deck.printDeck();
    System.out.println("Initialized hand:");
    deck.printHand();
    
    // Attempts to draw too many cards.
    System.out.println("Attempt to draw too many cards:");
    deck.draw(55);
    System.out.println();
    
    // Draws top card (Ace of Clubs) from the deck into hand.
    deck.draw(1);
    System.out.println("Deck after draw:");
    deck.printDeck();
    System.out.println("Hand after draw:");
    deck.printHand();
    
    // Cuts the deck at a random point.
    deck.cut();
    System.out.println("Deck after cut:");
    deck.printDeck();
    
    // Shuffles the deck.
    deck.shuffle();
    System.out.println("Deck after shuffle:");
    deck.printDeck();
  }
}
