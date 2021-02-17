# Deck-of-Cards
Deck of 52 standard cards implemented with object-oriented programming. 

Consists of three classes.

Class: Card  
-number: int  
-suite: String  
+Card(newNumber: int, newSuite: String) // Constructor.  
+toString(): String // Method to print Card objects.  

Class: CardDeck  
-deck: Card[] // Holds the 52 Card objects when initialized.  
-hand: Card[] // Holds cards drawn from deck object.  
-cardsInHand: int  
+CardDeck() // Constructor.  
+draw(numDeck: int): void // Removes card(s) from the top of the deck and adds them to hand.  
+shuffle(): void // Shuffles the deck by randomly swapping locations of cards two at a time.  
+cut(): void // Splits the deck into two halves by a random index, then combines the halves in reverse order.  
+printDeck(): void  
+printHand(): void

Class: CardDeckMain  
+main(args: String[])
