public class Card {

  private int number;
  private String suite;

  // Constructor builds a new card object
  // with number and suite parameters.
  public Card(int newNumber, String newSuite) {
    this.number = newNumber;
    this.suite = newSuite;
  }

  // Converts card objects into readable form.
  public String toString() {
    if(this.number == 1) {
      return ("Ace, " + this.suite);
    }
    else if(this.number == 11) {
      return ("Jack, " + this.suite);
    }
    else if(this.number == 12) {
      return ("Queen, " + this.suite);
    }
    else if(this.number = 13) {
      return ("King, " + this.suite);
    }
    else
      return (this.number + ", " + this.suite);
  }
}
