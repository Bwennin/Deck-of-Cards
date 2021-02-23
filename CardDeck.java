import java.util.Random;
import java.util.Arrays;

public class CardDeck {
  private Card[] deck = new Card[52];
  private Card[] hand = new Card[0];
  private int cardsInHand = 0;
  
  // Constructs a new ordered card deck.
  public CardDeck() {
    int counter = 0;
    for(int i = 1; i < 14; i++) {
      deck[counter++] = new Card(i, "Clubs");
      deck[counter++] = new Card(i, "Diamonds");
      deck[counter++] = new Card(i, "Hearts");
      deck[counter++] = new Card(i, "Spades");
    }
  }
  
  // Removes cards from the top of the deck and adds them to hand.
  public void draw(int numDeck) {

    // Exits if the number of cards to draw is more than are available.
    if(deck.length < numDeck) {
      System.out.println("Not enough cards left in the deck.");
      return;
    }

    // Redeclares hand array with larger size to hold additional cards.
    hand = Arrays.copyOf(hand, hand.length + numDeck);
    
    for(int i = 0; i < numDeck; i++) {
      // Copies top card from deck into hand.
      hand[cardsInHand] = deck[0];
      cardsInHand++;

      // Removes drawn card from deck by reassigning
      // deck without the Card at index 0.
      if(deck.length > 1)
        deck = Arrays.copyOfRange(deck, 1, deck.length);
      else {
        deck = new Card[0];
        System.out.println("Deck is empty.");
      }
    }
  }
  
  // Shuffles the deck by randomly swapping
  // locations of cards two at a time.
  public void shuffle() {
    Random rand = new Random();
    int index = 0;
    for(int h = 0; h < 3; h++) {
      for(int i = 0; i < deck.length; i++) {
        index = rand.nextInt(deck.length);
        Card temp = deck[0];
        deck[0] = deck[index];
        deck[index] = temp;
      }
    }
  }
  
  public void cut() {
    if(deck.length > 1) {
      Random rand = new Random();
      int cutIndex = rand.nextInt(deck.length - 1) + 1;
      
      // Separates the halves into new arrays by the cutIndex,
      // then combines them in reverse order using arraycopy.
      Card[] topHalf = Arrays.copyOfRange(deck, 0, cutIndex);
      Card[] bottomHalf = Arrays.copyOfRange(deck, cutIndex, deck.length);
      Card[] newDeck = new Card[deck.length];
      System.arraycopy(bottomHalf, 0, deck, 0, bottomHalf.length);
      System.arraycopy(topHalf, 0, deck, bottomHalf.length, topHalf.length);
    }
  }
  
  public void printDeck() {
    if(deck.length > 0) {
      for(int i = 0; i < deck.length; i++)
        System.out.println(deck[i].toString());
    }
    else
      System.out.println("Deck is empty.");
    System.out.println();
  }
  
  public void printHand() {
    if(hand.length > 0) {
      for(int i = 0; i < hand.length; i++)
        System.out.println(hand[i].toString());
    }
    else
      System.out.println("Hand is empty.");
    System.out.println();
  }
}
