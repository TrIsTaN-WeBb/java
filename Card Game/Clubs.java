//Tristan Webb tristan.webb@malad.us
//for CTE software development 1
//instructor Mr Gross

public class Clubs extends Card {
    
     //constructor method
     public Clubs (String name, int value, String suit, Boolean inDeck){
        super(name, value-2, suit, inDeck); //value decreases by two if the card is a Club
    }
}
