//Tristan Webb tristan.webb@malad.us
//for CTE software development 1
//instructor Mr Gross

public class Hearts extends Card {
    
    //constructor method
    public Hearts (String name, int value, String suit, Boolean inDeck){
        super(name, value+2, suit, inDeck); //value increases by two if the card is a heart
    }
}
