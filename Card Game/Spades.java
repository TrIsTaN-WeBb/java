//Tristan Webb tristan.webb@malad.us
//for CTE software development 1
//instructor Mr Gross

public class Spades extends Card {
    
     //constructor method
     public Spades (String name, int value, String suit, Boolean inDeck){
        super(name, value-1, suit, inDeck); //value decreases by one if the card is a Spade
    }
}
